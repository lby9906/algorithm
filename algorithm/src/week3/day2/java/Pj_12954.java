package week3.day2.java;

public class Pj_12954 {
    public long[] solution(int x, int n) {
        long[] sum = new long[n];
        for (int i=0; i <= n-1; i++) {
            sum[i] = (long) x*(i+1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Pj_12954 ss = new Pj_12954();
        ss.solution(-4, 2);
    }
}
