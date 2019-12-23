package jp.ac.uryukyu.ie.week1.pair01;

public class EX1_1 {
    String str;

    static void get_reverse(String str) {
        String source = str; // step 1
        char[] target = source.toCharArray(); // step 2
        System.out.println("before: " + source);

        // step 3
        int i, j;
        for (i = source.length() - 1, j = 0; i >= 0; i--) {
            char c = source.charAt(i);
            target[j] = c;
            j++;
        }

        // step 4
        String result = String.valueOf(target);
        System.out.println("after: " + result);
    }
}

