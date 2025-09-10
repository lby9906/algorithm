package week11.day3.java;

import java.util.Arrays;

public class Pj_42748 {

	public int[] solution(int[] array, int[][] commands) {
		int[] result = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0];
			int end = commands[i][1];
			int k = commands[i][2];

			int[] arr = Arrays.copyOfRange(array, start-1, end);

			Arrays.sort(arr);

			result[i] = arr[k-1];
		}
		return result;
	}

	public static void main(String[] args) {
		Pj_42748 ss = new Pj_42748();
		ss.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
	}
}
