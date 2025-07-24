package week4.day4.java;

public class Pj_12912 {

    public long solution(int a, int b) {
        long result = 0;
        int max = 0;
        int min = 0;

        if (a > b) {
            max = a;
            min = b;
        }else if (b > a) {
            max = b;
            min = a;
        }else {
            return a;
        }

        for (int i=min; i<=max; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        Pj_12912 ss = new Pj_12912();
        ss.solution(3, 3);
    }
}
