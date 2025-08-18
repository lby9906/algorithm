package week8.day1.java;

public class Pj_12918 {

    public boolean solution(String s) {
        boolean result = true;

        if(s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (!(Character.isDigit(s.charAt(i)))) {
                    result = false;
                }
                }
            }
        else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        Pj_12918 ss = new Pj_12918();
        ss.solution("1234");
    }
}
