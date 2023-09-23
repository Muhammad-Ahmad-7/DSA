class Stack {
    char a[] = new char[100];
    int top = -1;

    void push(char c) {
        try {
            a[++top] = c;
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Stack full, no room to push, size=100");
            System.exit(0);
        }
    }

    char pop() {
        return a[top--];
    }

    boolean isEmpty() {
        return (top == -1) ? true : false;
    }

    char peek() {
        return a[top];
    }
}

class InfixToPostFix {
    Stack stack = new Stack();
    String postFix = "";

    void checkOperandAndOperator(char i) {
        if (Character.isLetter(i)) {
            postFix = postFix + i;
        } else if (i == '(') {
            stack.push('(');
        } else if (i == ')') {
            while (stack.peek() != '(') {
                postFix = postFix + stack.pop();
            }
            stack.pop();
        } else {
            while (!stack.isEmpty() && !(stack.peek() == '(') && precedence(i) <= precedence(stack.peek()))
                postFix = postFix + stack.pop();
            stack.push(i);
        }
    }

    int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    String convert(String infix) {
        for (int i = 0; i < infix.length(); i++) {
            checkOperandAndOperator(infix.charAt(i));
        }
        // Pop any remaining stack from the stack
        while (!stack.isEmpty()) {
            postFix = postFix + stack.pop();
        }
        return postFix;
    }
}

public class Main {
    public static void main(String[] args) {
        InfixToPostFix infixToPostFix = new InfixToPostFix();
        String convert = infixToPostFix.convert("(A*B)+((B+C)/D)");
        System.out.println(convert);
    }
}
