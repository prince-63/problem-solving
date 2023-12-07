import java.util.Stack;

/**
 * Class ValidParentheses
 * This class provides a method to check if a string of parentheses is valid.
 * A string is valid if all parentheses are closed in the correct order.
 */
class ValidParentheses {

    /**
     * Method isValid
     * This method takes a string of parentheses as input, and returns a boolean
     * indicating whether the string is valid.
     * The method uses a stack to keep track of the opening parentheses, and checks
     * if the top of the stack matches the closing parenthesis.
     *
     * @param s - the string of parentheses
     * @return a boolean indicating whether the string is valid
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * Main method
     * This method is the entry point for the program. It creates a string of
     * parentheses and checks if the string is valid using the isValid method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s)); // Output: false
    }
}