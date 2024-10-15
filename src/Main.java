//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import lab1.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ex1 ex1 = new ex1();
        int[] test = new int[]{29, 37, 38, 41, 84, 67};
//        ArrayList<Integer> final = ex1.failedGrades(new int[]{40, 50, 38, 70});
//        for(int i = 0; i< ex1.failedGrades(new int[40, 50, 38, 70]).length; i++){
//            System.out.println(ex1.failedGrades(new int[]{40, 50, 38, 70})[i]);
//        }
//        System.out.println(ex1.failedGrades(new ArrayList<Integer>{40, 50, 38, 70}));
//        system.ex1.failedGrades([40, 50, 38, 70]);

        for(int i : ex1.roundedGrades(test)){
            System.out.println(i);
        }
        System.out.println(ex1.maxRounded(test));
        System.out.println(ex1.average(test));
        System.out.printf("%.2f%n",ex1.average(test));
    }
}