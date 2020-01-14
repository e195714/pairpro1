package jp.ac.uryukyu.ie.week1.pair01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        char[] chars = "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics.".toCharArray();
        int num = 0;
        int index = 0;
        int[] nums;
        for(char c: chars){
            String s = String.valueOf(c);
            if(" ".equals(s)){
                num = 0;
                index++;
            }else{
                num++;
            }
        }
    }
}
