package week11.day4;

public class Pj_132267 {

	public int solution(int a, int b, int n) {
		int result = 0;

		while (n >= a) {
			int quotient = (n / a)*b;
			int remainder = n % a;
			result += quotient;
			n = quotient + remainder;
		}
		return result;
	}

	public static void main(String[] args) {
		Pj_132267 ss = new Pj_132267();
		ss.solution(2, 1, 20);
	}
}
