package graph;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphAdjMatrix<E> implements Graph<E> {
    private E[] vexs;// 存储图的顶点的一维数组
    private int[][] edges;// 存储图的边的二维数组
    private int numOfVexs;// 顶点的实际数量
    private int maxNumOfVexs;// 顶点的最大数量
    private boolean[] visited;// 判断顶点是否被访问过

    @SuppressWarnings("unchecked")
    public GraphAdjMatrix(int maxNumOfVexs, Class<E> type) {
        this.maxNumOfVexs = maxNumOfVexs;
        edges = new int[maxNumOfVexs][maxNumOfVexs];
        vexs = (E[]) Array.newInstance(type, maxNumOfVexs);
    }

    // 得到顶点的数目
    public int getNumOfVertex() {
        return numOfVexs;
    }

    // 插入顶点
    public boolean insertVex(E v) {
        if (numOfVexs >= maxNumOfVexs)
            return false;
        vexs[numOfVexs++] = v;
        return true;
    }

    // 删除顶点
    public boolean deleteVex(E v) {
        for (int i = 0; i < numOfVexs; i++) {
            if (vexs[i].equals(v)) {
                for (int j = i; j < numOfVexs - 1; j++) {
                    vexs[j] = vexs[j + 1];
                }
                vexs[numOfVexs - 1] = null;
                for (int col = i; col < numOfVexs - 1; col++) {
                    for (int row = 0; row < numOfVexs; row++) {
                        edges[col][row] = edges[col + 1][row];
                    }
                }
                for (int row = i; row < numOfVexs - 1; row++) {
                    for (int col = 0; col < numOfVexs; col++) {
                        edges[col][row] = edges[col][row + 1];
                    }
                }
                numOfVexs--;
                return true;
            }
        }
        return false;
    }

    // 定位顶点的位置
    public int indexOfVex(E v) {
        for (int i = 0; i < numOfVexs; i++) {
            if (vexs[i].equals(v)) {
                return i;
            }
        }
        return -1;
    }

    // 定位指定位置的顶点
    public E valueOfVex(int v) {
        if (v < 0 || v >= numOfVexs)
            return null;
        return vexs[v];
    }

    // 插入边
    public boolean insertEdge(int v1, int v2, int weight) {
        if (v1 < 0 || v2 < 0 || v1 >= numOfVexs || v2 >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        return true;
    }

    // 删除边
    public boolean deleteEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0 || v1 >= numOfVexs || v2 >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        edges[v1][v2] = 0;
        edges[v2][v1] = 0;
        return true;
    }

    // 查找边
    public int getEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0 || v1 >= numOfVexs || v2 >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        return edges[v1][v2];
    }

    @Override
    public String depthFirstSearch(int v) {
        if (v < 0 || v >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        visited = new boolean[numOfVexs];
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(v);
        visited[v] = true;
        while (!stack.isEmpty()) {
            v = stack.pop();
            sb.append(vexs[v] + ",");
            for (int i = numOfVexs - 1; i >= 0; i--) {
                if ((edges[v][i] != 0 && edges[v][i] != Integer.MAX_VALUE)
                        && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : null;
    }

    @Override
    public String breadFirstSearch(int v) {
        if (v < 0 || v >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        visited = new boolean[numOfVexs];
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            v = queue.poll();
            sb.append(vexs[v] + ",");
            for (int i = 0; i < numOfVexs; i++) {
                if ((edges[v][i] != 0 && edges[v][i] != Integer.MAX_VALUE)
                        && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : null;
    }

    @Override
    public int[] dijkstra(int v) {
        if (v < 0 || v >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        boolean[] st = new boolean[numOfVexs];// 默认初始为false
        int[] distance = new int[numOfVexs];// 存放源点到其他点的矩离

        for (int i = 0; i < numOfVexs; i++)
            for (int j = i + 1; j < numOfVexs; j++) {
                if (edges[i][j] == 0) {
                    edges[i][j] = Integer.MAX_VALUE;
                    edges[j][i] = Integer.MAX_VALUE;
                }
            }
        for (int i = 0; i < numOfVexs; i++) {
            distance[i] = edges[v][i];
        }
        st[v] = true;
        // 处理从源点到其余顶点的最短路径
        for (int i = 0; i < numOfVexs; ++i) {
            int min = Integer.MAX_VALUE;
            int index=-1;
            // 比较从源点到其余顶点的路径长度
            for (int j = 0; j < numOfVexs; ++j) {
                // 从源点到j顶点的最短路径还没有找到
                if (st[j]==false) {
                    // 从源点到j顶点的路径长度最小
                    if (distance[j] < min) {
                        index = j;
                        min = distance[j];
                    }
                }
            }
            //找到源点到索引为index顶点的最短路径长度
            if(index!=-1)
                st[index] = true;
            // 更新当前最短路径及距离
            for (int w = 0; w < numOfVexs; w++)
                if (st[w] == false) {
                    if (edges[index][w] != Integer.MAX_VALUE
                            && (min + edges[index][w] < distance[w]))
                        distance[w] = min + edges[index][w];
                }
        }
        return distance;
    }

}
