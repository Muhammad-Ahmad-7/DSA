class LinkedQueue {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;
    int n;

    LinkedQueue() {
        front = null;
        rear = null;
        n = 0;
    }

    Node newNode(int value) {
        return new Node(value);
    }

    Node dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }

        Node dequeuedNode = front;
        front = front.next;
        if (front == null) {
            rear = null; // Queue is now empty
        }
        n--;

        return dequeuedNode;
    }

    boolean enqueue(int v) {
        Node newNode = newNode(v);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        n++;
        return true;
    }

    int sizeOfQueue() {
        return n;
    }

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return false; // Dynamic queue, so it can't be full
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue size: " + queue.sizeOfQueue());

        Node dequeued = queue.dequeue();
        System.out.println("Dequeued: " + dequeued.data);
        System.out.println("Queue size after dequeue: " + queue.sizeOfQueue());
    }
}
