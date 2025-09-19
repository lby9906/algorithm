package week12.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bj_5597 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();

		for (int i=1; i<=28; i++) {
			arr.add(in.nextInt());
		}
		Collections.sort(arr);

		for (int i=1; i<=30; i++) {
			if (!arr.contains(i)) {
				System.out.println(i);
			}
		}
	}
}
