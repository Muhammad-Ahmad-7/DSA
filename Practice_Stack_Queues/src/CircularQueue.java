public class CircularQueue {
    int front;
    int back;
    int size;
    int capacity;
    int[] queue;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.back = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public void enqueue(int num) {
        if (!isFull()) {
            if (front == -1) {
                front = 0;
            }
            back = (back + 1) % capacity;
            queue[back] = num;
            size++;
        } else {
            System.out.println("Queue is Full"); // Replace the throw with a message
        }
    }

    public int dequeue() {
        if (front != -1) {
            int num = queue[front];
            front = (front + 1) % capacity;
            size--;
            return num;
        } else {
            return -1;
        }
    }

    public int peek() {
        if (front != -1) {
            return queue[front];
        } else {
            return -1;
        }
    }

    // print Queue
    public void printQueue() {
        if (front != -1) {
            int i = front;
            int count = 0;
            while (count < size) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % capacity;
                count++;
            }
            System.out.println();
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);
        circularQueue.printQueue();
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        circularQueue.printQueue();
        circularQueue.enqueue(6);
        circularQueue.enqueue(7);
        circularQueue.printQueue();

    }

}
