//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import lab1.*;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ex1 ex1 = new ex1();
        int[] test = new int[]{29, 37, 38, 41, 84, 67};

        for (int i : ex1.failedGrades(test)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : ex1.roundedGrades(test)) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(ex1.maxRounded(test));
        System.out.println(ex1.average(test));
        System.out.printf("%.2f%n", ex1.average(test));

        ex2 ex2 = new ex2();
        int[] test2 = new int[]{4, 8, 3, 10, 17};
        System.out.println(ex2.min(test2));
        System.out.println(ex2.max(test2));
        System.out.println(ex2.maxSum(test2));
        System.out.println(ex2.minSum(test2));

        ex3 ex3 = new ex3();
        int[] nr1 = new int[]{1, 2, 0, 0, 0, 0};
        int[] nr2 = new int[]{8, 3, 0, 0, 0, 0};
        for (int i : ex3.sum(nr1, nr2)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : ex3.dif(nr2, nr1)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : ex3.mul(nr2, 2)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : ex3.div(nr1, 3)) {
            System.out.print(i + " ");
        }
        System.out.println();

        ex4 ex4 = new ex4();
        int[] key = new int[]{60};
        int[] usb = new int[]{8, 12};
        System.out.println(ex4.expensive( usb, 20));
        System.out.println(ex4.afford(key, usb, 60));
    }
}