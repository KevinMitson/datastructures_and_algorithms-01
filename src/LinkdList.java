public class LinkdList {
    Node head;

    public void print(){
        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }

    }
}
