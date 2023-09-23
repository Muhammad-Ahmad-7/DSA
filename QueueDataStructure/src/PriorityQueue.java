public class PriorityQueue {
    private int[] queue;
    private int size;
    private int capacity;

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        int i;
        if (isEmpty()) {
            queue[0] = item;
        } else {
            for (i = size - 1; i >= 0; i--) {
                if (item > queue[i]) {
                    queue[i + 1] = queue[i];
                } else {
                    break;
                }
            }
            queue[i + 1] = item;
        }

        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int removedItem = queue[size - 1];
        size--;
        return removedItem;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }

        return queue[size - 1];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Priority Queue: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(5);

        priorityQueue.enqueue(3);
        priorityQueue.enqueue(1);
        priorityQueue.enqueue(5);
        priorityQueue.enqueue(2);
        priorityQueue.enqueue(4);

        priorityQueue.display(); // Output: Priority Queue: 1 2 3 4 5

        System.out.println("Dequeued item: " + priorityQueue.dequeue()); // Output: Dequeued item: 5

        priorityQueue.display(); // Output: Priority Queue: 1 2 3 4
    }
}
