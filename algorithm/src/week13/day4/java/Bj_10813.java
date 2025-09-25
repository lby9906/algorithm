package week13.day4.java;

import java.util.Scanner;

public class Bj_10813 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		int[] arr = new int[n];
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}

		for (int i=0; i<m; i++) {
			int inputI = in.nextInt();
			int inputJ = in.nextInt();

			int temp = arr[inputI-1];
			arr[inputI-1] = arr[inputJ-1];
			arr[inputJ-1] = temp;
		}

		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
