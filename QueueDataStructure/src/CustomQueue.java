public class CustomQueue {
    int[] queue;
    int end = 0;

    CustomQueue(int size) {
        this.queue = new int[size];
    }

    CustomQueue() {
        this.queue = new int[5];
    }

    public boolean isFull() {
        return end == queue.length - 1;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public void add(int num) {
        if (!isFull()) {
            queue[end++] = num;
        }
    }

    public int remove() {
        if (!isEmpty()) {
            int number = queue[0];
            end--;
            for (int i = 1; i <= end; i++) {
                queue[i - 1] = queue[i];
            }
            return number;
        }
        return 0;
    }

    public void printQueue() {
        for (int i = 0; i < end; i++) {
            if (queue[i] != 0) {
                System.out.print(queue[i] + "<-");
            }
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue(10);
        customQueue.add(5);
        customQueue.add(10);
        customQueue.add(15);
        customQueue.add(20);
        customQueue.add(25);
        customQueue.add(30);
        customQueue.printQueue();
        System.out.println(customQueue.remove());
        customQueue.printQueue();
        System.out.println(customQueue.remove());
        customQueue.printQueue();
        System.out.println(customQueue.remove());
        customQueue.printQueue();
        System.out.println(customQueue.remove());
        customQueue.printQueue();
    }
}
