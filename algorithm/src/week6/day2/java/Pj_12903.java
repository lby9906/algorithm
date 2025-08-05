package week6.day2.java;

public class Pj_12903 {

    public String solution(String s) {
        String result = "";

        String[] split = s.split("");

        if (split.length % 2 == 0) {
            result += split[split.length / 2 - 1];
            result += split[split.length / 2];
        } else {
            result += split[split.length / 2];
        }

        return result;
    }

    public static void main(String[] args) {
        Pj_12903 ss = new Pj_12903();
        ss.solution("qwer");
    }
}
