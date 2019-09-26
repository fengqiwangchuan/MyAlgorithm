package ali;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /** 请完成下面这个函数，实现题目要求的功能 **/
    /**
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来
     **/
    public static String measureDistance(List<Double> xList, List<Double> yList, double x, double y) {
        int[] arr = new int[xList.size()];
        Boolean flag = false;
        for (int i = 0; i < xList.size(); i++) {
            if (x < xList.get(i) && y < yList.get(i)) {
                flag = true;
            }
            arr[i] = (int) Math.round(Math.abs((y - yList.get(i)) * (y - yList.get(i)) + (x - xList.get(i) * (x - xList.get(i)))));
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        String result = "";
        if (flag) {
            result = "yes,0";
        } else {
            result = "no," + min;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        //(x,y)为小广所在的位置
        double x = Double.parseDouble(line.split(",")[0]);
        double y = Double.parseDouble(line.split(",")[1]);

        line = in.nextLine();
        //xList记录了多边形n个点的x坐标,yList记录了多边形n个点的y坐标
        List<Double> xList = new ArrayList<>();
        List<Double> yList = new ArrayList<>();
        String[] array = line.split(",");
        for (int i = 0; i < array.length; i++) {
            xList.add(Double.parseDouble(array[i]));
            yList.add(Double.parseDouble(array[i + 1]));
            i++;
        }
        in.close();
        System.out.println(measureDistance(xList, yList, x, y));
    }
}
