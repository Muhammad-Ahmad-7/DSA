public class Stack {

    public int top;
    public int[] arr;
    public int size;

    Stack(int size) {
        this.arr = new int[size];
        this.top = -1;
        this.size = size;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return (this.top == -1);
    }

    public void push(int num) {
        if (!isFull()) {
            arr[++top] = num;
        } else {
            System.out.println("Stack is Full!!!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            // System.out.println("Top" + top);
            return arr[top--];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.printStack();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.printStack();
    }

}
