public class DynamicQueue extends CustomQueue {

    DynamicQueue() {
        super();
    }

    @Override
    public void add(int number) {
        if (!this.isFull()) {
            queue[end++] = number;
        } else {
            int[] temp = new int[queue.length * 2];
            for (int i = 0; i < queue.length; i++) {
                temp[i] = queue[i];
            }
            queue = temp;
        }
    }

    public static void main(String[] args) {
        DynamicQueue dynamicQueue = new DynamicQueue();
        dynamicQueue.add(5);
        dynamicQueue.add(10);
        dynamicQueue.add(15);
        dynamicQueue.add(20);
        dynamicQueue.add(25);
        dynamicQueue.add(30);
        dynamicQueue.add(35);
        dynamicQueue.add(40);
        dynamicQueue.add(45);
        dynamicQueue.add(50);
        dynamicQueue.add(55);
        dynamicQueue.add(60);
        dynamicQueue.add(65);
        dynamicQueue.add(70);
        dynamicQueue.printQueue();
        System.out.println(dynamicQueue.remove());
        dynamicQueue.printQueue();
        System.out.println(dynamicQueue.remove());
        dynamicQueue.printQueue();
        System.out.println(dynamicQueue.remove());
        dynamicQueue.printQueue();
        System.out.println(dynamicQueue.remove());
        dynamicQueue.printQueue();
    }
}
