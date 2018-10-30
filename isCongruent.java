package practiceProblems;

import java.math.MathContext;
public class isCongruent {
    public static void main(String[] args)
    {
        isCongruent(3,4);
        isCongruent(3/2,20/3);
        isCongruent(3/5,4/5);
        isCongruent(1,10);
                
    }
    
    public static boolean isRational(double x) {
        double p = 1;
        double q = 1;
        while (p < 999999999) {
            while (q < 999999999) {
                if (p / q == x) {
                    return true;
                } else {
                    q++;
                }
            }
            p++;
            q=1;
        }
        return false;
    }
    
    public static double findC(double a, double b)
    {
        return Math.sqrt(a*a+b*b);
    }
    
    public static double areaTri(double a, double b)
    {
        return a*(b/2);
    }
    
    public static void isCongruent(double a, double b)
    {
        double c=findC(a,b);
        double n=areaTri(a,b);
        if(!(isRational(a) && isRational(b) && isRational(c)))
        {
            System.out.println(isRational(c));
            System.out.println("no");
        }
        
        else
            System.out.println(n);
    }
}

