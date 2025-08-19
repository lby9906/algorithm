package week8.day2.java;

public class Pj_12950 {

	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] result = new int[arr1.length][arr1[0].length];

		for (int i=0; i< arr1.length; i++) {
			for (int j=0; j< arr1[0].length; j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Pj_12950 ss = new Pj_12950();
		ss.solution(new int[][]{{1,2},{2,3}}, new int[][]{{3,4},{5,6}});
	}
}
