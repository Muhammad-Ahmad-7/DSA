public class CircularQueue {
    int[] queue;
    int front;
    int back;
    int size;
    int capacity;

    CircularQueue(int capacity) {
        queue = new int[capacity];
        this.size = 0;
        this.front = -1;
        this.back = -1;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        // System.out.println(size);
        // System.out.println(capacity);
        return size == capacity;
    }

    public void add(int num) {
        if (isFull()) {
            System.out.println("Queue is Full!!");
            return;
        }

        if (isEmpty()) {
            front = back = 0;
        } else {
            back = (back + 1) % capacity;
        }
        queue[back] = num;
        size++;

    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removedItem = queue[front];
        if (front == back) {
            front = back = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return removedItem;

    }

    public void printCircularQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        int current = front;
        System.out.print("Queue: ");
        do {
            System.out.print(queue[current] + " ");
            current = (current + 1) % capacity;
        } while (current != (back + 1) % capacity);

        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        // circularQueue.add(2);
        // circularQueue.add(4);
        // circularQueue.add(6);
        // circularQueue.add(8);
        // circularQueue.add(10);
        // // circularQueue.add(12);
        // circularQueue.printCircularQueue();
        // System.out.println(circularQueue.remove());
        // System.out.println(circularQueue.remove());
        // circularQueue.add(14);
        // circularQueue.add(16);
        // circularQueue.add(18);
        circularQueue.printCircularQueue();
        // System.out.println(circularQueue.back);
        // System.out.println(circularQueue.front);
    }

}
