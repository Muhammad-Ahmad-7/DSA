import java.util.Stack;

public class Demo {

    void evaluatePostfix(String postfixNotation) {
        Stack<Integer> stack = new Stack<>();
        int res = 0; // Initialize the result variable
        for (int i = 0; i < postfixNotation.length(); i++) {
            if (Character.isDigit(postfixNotation.charAt(i))) {
                stack.push(Character.getNumericValue(postfixNotation.charAt(i)));
            } else if (isOperator(postfixNotation.charAt(i))) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                char op = postfixNotation.charAt(i);
                res = performOperation(num1, num2, op);
                stack.push(res);
            }
        }
        if (stack.size() == 1) {
            stack.pop();
        }
        System.out.println(res); // Print the result after processing the expression
    }

    boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    int performOperation(int num1, int num2, char op) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.evaluatePostfix("1234553*9/++");
    }
}
