import code.Display;
import code.algorithm.DownSort;
import code.algorithm.InterChangeSort;
import code.algorithm.MaxSort;
import code.algorithm.UpSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        while (true) {

            Up(true);
            Down(true);
            Inter(true);

        }
    }

    private static void Inter(boolean bool) {
        List<Integer> list = part1();
        InterChangeSort.sort(list, bool);
    }

    private static void Max(boolean bool) {
        List<Integer> list = part1();
        MaxSort.sort(list, bool);
    }

    private static void Down(boolean bool) {
        List<Integer> list = part1();
        DownSort.sort(list, bool);
    }

    private static void Up(boolean bool) {
        List<Integer> list = part1();
        UpSort.sort(list, bool);
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

