package week3.day1.java;

import java.util.ArrayList;
import java.util.List;

public class Pj_12928 {

    public int solution(int n) {
        int result = 0;
        List<Integer> intArray = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                intArray.add(i);
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Pj_12928 ss = new Pj_12928();
        ss.solution(12);
    }
}
