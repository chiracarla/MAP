package lab1;

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
        return failedGrades;
    }


}
