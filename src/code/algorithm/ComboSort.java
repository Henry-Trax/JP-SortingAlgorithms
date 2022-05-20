package code.algorithm;

import code.Display;

import java.util.List;

public class ComboSort {

    public static void sort(List<Integer> list, boolean bool) {
        boolean change;
        String string;

        int i = list.size() - 1;

        do {
            change = false;

            for (int cord = 0; cord < list.size() - i; cord++) {

                if (list.get(cord) < list.get(cord + i)) {
                     swap(list, cord, cord + i);
                }
            }

            if (bool) {
                string = Display.displayList(list);
                Display.clearScreen();
                System.out.println(string);
            }

            i--;

        } while (i != 0);
    }

    public static void swap(List<Integer> list, int index1, int index2) {

        Integer item1 = list.get(index1);
        Integer item2 = list.get(index2);

        list.set(index1, item2);
        list.set(index2, item1);

    }
}
