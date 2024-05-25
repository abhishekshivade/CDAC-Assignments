/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', write a function in Java or C++ to check if the input string is valid. The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not*/

import java.util.Stack;

public class Que18 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;

                }
            }
        }
        
        return stack.isEmpty();
    }
  public static void main(String[] args) {
        String s = "{([])}";
        
        if (isValid(s)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
