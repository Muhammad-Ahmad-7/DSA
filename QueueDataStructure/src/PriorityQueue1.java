public class PriorityQueue1 {
    int[] queue;
    int front;
    int back;
    int size;
    int capacity;

    PriorityQueue1(int capacity) {
        this.queue = new int[capacity];
        this.capacity = capacity;
        this.front = -1;
        this.back = -1;
        this.size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int num) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        front = 0;
        back = back + 1;
        this.queue[back] = num;
        size++;
    }

    public int heighestPriorityIndex() {
        int num = queue[0];
        for (int i = 1; i <= back; i++) {
            if (queue[i] < num) {
                num = i;
            }
        }
        System.out.println(num);
        return num;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int index = heighestPriorityIndex();
        int removedItem = queue[index];
        for (int i = index; i < back; i++) {
            queue[i] = queue[i + 1];
        }
        return removedItem;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        PriorityQueue1 priorityQueue1 = new PriorityQueue1(5);
        priorityQueue1.enqueue(2);
        priorityQueue1.enqueue(0);
        priorityQueue1.enqueue(-8);
        priorityQueue1.enqueue(6);
        priorityQueue1.enqueue(-9);
        System.out.println(priorityQueue1.dequeue());
        priorityQueue1.printQueue();
    }

}
