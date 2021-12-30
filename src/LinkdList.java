public class LinkdList {
    Node head;


    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            this.head= new Node(data);
        }
        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }

    }
}
