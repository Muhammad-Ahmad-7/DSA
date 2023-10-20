public class LinkedList {
    public Node head = null;

    class Node {
        int value;
        Node next;

        Node() {
            this.next = null;
        }
    }

    public void insertFirst(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        Node newNode = new Node();
        newNode.value = value;

        if (head == null) {
            // If the list is empty, set the new node as the head.
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insert(int value, int index) {
        Node newNode = new Node();
        if (index == 0) {
            insertFirst(value);
            return;
        }
        newNode.value = value;
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int deleteFirst() {
        if (head == null) {
            System.out.println("Empty Node");
            return 0;
        }
        int value = head.value;
        head = head.next;
        return value;
    }

    public int deleteLast() {
        if (head == null) {
            System.out.println("Empty Node");
            return 0;
        }
        Node temp = head;
        Node secondLastNode = null;
        while (temp.next != null) {
            secondLastNode = temp;
            temp = temp.next;
        }
        int value = temp.value;
        secondLastNode.next = null;
        return value;
    }

    public int delete(int index) {
        if (index == 0) {
            deleteFirst();
            return 0;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int value = temp.next.value;
        temp.next = temp.next.next;
        return value;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
