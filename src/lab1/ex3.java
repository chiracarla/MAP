package lab1;

public class ex3 {
    public int[] sum(int[] num1, int[] num2) { //tb folosit carrry si la sfarsit daca s prea multe cifre tb copiat nr
        int carry = 0;
        int[] sum = new int[num1.length];
        for (int i = num1.length - 1; i >= 0; i--) {
            sum[i] = num1[i] + num2[i] + carry;
            if (sum[i] >= 10) {
                carry = sum[i] / 10;
                sum[i] = sum[i] % 10;
            } else {
                carry = 0;
            }
        }
        if (carry > 0) {
            int[] sumAux = new int[num1.length + 1];
            sumAux[0] = carry;
            for (int i = 0; i < sum.length; i++) {
                sumAux[i + 1] = sum[i];
            }
            return sumAux;
        }
        return sum;
    }

    public int[] dif(int[] num1, int[] num2) {//java are vectori de marime statica deci se copiaza
        int carry = 0;
        int[] dif = new int[num1.length];
        for (int i = num1.length - 1; i >= 0; i--) {
            dif[i] = num1[i] - num2[i] + carry;
            if (dif[i] < 0) {
                carry = -1;
                dif[i] = dif[i] + 10;
            } else {
                carry = 0;
            }
        }
        if (dif[0] == 0) {
            int[] difAux = new int[num1.length - 1];
            for (int i = 1; i < dif.length; i++) {
                difAux[i - 1] = dif[i];
            }
            return difAux;
        }
        return dif;
    }

    public int[] mul(int[] num, int digit) {
        int carry = 0;
        int[] mul = new int[num.length];
        for (int i = num.length - 1; i >= 0; i--) {
            mul[i] = num[i] * digit + carry;
            if (mul[i] >= 10) {
                carry = mul[i] / 10;
                mul[i] = mul[i] % 10;
            } else {
                carry = 0;
            }
        }
        if (carry > 0) {
            int[] sumAux = new int[num.length + 1];
            sumAux[0] = carry;
            for (int i = 0; i < mul.length; i++) {
                sumAux[i + 1] = mul[i];
            }
            return sumAux;
        }
        return mul;
    }

    public int[] div(int[] num, int digit) {
        int rest = 0;
        int[] div = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            div[i] = 10 * rest + num[i];
            rest = div[i] % digit;
            div[i] = div[i] / digit;
        }
        if (div[0] == 0) {
            int[] divAux = new int[num.length - 1];
            for (int i = 1; i < div.length; i++) {
                divAux[i - 1] = div[i];
            }
            return divAux;
        }
        return div;
    }
}
