package week5.day5.java;

import java.util.Arrays;

public class Pj_86051 {

    public int solution(int[] numbers) {
        int result = 0;
        int i = 0;
        int j = 0;
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        Arrays.sort(numbers);

        while (i<arr.length && j<numbers.length) {
            if (arr[i] != numbers[j]) {
                result += arr[i];
                i++;
            }else if (arr[i] == numbers[j]){
                i++;
                j++;
            }else {
                break;
            }
        }
        while(i < arr.length) {
            result += arr[i];
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Pj_86051 ss = new Pj_86051();
        ss.solution(new int[]{1,2,3,4,6,7,8,0});
    }
}
