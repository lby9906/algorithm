package week3.day1.java;

public class Pj_87389 {
    public int solution(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Pj_87389 ss = new Pj_87389();
        ss.solution(12);
    }
}
