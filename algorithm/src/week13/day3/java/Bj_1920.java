package week13.day3.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bj_1920 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arrN = new int[n];
		for (int i=0; i< arrN.length; i++) {
			arrN[i] = in.nextInt();
		}

		int m = in.nextInt();
		int[] arrM = new int[m];
		for (int i=0; i< arrM.length; i++) {
			arrM[i] = in.nextInt();
		}

		Set<Integer> set = new HashSet<>();

		for (int num : arrN) {
			set.add(num);
		}

		for (int num : arrM) {
			if (set.contains(num)) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
	}
}
