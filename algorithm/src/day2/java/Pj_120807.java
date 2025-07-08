package day2.java;

public class Pj_120807 {
    public int solution(int num1, int num2) {
        if(num1 == num2) {
            return 1;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Pj_120807 ss = new Pj_120807();
        ss.solution(20, 20);
    }
}
