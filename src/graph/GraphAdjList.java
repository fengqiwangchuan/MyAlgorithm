package graph;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphAdjList<E> implements Graph<E> {
    // 邻接表中表对应的链表的顶点
    private static class ENode {
        int adjvex; // 邻接顶点序号
        int weight;// 存储边或弧相关的信息，如权值
        ENode nextadj; // 下一个邻接表结点

        public ENode(int adjvex, int weight) {
            this.adjvex = adjvex;
            this.weight = weight;
        }
    }

    // 邻接表中表的顶点
    private static class VNode<E> {
        E data; // 顶点信息
        ENode firstadj; // //邻接表的第1个结点
    }

    ;

    private VNode<E>[] vexs; // 顶点数组
    private int numOfVexs;// 顶点的实际数量
    private int maxNumOfVexs;// 顶点的最大数量
    private boolean[] visited;// 判断顶点是否被访问过

    @SuppressWarnings("unchecked")
    public GraphAdjList(int maxNumOfVexs) {
        this.maxNumOfVexs = maxNumOfVexs;
        vexs = (VNode<E>[]) Array.newInstance(VNode.class, maxNumOfVexs);
    }

    // 得到顶点的数目
    public int getNumOfVertex() {
        return numOfVexs;
    }

    // 插入顶点
    public boolean insertVex(E v) {
        if (numOfVexs >= maxNumOfVexs)
            return false;
        VNode<E> vex = new VNode<E>();
        vex.data = v;
        vexs[numOfVexs++] = vex;
        return true;
    }

    // 删除顶点
    public boolean deleteVex(E v) {
        for (int i = 0; i < numOfVexs; i++) {
            if (vexs[i].data.equals(v)) {
                for (int j = i; j < numOfVexs - 1; j++) {
                    vexs[j] = vexs[j + 1];
                }
                vexs[numOfVexs - 1] = null;
                numOfVexs--;
                ENode current;
                ENode previous;
                for (int j = 0; j < numOfVexs; j++) {
                    if (vexs[j].firstadj == null)
                        continue;
                    if (vexs[j].firstadj.adjvex == i) {
                        vexs[j].firstadj = null;
                        continue;
                    }
                    current = vexs[j].firstadj;
                    while (current != null) {
                        previous = current;
                        current = current.nextadj;
                        if (current != null && current.adjvex == i) {
                            previous.nextadj = current.nextadj;
                            break;
                        }
                    }
                }
                for (int j = 0; j < numOfVexs; j++) {
                    current = vexs[j].firstadj;
                    while (current != null) {
                        if (current.adjvex > i)
                            current.adjvex--;
                        current = current.nextadj;
                    }
                }
                return true;
            }
        }
        return false;
    }

    // 定位顶点的位置
    public int indexOfVex(E v) {
        for (int i = 0; i < numOfVexs; i++) {
            if (vexs[i].data.equals(v)) {
                return i;
            }
        }
        return -1;
    }

    // 定位指定位置的顶点
    public E valueOfVex(int v) {
        if (v < 0 || v >= numOfVexs)
            return null;
        return vexs[v].data;
    }

    // 插入边
    public boolean insertEdge(int v1, int v2, int weight) {
        if (v1 < 0 || v2 < 0 || v1 >= numOfVexs || v2 >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        ENode vex1 = new ENode(v2, weight);

        // 索引为index1的顶点没有邻接顶点
        if (vexs[v1].firstadj == null) {
            vexs[v1].firstadj = vex1;
        }
        // 索引为index1的顶点有邻接顶点
        else {
            vex1.nextadj = vexs[v1].firstadj;
            vexs[v1].firstadj = vex1;
        }
        ENode vex2 = new ENode(v1, weight);
        // 索引为index2的顶点没有邻接顶点
        if (vexs[v2].firstadj == null) {
            vexs[v2].firstadj = vex2;
        }
        // 索引为index1的顶点有邻接顶点
        else {
            vex2.nextadj = vexs[v2].firstadj;
            vexs[v2].firstadj = vex2;
        }
        return true;
    }

    // 删除边
    public boolean deleteEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0 || v1 >= numOfVexs || v2 >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        // 删除索引为index1的顶点与索引为index2的顶点之间的边
        ENode current = vexs[v1].firstadj;
        ENode previous = null;
        while (current != null && current.adjvex != v2) {
            previous = current;
            current = current.nextadj;
        }
        if (current != null)
            previous.nextadj = current.nextadj;
        // 删除索引为index2的顶点与索引为index1的顶点之间的边
        current = vexs[v2].firstadj;
        while (current != null && current.adjvex != v1) {
            previous = current;
            current = current.nextadj;
        }
        if (current != null)
            previous.nextadj = current.nextadj;
        return true;
    }

    // 得到边
    public int getEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0 || v1 >= numOfVexs || v2 >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        ENode current = vexs[v1].firstadj;
        while (current != null) {
            if (current.adjvex == v2) {
                return current.weight;
            }
            current = current.nextadj;
        }
        return 0;
    }

    // 深度优先搜索遍历
    public String depthFirstSearch(int v) {
        if (v < 0 || v >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        visited = new boolean[numOfVexs];
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(v);
        visited[v] = true;
        ENode current;
        while (!stack.isEmpty()) {
            v = stack.pop();
            sb.append(vexs[v].data + ",");
            current = vexs[v].firstadj;
            while (current != null) {
                if (!visited[current.adjvex]) {
                    stack.push(current.adjvex);
                    visited[current.adjvex] = true;
                }
                current = current.nextadj;
            }
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : null;
    }

    // 广度优先搜索遍历
    public String breadFirstSearch(int v) {
        if (v < 0 || v >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        visited = new boolean[numOfVexs];
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(v);
        visited[v] = true;
        ENode current;
        while (!queue.isEmpty()) {
            v = queue.poll();
            sb.append(vexs[v].data + ",");
            current = vexs[v].firstadj;
            while (current != null) {
                if (!visited[current.adjvex]) {
                    queue.offer(current.adjvex);
                    visited[current.adjvex] = true;
                }
                current = current.nextadj;
            }
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : null;
    }


    // 实现Dijkstra算法
    public int[] dijkstra(int v) {
        if (v < 0 || v >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        boolean[] st = new boolean[numOfVexs];// 默认初始为false
        int[] distance = new int[numOfVexs];// 存放源点到其他点的距离
        for (int i = 0; i < numOfVexs; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        ENode current;
        current = vexs[v].firstadj;
        while (current != null) {
            distance[current.adjvex] = current.weight;
            current = current.nextadj;
        }
        distance[v] = 0;
        st[v] = true;
        // 处理从源点到其余顶点的最短路径
        for (int i = 0; i < numOfVexs; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            // 比较从源点到其余顶点的路径长度
            for (int j = 0; j < numOfVexs; j++) {
                // 从源点到j顶点的最短路径还没有找到
                if (st[j] == false) {
                    // 从源点到j顶点的路径长度最小
                    if (distance[j] < min) {
                        index = j;
                        min = distance[j];
                    }
                }
            }
            // 找到源点到索引为index顶点的最短路径长度
            if (index != -1)
                st[index] = true;
            // 更新当前最短路径及距离
            for (int w = 0; w < numOfVexs; w++)
                if (st[w] == false) {
                    current = vexs[w].firstadj;
                    while (current != null) {
                        if (current.adjvex == index)
                            if ((min + current.weight) < distance[w]) {
                                distance[w] = min + current.weight;
                                break;
                            }
                        current = current.nextadj;
                    }
                }
        }
        return distance;
    }

}
