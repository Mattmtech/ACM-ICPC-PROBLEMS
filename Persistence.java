package practiceProblems;

import java.util.Arrays;

public class Persistence {

    public static void main(String[] args) {
        pers(5);
        pers(10);
        pers(25);
        pers(39);
        pers(679);
        pers(6788);
        pers(26888999);
    }

    public static void pers(int x) {
        int i = 0;
        int y = x;
        while (y>9) {
            String []Str = parseStr(y);
            int []num = parseInt(Str);
            y = Mult(num);
            i++;
        }
        System.out.println(x + " " + i);
    }

    public static String[] parseStr(int x) {
        String q = Integer.toString(x);
        String[] y = q.split("");
        return y;
    }

    public static int[] parseInt(String[] x) {
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i] = Integer.parseInt(x[i]);
        }
        return y;
    }

    public static int Mult(int[] x) {
        int y = x[0];
        for (int i = 1; i < x.length; i++) {
            y = x[i] * y;
        }
        return y;
    }
}
