import code.Display;
import code.algorithm.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RunFast {

    public static void main(String[] args) {

        long seconds = System.currentTimeMillis();

        Combo(true);
        Inter(true);
        Max(true);
        Up(true);
        Down(true);

        System.out.println("Runtime : " + (((System.currentTimeMillis() - seconds) / 1000F)));

        (new Scanner(System.in)).nextLine();

    }

    private static void Inter(boolean bool) {

        long average = 0;
        for (int i = 0; i < 100000; i++) {
            long past = System.nanoTime();

            List<Integer> list = part1();
            InterChangeSort.sort(list, bool);

            average += System.nanoTime() - past;
        }
        System.out.println("Average Inter Runtime : " + ((average / (float) 100000)));
    }

    private static void Combo(boolean bool) {

        long average = 0;
        for (int i = 0; i < 100000; i++) {
            long past = System.nanoTime();

            List<Integer> list = part1();
            ComboSort.sort(list, bool);

            average += System.nanoTime() - past;
        }
        System.out.println("Average Combo Runtime : " + ((average / (float) 100000)));
    }

    private static void Max(boolean bool) {
        long average = 0;
        for (int i = 0; i < 100000; i++) {
            long past = System.nanoTime();

            List<Integer> list = part1();
            MaxSort.sort(list, bool);

            average += System.nanoTime() - past;
        }
        System.out.println("Average Down Runtime : " + ((average / (float) 100000)));
    }

    private static void Down(boolean bool) {
        long average = 0;
        for (int i = 0; i < 100000; i++) {
            long past = System.nanoTime();

            List<Integer> list = part1();
            DownSort.sort(list, bool);

            average += System.nanoTime() - past;
        }
        System.out.println("Average Max Runtime : " + ((average / (float) 100000)));

    }

    private static void Up(boolean bool) {
        long average = 0;
        for (int i = 0; i < 100000; i++) {
            long past = System.nanoTime();

            List<Integer> list = part1();
            UpSort.sort(list, bool);

            average += System.nanoTime() - past;
        }
        System.out.println("Average Up Runtime : " + ((average / (float) 100000)));
    }

    public static List<Integer> part1() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }

}
