package code.algorithm;

import code.Display;

import java.util.List;
import java.util.Scanner;

public class MaxSort {

    public static void sort(List<Integer> list, boolean bool) {
        boolean change;
        String string;
        do {
            change = false;

            for (int n = list.size(); n != 0; n--) {

                for (int i = n; i < list.size(); i++) {
                    if (list.get(i) < list.get(i - n)) {
                        swap(list, i, i - n);
                        change = true;
                    }
                }
            }

            if (bool) {
                string = Display.displayList(list);
                Display.clearScreen();
                System.out.println(string);
                Display.waitXSeconds(0.01);
            }
        } while (change);
    }
    public static void swap(List<Integer> list, int index1, int index2) {
        Integer item1 = list.get(index1);
        Integer item2 = list.get(index2);
        list.set(index1, item2);
        list.set(index2, item1);
    }

}
