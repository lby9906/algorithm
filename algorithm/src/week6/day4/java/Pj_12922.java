package week6.day4.java;

public class Pj_12922 {

    public String solution(int n) {
        String result = "";

        for (int i=0; i<n;i ++) {
            if (i % 2 == 0) {
                result += "수";
            }else {
                result += "박";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Pj_12922 ss = new Pj_12922();
        ss.solution(6);
    }
}
