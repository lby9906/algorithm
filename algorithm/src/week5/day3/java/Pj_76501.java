package week5.day3.java;

public class Pj_76501 {

    public int solution(int[] absolutes, boolean[] signs) {
        int result = 0;

        for (int i=0; i< absolutes.length; i++) {
            if (signs[i] == true) {
                result += absolutes[i];
            }else {
                result -= absolutes[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Pj_76501 ss = new Pj_76501();
        ss.solution(new int[]{1,2,3}, new boolean[]{false, false, true});
    }
}
