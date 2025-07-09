package day3;

public class Pj_120806 {
    public int solution(int num1, int num2) {
        double num = 1000;
        double result = (double) num1/num2*num;
        int re = (int) result;
        return re;
    }

    public static void main(String[] args) {
        Pj_120806 ss = new Pj_120806();
        ss.solution(3, 2);
    }
}
