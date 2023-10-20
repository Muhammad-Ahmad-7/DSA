public class CircularList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Make it circular
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; // Make it circular
        }
    }

    public void delete(int loc) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (loc == 1) {
            if (head.next == head) {
                head = null; // Only one node, remove it
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
        } else {
            Node current = head;
            int count = 1;
            while (count < loc - 1 && current.next != head) {
                current = current.next;
                count++;
            }

            if (count < loc - 1 || current.next == head) {
                System.out.println("Invalid location: " + loc);
                return;
            }

            current.next = current.next.next;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("Head");
    }

    public static void main(String[] args) {
        CircularList cll = new CircularList();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);

        cll.print();

        // cll.delete(2); // Delete the second element (2)

        // cll.print();
    }
}
