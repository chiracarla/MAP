package lab1;

import java.sql.Array;
import java.util.ArrayList;

public class ex1 {
    public int[] failedGrades(int[] allGrades){
        int[] failedGrades = new int[allGrades.length];
        int j = 0;
        for (int i = 0; i < allGrades.length; i++){
            if(allGrades[i] < 40){
                failedGrades[j] = allGrades[i];
                j++;
            }
        }
        if(j < allGrades.length){
            int[] newFailedGrades = new int[j];//resize
            for (int i = 0; i < j; i++){
                newFailedGrades[i] = failedGrades[i];
            }
            return newFailedGrades;
        }
        return failedGrades;
    }

    public float average(int[] allGrades) {//average class grade value
        float average = 0;
        for (int i = 0; i < allGrades.length; i++) {
            average += allGrades[i];
        }
        average = average / allGrades.length;
        return average;
    }

    public int[] roundedGrades(int[] allGrades) {
        int[] roundedGrades = new int[allGrades.length];
        for (int i = 0; i < allGrades.length; i++) {
            if (allGrades[i] < 38 || allGrades[i] % 5 <= 2) {
                roundedGrades[i] = allGrades[i];
            } else {
                roundedGrades[i] = (allGrades[i] / 5 + 1) * 5;
            }
        }
        return roundedGrades;
    }

    public int maxRounded(int[] allGrades) {
        int[] rounded = roundedGrades(allGrades);
        int max = rounded[0];
        for (int i = 1; i < rounded.length; i++) {
            if (rounded[i] > max) {
                max = rounded[i];
            }
        }
        return max;
    }


}
