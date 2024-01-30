package algorithmsEasy;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false; // Closing bracket with no corresponding opening bracket
                }

                char top = stack.pop();
                System.out.println(top);

                if (bracket == ')' && top != '(' ||
                    bracket == '}' && top != '{' ||
                    bracket == ']' && top != '[') {
                    return false; // Mismatched opening and closing brackets
                }
            }
        }

        return stack.isEmpty(); // Ensure all opening brackets have a corresponding closing bracket
    }

    public static void main(String[] args) {
        String testString = "[()]";
        boolean result = isValid(testString);

        if (result) {
            System.out.println("The parentheses are valid.");
        } else {
            System.out.println("The parentheses are not valid.");
        }
    }
}