package Coding;

import java.util.Stack;

public class BalanceParameter {

	public static boolean cheakelement(String element) {
		Stack<Character> stack = new Stack<>();
		for (char ch : element.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);

			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					return false;

				}
				char top = stack.pop();

			}

		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String element = "[[]][{}()";
		if (cheakelement(element)) {
			System.out.println("balance");

		} else {
			System.out.println("not balance");
		}
	}

}
