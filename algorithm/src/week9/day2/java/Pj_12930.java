package week9.day2.java;

public class Pj_12930 {

	public String solution(String s) {
		String result = "";
		int index = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == ' ') {
				result += c;
				index = 0;
			} else {
				if (index % 2 == 0) {
					result += Character.toUpperCase(c);
				} else {
					result += Character.toLowerCase(c);
				}
				index++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Pj_12930 ss = new Pj_12930();
		ss.solution("try hello world");
	}
}
