public class Main {
    public static void main(String[] args) {
        LinkdList list = new LinkdList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);


        list.head.next = second;
        second.next = third;
        list.insertFirst(0);
        list.print();


    }
}
