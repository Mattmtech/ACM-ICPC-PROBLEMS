package practiceProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramPyramid {

    public static void main(String[] args) {
        String[] x = {"SPAIN", "PIANOS", "PEN", "SNIP", "PAINS", "SNIPER", "PIN", "PINE"};
        String[] y = {"PIN", "PIANOS", "PEN", "SNIPER"};
        AnaPyr(x, y);

    }

    public static void AnaPyr(String[] dict, String[] pairs) {
        String[] ordered = InsSort(dict);
        for (int i = 0; i < pairs.length; i += 2) {
            int state = 0;
            String end = pairs[i];
            String begin = pairs[i + 1];
            while (end != begin) {
                String temp = begin;
                ArrayList<String> words = letters(dict, begin.length() - 1);
                for (int w = 0; w < words.size(); w++) {
                    if (compare(dict, begin, words.get(w))) {
                        begin = getWord(dict, begin, words.get(w));
                        break;
                    }
                }
                if (temp == begin) {
                    state++;
                    break;
                }
            }
            if (state == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }

    public static String[] InsSort(String[] input) {
        String temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j].length() > input[j - 1].length()) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }

    public static boolean compare(String[] dict, String x1, String x2) {

        ArrayList<String> word = letters(dict, x2.length());
        if (word.isEmpty()) {
            return false;
        }
        for (int i = 0; i < word.size(); i++) {
            if (splitComp(x1,word.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<String> letters(String[] dict, int length) {
        ArrayList<String> word = new ArrayList<>();
        for (int i = 0; i < dict.length; i++) {
            if (dict[i].length() == length) {
                word.add(dict[i]);
            }
        }
        return word;
    }

    public static String getWord(String[] dict, String x1, String x2) {
        String word1 = "";
        ArrayList<String> word = letters(dict, x2.length());
        for (int i = 0; i < word.size(); i++) {

            if (splitComp(x1, word.get(i))) {
                word1 = word.get(i);
                break;
            }
        }
        return word1;
    }

    public static boolean splitComp(String x1, String x2) {
        char[] first = x1.toCharArray();
        char[] second = x2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        int max = Math.max(first.length, second.length);
        int count = 0;
        if (max == first.length) {
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < second.length; j++) {
                    if (first[i] == second[j]) {
                        count++;
                        break;                        
                    }

                }

            }
        }
        if (max == second.length) {
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < first.length; j++) {
                    if (second[i] == first[j]) {
                        count++;
                        break;
                    }

                }

            }
        }
        return max-1==count;
    }
}
