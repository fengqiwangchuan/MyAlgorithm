package _多线程;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Demo {
    public static void main(String[] args) {
        BlockingDeque<BlockingDeque<String>> deque = new LinkedBlockingDeque<>();
        BlockingDeque<String> task1 = new LinkedBlockingDeque<>();
        task1.add("1_1_sh");
        task1.add("1_2_sh");
        task1.add("1_3_sh");
        task1.add("1_4_sh");
        task1.add("1_5_sh");
        task1.add("1_6_sh");
        task1.add("1_7_sh");
        deque.add(task1);

        BlockingDeque<String> task2 = new LinkedBlockingDeque<>();
        task2.add("2_1_sh");
        task2.add("2_2_sh");
        task2.add("2_3_sh");
        task2.add("2_4_sh");
        task2.add("2_5_sh");
        task2.add("2_6_sh");
        task2.add("2_7_sh");
        task2.add("2_8_sh");
        deque.add(task2);

        BlockingDeque<String> task3 = new LinkedBlockingDeque<>();
        task3.add("3_1_sh");
        task3.add("3_2_sh");
        task3.add("3_3_sh");
        task3.add("3_4_sh");
        task3.add("3_5_sh");
        task3.add("3_6_sh");
        task3.add("3_7_sh");
        deque.add(task3);

        BlockingDeque<String> task4 = new LinkedBlockingDeque<>();
        task4.add("4_1_sh");
        task4.add("4_2_sh");
        task4.add("4_3_sh");
        task4.add("4_4_sh");
        task4.add("4_5_sh");
        task4.add("4_6_sh");
        task4.add("4_7_sh");
        task4.add("4_8_sh");
        deque.add(task4);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        while (!deque.isEmpty()) {
            BlockingDeque<String> task = deque.poll();
            executorService.execute(() -> {
                while (!task.isEmpty()) {
                    execCmd(task.poll());
                }
            });
        }
        executorService.shutdown();
    }

    private static void execCmd(String sh) {
        System.out.println("exec: " + sh);
    }
}
