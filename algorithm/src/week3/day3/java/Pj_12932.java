package week3.day3.java;

public class Pj_12932 {
    public int[] solution(long n) {
        String strArr = String.valueOf(n);
        String[] split = strArr.split("");
        int[] result = new int[split.length];
        int count = 0;

        for (int i= split.length-1; i>=0; i--) {
            result[count] = Integer.parseInt(split[i]);
            System.out.println(result[count]);
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        Pj_12932 ss = new Pj_12932();
        ss.solution(12345);
    }
}
