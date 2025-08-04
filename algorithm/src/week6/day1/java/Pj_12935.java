package week6.day1.java;

public class Pj_12935 {

    public int[] solution(int[] arr) {
        int[] result = new int[arr.length - 1];
        int min = 100000;
        int minIdx = -1;
        int idx = 0;

        if (arr.length == 1) {
            return new int[]{-1};
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i=0; i< arr.length; i++) {
            if (arr[i] == min) {
                minIdx = i;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == minIdx) {
                continue;
            }else {
                result[idx++] = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Pj_12935 ss = new Pj_12935();
        ss.solution(new int[]{10});
    }
}
