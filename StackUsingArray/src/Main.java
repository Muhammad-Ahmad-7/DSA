// class Stack {
//     int top = -1;
//     int[] array = new int[5];

//     // Method to Check Array is Empty or Not

//     boolean isEmpty() {
//         return top == -1;
//     }

//     boolean isFull() {
//         return top == array.length - 1;
//     }

//     // Push Method for adding numbers into the Stack
//     void push(int number) {
//         if (!isFull()) {
//             array[++top] = number;
//         } else {
//             System.out.println("Cant Add more, Stack is Full!!");
//         }
//     }

//     // Pop number from Stack
//     int pop() {
//         if (!isEmpty()) {
//             // System.out.println(array[--top]);
//             return array[top--];
//         }
//         return 0;
//     }

//     void printStack() {
//         for (int i = 0; i <= top; i++) {
//             // if (array[i] != 0) {
//             System.out.print(array[i] + " ");
//             // }
//         }
//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.push(40);
//         s.push(50);
//         // s.push(60);
//         // s.push(70);
//         // s.push(80);
//         // s.printStack();
//         // System.out.println("After Popping");
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         s.printStack();
//     }
// }
