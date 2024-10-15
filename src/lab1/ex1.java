package lab1;
import java.sql.Array;
import java.util.ArrayList;
public class ex1 {
    public ArrayList<Integer> failedGrades(int[] allGrades){
        ArrayList<Integer> failedGrades = new ArrayList<>();
        for (int i = 0; i < allGrades.length; i++){
            if(allGrades[i] < 40){
                failedGrades.add(allGrades[i]);
            }
        }
        return failedGrades;
    }

    public float average(int[] allGrades){
        float average = 0;
        for (int i = 0; i < allGrades.length; i++){
            average += allGrades[i];
        }
        average = average / allGrades.length;
        return average;
    }

    public int[] roundedGrades(int[] allGrades){
        int[] roundedGrades = new int[allGrades.length];
        for (int i = 0; i < allGrades.length; i++){
            if( allGrades[i] < 38 || allGrades[i] % 5 == 2 || allGrades[i] % 5 == 1
                || allGrades[i] % 5 == 0){
                roundedGrades[i] = allGrades[i];
            }
            else{
                roundedGrades[i] = (allGrades[i] / 5 + 1) * 5;
            }
        }
        return roundedGrades;
    }

    public int maxRounded(int[] allGrades){
        int[] rounded = roundedGrades(allGrades);
        int max = rounded[0];
        for (int i = 1; i < rounded.length; i++){
            if(rounded[i] > max){
                max = rounded[i];
            }
        }
        return max;
    }


}
