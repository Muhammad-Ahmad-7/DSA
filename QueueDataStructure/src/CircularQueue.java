public class CircularQueue {
    int[] queue;
    int front = -1;
    int back = -1;
    int size;

    CircularQueue(int size) {
        queue = new int[size];
        this.size = size;
    }

    public boolean isEmpty() {
        return (front == -1 && back == -1);
    }

    public boolean isFull() {
        if (front == -1) {
            return back == queue.length - 1;
        } else {
            return false;
        }
    }

    public void add(int num) {
        if (!isFull()) {
            back = (back + 1) % size;
            queue[back] = num;
        } else {
            System.out.println("Queue is Full");
        }
    }

    public int remove() {
        if (!isEmpty()) {
            front = (front + 1) % size;
            return queue[front];
        } else {
            return 0;
        }
    }

    public void printCircularQueue() {
        if (front == -1) {
            front = 0;
        }
        for (int i = front + 1; (i <= back); i++) {
            // int num = back + 1;
            // if (i == 2) {
            // break;
            // }
            // if (i >= size) {
            // i = 0;
            // }
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(6);
        circularQueue.add(2);
        circularQueue.add(4);
        circularQueue.add(6);
        circularQueue.add(8);
        circularQueue.add(10);
        circularQueue.add(12);
        System.out.println(circularQueue.remove());
        System.out.println(circularQueue.remove());
        // circularQueue.add(14);
        circularQueue.printCircularQueue();
        // System.out.println(circularQueue.back);
        // System.out.println(circularQueue.front);
    }

}
