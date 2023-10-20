public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(30);
        list.insertFirst(35);
        list.insertLast(20);
        list.display();
        list.insert(25, 2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();

    }
}
