package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class BracketsCheck {
	public static void main(String[] args) {

		// System.out.println(new BracketsCheck().isValid("([)]"));
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < t; i++) {

			set.add(pair_left[i] + " " + pair_right[i]);
			System.out.println(set.size());

		}

		
	}

	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
				stack.add(s.charAt(i));
			} else if (stack.isEmpty()) {
				return Boolean.FALSE;
			} else {
				Character ch = stack.pop();
				if (s.charAt(i) == ')' && ch != '(') {
					return Boolean.FALSE;
				}
				if (s.charAt(i) == '}' && ch != '{') {
					return Boolean.FALSE;
				}
				if (s.charAt(i) == ']' && ch != '[') {
					return Boolean.FALSE;
				}
			}

		}
		if (stack.isEmpty()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}

	}

}
