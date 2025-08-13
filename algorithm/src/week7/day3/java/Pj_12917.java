package week7.day3.java;

import java.util.Arrays;

public class Pj_12917 {

    public String solution(String s) {
        String result = "";

        String[] split = s.split("");
        Arrays.sort(split);

        for (int i= split.length-1; i>=0; i--) {
            result += split[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Pj_12917 ss = new Pj_12917();
        ss.solution("Zbcdefg");
    }
}
