package code;

import java.util.List;

public class Display {

    public static void waitXSeconds(double secs) {
        try {
            Thread.sleep((long) (secs * 1000L));

        } catch (InterruptedException ignored) {

        }
    }

    public static String displayList(List<Integer> list) {

        String string = "";

        for(Integer integer : list) {
            string += String.format("\u001b[38;5;" + (integer + 20) + "m%" + (integer + 1) + "s\n", " ");
        }

        return string.replace(" ", "█");
    }

    public static void clearScreen() {

        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception IOException) {
            System.out.println("IOException");
        }
    }

}
