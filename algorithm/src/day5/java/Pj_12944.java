package day5.java;

public class Pj_12944 {

    public double solution(int[] arr) {
        double result = 0;

        for (int i=0; i<arr.length; i++) {
            result += arr[i];
        }
        return result/ arr.length;
    }

    public static void main(String[] args) {
        Pj_12944 ss = new Pj_12944();
        ss.solution(new int[]{5,5});
    }
}
