package week5.day4.java;

public class Pj_12948 {

    public String solution(String phone_number) {
        String result = "";

        String[] split = phone_number.split("");
        for (int i=0; i< split.length-4; i++) {
            result += split[i].replaceAll("[0-9]", "*");
        }

        for (int i=split.length-4; i< split.length; i++) {
            result += split[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Pj_12948 ss = new Pj_12948();
        ss.solution("023339762");
    }
}
