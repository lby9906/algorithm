package day4.java;

public class Pj_12937 {

    public String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        }else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Pj_12937 ss = new Pj_12937();
        ss.solution(3);
    }
}
