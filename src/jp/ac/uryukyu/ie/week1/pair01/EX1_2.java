package jp.ac.uryukyu.ie.week1.pair01;

public class EX1_2 {
    String str;

    static void get_string(String str) {
        String source = str;
        String[] targets = source.split("");
        String result = targets[1].concat(targets[3]).concat(targets[5]).concat(targets[7]);
        System.out.println(result);
    }
}
