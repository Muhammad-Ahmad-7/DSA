import java.util.Stack;

public class BuiltinStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        System.out.println(stack.firstElement());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
