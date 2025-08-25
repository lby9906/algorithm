package week9.day1.java;

public class Pj_68935 {

	public int solution(int n) {
		int result = 0;
		String str = Integer.toString(n, 3);
		String string = "";

		String[] split = str.split("");

		for (int i= split.length-1; i>=0; i--) {
			string += split[i];
		}

		result = Integer.parseInt(string, 3);

		return result;
	}

	public static void main(String[] args) {
		Pj_68935 ss = new Pj_68935();
		ss.solution(45);
	}
}
