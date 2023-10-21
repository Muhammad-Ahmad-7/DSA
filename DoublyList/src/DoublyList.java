public class DoublyList {
    Node head;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insert() {

    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node lastNode = this.lastNode();
        node.prev = lastNode;
        lastNode.next = node;
    }

    public Node lastNode() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + "->");
            currentNode = currentNode.next;
        }
        System.out.println("END");
        System.out.println("Reverse: ");
        Node lastNode = this.lastNode();
        Node tempLastNode = lastNode;
        while (tempLastNode != null) {
            System.out.print(tempLastNode.value + "->");
            tempLastNode = tempLastNode.prev;
        }
        System.out.println("START");
    }

    public static void main(String[] args) {
        DoublyList list = new DoublyList();
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(20);
        list.insertFirst(25);
        list.insertLast(30);
        list.insertLast(35);
        list.display();

    }
}
