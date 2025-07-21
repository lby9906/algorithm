package week4.day1.java;

import java.util.Arrays;
import java.util.Collections;

public class Pj_12933 {

    public long solution(long n) {
        long result = 0;
        String save = "";

        String str = String.valueOf(n);
        String[] split = str.split("");
        Arrays.sort(split, Collections.reverseOrder());
        for (int i=0; i< split.length; i++) {
            save += split[i];
        }
        result = Long.valueOf(save);
        return result;
    }

    public static void main(String[] args) {
        Pj_12933 ss = new Pj_12933();
        ss.solution(118372);
    }
}
