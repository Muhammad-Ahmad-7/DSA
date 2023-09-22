public class DynamicStack extends Stack {
    @Override
    void push(int number) {
        if (!isFull()) {
            array[++top] = number;
        } else {
            int[] temp = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            array = temp;
            array[++top] = number;
        }
    }

    public static void main(String[] args) {
        DynamicStack dynamicStack = new DynamicStack();
        dynamicStack.push(10);
        dynamicStack.push(20);
        dynamicStack.push(30);
        dynamicStack.push(40);
        dynamicStack.push(60);
        dynamicStack.push(70);
        dynamicStack.push(80);
        dynamicStack.push(90);
        dynamicStack.push(100);
        dynamicStack.push(110);
        dynamicStack.push(120);
        dynamicStack.push(130);
        System.out.println(dynamicStack.pop());
        dynamicStack.printStack();
    }
}
