public class CustomQueue1 {
    private int[] queue; // the array that holds all elements in this queue.
    int front = -1;
    int back = -1;

    CustomQueue1(int size) {
        queue = new int[size];
    }

    public boolean isEmpty() {
        return front == -1 && back == -1;
    }

    public boolean isFull() {
        return back == queue.length - 1;
    }

    public void add(int num) {
        if (!isFull()) {
            front = 0;
            queue[++back] = num;
        } else {
            System.out.println("Queue is Full");
        }
    }

    public int remove() {
        if (!isEmpty()) {
            int num = queue[front++];
            return num;
        } else {
            return -1;
        }
    }

    public void printQueue() {
        for (int i = front; i <= back; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        CustomQueue1 customQueue1 = new CustomQueue1(5);
        customQueue1.add(5);
        customQueue1.add(10);
        customQueue1.add(15);
        customQueue1.remove();
        customQueue1.printQueue();
    }
}
