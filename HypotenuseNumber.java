package practiceProblems;


import java.util.ArrayList;

public class HypotenuseNumber {

    public static void main(String[] args) {

        Hypnum(5);
        Hypnum(6);
        Hypnum(7);
        Hypnum(10);
        Hypnum(2147483647);
        Hypnum(2147483645);
        Hypnum(2147483642);
        Hypnum(2147483627);
        Hypnum(1927738275);
        Hypnum(1927738291);
    }

    public static ArrayList<Integer> factor(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        int i = 5;
        int temp = n;
        while (i <= temp) {
            if (n % i == 0) {
                factors.add(i);
                temp = n / i;
            }

            i++;
        }
        return removeNeg(factors);
    }

    public static ArrayList<Integer> removeNeg(ArrayList<Integer> n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i) > 0) {
                temp.add(n.get(i));
            }
        }
        return temp;
    }

    public static void Hypnum(int n) {
        ArrayList<Integer> x = factor(n);
        if (calc(x)) {
            System.out.println(n+" "+"yes");
        } else {
            System.out.println(n+" "+"no");
        }
    }

    public static boolean calc(ArrayList<Integer> n) {
        for (int i = 0; i < n.size(); i++) {
            double x = (n.get(i) - 1) / 4.0;
            if (x == (int) x) {
                return true;
            }
        }
        return false;
    }

}

