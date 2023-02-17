public class Doubly_LL {
    Node head;
    private int size;

    Doubly_LL(){
        this.size = 0;
    }

    private class Node{
        private int data;
        Node next;
        Node prev;

         Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
            size++ ;
        }
    }

    public void addFirst(int data){

        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node currNode = head;

        newNode.next = null;
        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }

        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    public void printList(){
        if(head == null){
            return;
        }
        Node currNode = head;
        Node last = null;
        while(currNode != null){
            System.out.println(currNode.data + "<-->");
            last = currNode;
            currNode = currNode.next;
        }

        System.out.println("End");

        while (last != null){
            System.out.println(last.data + "<-->");
            last = last.prev;
        }
        System.out.println("End of reverse print");
    }

    public static void main(String[] args) {
        Doubly_LL list = new Doubly_LL();
        list.addLast(10);

        list.printList();

    }
}
