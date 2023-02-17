public class Circular_LL {

    private Node head;
    private Node tail;

    public Circular_LL(){
        this.head = null;
        this.tail = null;
    }

    public void insertVal(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void printList(){
        Node currNode = head;
        if (head != null){
            do {
                System.out.println(currNode.data + "-->");
                currNode = currNode.next;
            }while (currNode != head);
        }
    }



    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;

        }
    }
}
