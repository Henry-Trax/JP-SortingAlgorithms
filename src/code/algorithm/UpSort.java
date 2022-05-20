package code.algorithm;

import code.Display;

import java.util.List;

public class UpSort {

    public static void sort(List<Integer> list, boolean bool) {
        boolean change;
        String string;

        do {
            change = false;

            for (int i = 0; i < list.size() - 1; i++) {

                if (list.get(i) < list.get(i + 1)) {
                    swap(list, i, i + 1);
                    change = true;
                }
            }

            if (bool) {
                string = Display.displayList(list);
                Display.clearScreen();
                System.out.println(string);
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
