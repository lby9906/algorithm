package week4.day5.java;

public class Pj_12943 {

    public int solution(int num) {
        long n = num;
        if (n == 1) {
            return 0;
        }

        for (int i = 0; i < 500; i++) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }

            if (n == 1) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Pj_12943 ss = new Pj_12943();
        ss.solution(16);
    }
}
