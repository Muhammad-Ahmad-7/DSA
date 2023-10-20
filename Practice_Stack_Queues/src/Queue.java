public class Queue {
    int front;
    int back;
    int size;
    int capacity;
    int[] queue;

    Queue(int capacity) {
        this.capacity = capacity;
        this.front = -1;
        this.back = -1;
        this.queue = new int[capacity];
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public void enqueu(int num) {
        if (!isFull()) {
            queue[++back] = num;
            front = 0;
            size++;
        } else {
            throw new IllegalAccessError("Queue is Full");
        }
    }

    public int dequeue() {
        if (front == -1) {
            throw new IllegalAccessError("Queue is Empty");
        } else {
            int num = queue[front];
            front++;
            size--;
            return num;
        }
    }

    public void printQueue() {
        if (front != -1) {
            for (int i = front; i <= back; i++) {
                System.out.print(queue[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println("Complete Queue");
        queue.enqueu(5);
        queue.enqueu(10);
        queue.enqueu(15);
        queue.enqueu(20);
        queue.enqueu(25);
        queue.printQueue();
        System.out.println();
        System.out.println("After First Dequeue");
        System.out.println(queue.dequeue());
        queue.printQueue();
        System.out.println();
        System.out.println("After Second Dequeue");
        System.out.println(queue.dequeue());
        queue.printQueue();

    }
}
