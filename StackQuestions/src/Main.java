import java.util.Stack;

public class Main {
    Stack<Character> stack = new Stack<>();

    boolean isBalanced(String brackets) {
        int b1 = 0, b2 = 0, c1 = 0, c2 = 0, d1 = 0, d2 = 0;
        for (char c : brackets.toCharArray()) {
            stack.push(c);
        }
        for (char c : stack) {
            if (c == '[') {
                b1++;
            }
            if (c == ']') {
                b2++;
            }
            if (c == '{') {
                c1++;
            }
            if (c == '}') {
                c2++;
            }
            if (c == '(') {
                d1++;
            }
            if (c == ')') {
                d2++;
            }
        }
        if (c1 == c2 && b1 == b2 && d1 == d2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isBalanced("[[({})]]"));
    }
}
