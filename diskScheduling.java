package practiceProblems;


import java.util.ArrayList;
import java.util.List;


public class diskScheduling {

    public static void main(String[] args) {
        double[] input = new double[12];
        input[0] = 4;
        input[1] = 0.01;
        input[2] = 20;
        input[3] = 100;
        input[4] = 5;
        input[5] = 40;
        input[6] = 10;
        input[7] = 600;
        input[8] = 12;
        input[9] = 70;
        input[10] = 24;
        input[11] = 0;
        ArrayList<Double> x = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            x.add(input[i]);
        }
        System.out.println(calcu(x));

    }

    public static double calcu(ArrayList<Double> k) {
        double breaker = k.get(0);
        double speed = k.get(1);
        double headloc = k.get(2);
        double ttracker = 0;
        ArrayList<Double> loc = new ArrayList<Double>();
        ArrayList<Double> dead = new ArrayList<Double>();
        int q = 3;
        int l = 0;
        while (k.get(q) != 0) {
            loc.add(k.get(q));
            dead.add(k.get(q + 1));
            q += 2;
        }
        
        while (l < breaker) {
            double min = Math.abs(loc.get(0) - headloc);
            int index = 0;
            for (int i = 0; i < loc.size(); i++) {
                if (Math.abs(loc.get(i) - headloc) < min) {
                    min = Math.abs(loc.get(i) - headloc);

                    index = i;
                    headloc = loc.get(i);
                }
                
            }
            headloc=loc.get(index);
            loc.remove(index);

            ttracker = ttracker + (speed * min);
            if (ttracker > dead.get(index)) {
                return -1;
            }
            dead.remove(index);
            l++;
        }
        return ttracker;
    }

}

