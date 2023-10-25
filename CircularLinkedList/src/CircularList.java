public class CircularList {
    public Node head = null;
    public Node lastNode = null;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node lastNode() {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    public void insert(int value) {
        if (head == null) {
            Node newNode = new Node(value);
            head = newNode;
            newNode.next = newNode;
            lastNode = head;
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        lastNode.next = head;
    }

    public void remove(int data) {
        Node currentNode = head;
        Node prevNode = null;
        if (head.value == data) {
            head = head.next;
            lastNode.next = head;
            return;
        }
        do {
            if (currentNode.value == data) {
                prevNode.next = currentNode.next;
                currentNode.next = null;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        } while (currentNode != head);

        // while (currentNode != head) {

        // }
    }

    public void display() {
        if (head == null) {
            return; // Handle an empty list
        }

        Node currentNode = head;

        do {
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        } while (currentNode != head);

        System.out.println(); // Print a new line to format the output
    }

    public static void main(String[] args) {
        CircularList cll = new CircularList();
        cll.insert(5);
        cll.insert(10);
        cll.insert(15);
        cll.insert(20);
        cll.insert(25);
        cll.insert(30);
        cll.display();
        // cll.remove(5);
        // cll.display();
        cll.remove(30);
        cll.display();
    }
}
