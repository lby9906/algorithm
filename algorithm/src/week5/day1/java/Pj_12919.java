package week5.day1.java;

public class Pj_12919 {

    public String solution(String[] seoul) {
        String result = "";

        for (int i=0; i<seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                result = "김서방은 " + i + "에 있다.";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Pj_12919 ss = new Pj_12919();
        ss.solution(new String[]{"Jane", "MMM" ,"Kim"});
    }
}
