import java.util.ArrayDeque;
import java.util.Queue;

public class QueueStructure {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(101);
        queue.add(201);
        queue.add(301);
        queue.add(401);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
