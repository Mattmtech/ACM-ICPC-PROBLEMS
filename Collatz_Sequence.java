package practiceProblems;


public class Collatz_Sequence {

    public static void main(String[] args) {
        System.out.println(Col(1117065));
        System.out.println(Col(1));
        System.out.println(Col(6));
        System.out.println(Col(27));
        System.out.println(Col(1341234558));
        System.out.println(Col(9780657630L));
    }

    public static int Col(long x) {
        int i = 0;
        while (x != 1) {
            if (x % 2 == 0) {
                x =  x / 2 ;
                i++;
            } else if (x % 2 == 1) {
                x = 3 * x + 1;
                i++;
            }
        }
        return i;
    }

}
