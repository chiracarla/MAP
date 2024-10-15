package lab1;

public class ex4 {
    public int cheapest(int[] keyboard) {
        int min = keyboard[0];
        for (int i : keyboard) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int mostExpensive(int[] keyboard, int[] usb) {
        int max = keyboard[0];
        for (int i : keyboard) {
            if (i > max) {
                max = i;
            }
        }
        for (int i : usb) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int expensive(int[] keyboard, int budget) {
        int max = 0;
        for (int i : keyboard) {
            if (i > max && i <= budget) {
                max = i;
            }
        }
        return max;
    }

    public int afford(int[] keyboard, int[] usb, int budget) {//Obs: sunt ordonate multimile
        int max = 0;
        int k = keyboard[0];
        int u = usb[0];
        int lastk = 0, lastu = 0, ki = 0, ui = 0;
        while (k + u <= budget && ki < keyboard.length && ui < usb.length) {//ca un produs cartezian
            lastk = k;
            lastu = u;
            ui++;
            if (ui == usb.length) {
                ki++;
                ui = 0;
            }
            k = keyboard[ki];
            u = usb[ui];
        }
        if (ki == keyboard.length || ui == usb.length) {
            if ((lastk + lastu) <= budget && (lastk + lastu) > 0) {
                return lastu + lastk;
            } else {
                return -1;
            }
        } else if ((lastk + lastu) <= budget && (lastk + lastu) > 0) {
            return lastu + lastk;
        }
        return -1;
    }
}
