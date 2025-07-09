package day3;

public class Pj_120831 {

    public int solution(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            if (i%2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Pj_120831 ss = new Pj_120831();
        ss.solution(10);
    }
}
