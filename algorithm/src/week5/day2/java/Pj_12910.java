package week5.day2.java;

import java.util.Arrays;

public class Pj_12910 {

    public int[] solution(int[] arr, int divisor) {
        int count = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }

        if (count == 0) {
            return new int[]{-1};
        }

        int[] result = new int[count];
        int index = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                result[index++] = arr[i];
            }
        }
        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        Pj_12910 ss = new Pj_12910();
        ss.solution(new int[]{5,9,7,10}, 5);
    }
}
