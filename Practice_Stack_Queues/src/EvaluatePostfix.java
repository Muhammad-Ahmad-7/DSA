import java.util.Stack;

public class EvaluatePostfix {

    Stack<Integer> stack = new Stack<>();

    int res = 0;

    public boolean isOperator(char op) {
        return op == '+' || op == '-' || op == '*' || op == '/';
    }

    public int calculateExpression(int num1, int num2, char op) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return (num1 * num2);
            case '/':
                if (num2 != 0) {
                    return (num1 / num2);
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }

    public void calculatePostfix(String postfix) {
        for (int i = 0; i < postfix.length(); i++) {
            if (Character.isDigit(postfix.charAt(i))) {
                stack.push(Character.getNumericValue(postfix.charAt(i)));
            } else if (isOperator(postfix.charAt(i))) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                char op = postfix.charAt(i);
                res = calculateExpression(num1, num2, op);
                stack.push(res);
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        EvaluatePostfix evaluatePostfix = new EvaluatePostfix();
        evaluatePostfix.calculatePostfix("52*37+/4-");

    }
}
