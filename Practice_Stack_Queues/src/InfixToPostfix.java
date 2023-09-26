import java.util.Stack;

public class InfixToPostfix {

    Stack<Character> stack = new Stack<>();
    String postFix = "";

    public int checkPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public void checkSymbol(char symbol) {
        if (Character.isLetter(symbol)) {
            // stack.push(symbol);
            postFix = postFix + symbol;
        } else if (symbol == '(') {
            stack.push(symbol);
        } else if (symbol == ')') {
            while (!(stack.isEmpty()) && stack.peek() != '(') {
                postFix = postFix + stack.pop();
            }
            stack.pop();
        } else {
            // checkPrecedence(symbol);
            while (!(stack.isEmpty()) && checkPrecedence(symbol) <= checkPrecedence(stack.peek())) {
                postFix = postFix + stack.pop();
            }
            stack.push(symbol);
        }
    }

    public String convertToPostFix(String infix) {
        for (int i = 0; i < infix.length(); i++) {
            System.out.println(infix.charAt(i));
            checkSymbol(infix.charAt(i));
        }
        while (!(stack.isEmpty())) {
            postFix = postFix + stack.pop();
        }
        return postFix;
    }

    public static void main(String[] args) {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String postFixExpreString = infixToPostfix.convertToPostFix("((A+B)*C-D)/(E+F)");
        System.out.println(postFixExpreString);
    }
}
