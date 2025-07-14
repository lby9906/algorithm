package week2.day5.java;

public class Pj_12931 {

    public int solution(int n) {
        int result = 0;

        String str = String.valueOf(n);
        String[] split = str.split("");

        for (int i=0; i< split.length; i++){
            result += Integer.parseInt(split[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Pj_12931 ss = new Pj_12931();
        ss.solution(123);
    }
}
