package week9.day3.java;

import java.util.Stack;

public class Pj_12909 {

	boolean solution(String s) {
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				stack.push("(");
			} else if (c == ')') {
				if (!stack.isEmpty()) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Pj_12909 ss = new Pj_12909();
		ss.solution(")()(");
	}
}
