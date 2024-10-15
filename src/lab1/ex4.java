package lab1;

public class ex4 {
    public int cheapest(int[] keyboard){
        int min = keyboard[0];
        for(int i : keyboard){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public int mostExpensive(int[] keyboard, int[] usb){
        int max = keyboard[0];
        for(int i : keyboard){
            if(i > max){
                max = i;
            }
        }
        for(int i : usb){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public int expensive(int[] keyboard, int budget){
        int max = 0;
        for(int i : keyboard){
            if(i > max && i <= budget){
                max = i;
            }
        }
        return max;
    }
}
