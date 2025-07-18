package week3.day5.java;

public class Pj_12934 {

    public long solution(long n) {
        double sqrt = Math.sqrt(n);

        if (sqrt == (long) sqrt) {
            long sum = (long) sqrt + 1;
            return (long) Math.pow(sum, 2);
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Pj_12934 ss = new Pj_12934();
        ss.solution(121);
    }
}
