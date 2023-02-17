import java.util.LinkedList;

public class Singly_LL {

    Node head;
    private int size;

    Singly_LL(){
        this.size = 0;
    }

    //Singly Linked List
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Adding element to the Last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Delete First
    public void deleteFirst(){
        if(head == null){
            return;
        }
        size--;
        head = head.next;
    }

    //Delete Last
    public void deleteLast(){
        if(head == null){
            return;
        }

        size--;

        if (head.next == null){
            head = null;
            return;
        }

        Node firstNode = head.next;
        Node secNode = head;

        while(firstNode.next != null){
            firstNode = firstNode.next;
            secNode = secNode.next;
        }

        secNode.next = null;
    }

    public int getSize(){
        return size;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.println(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args){
        Singly_LL list = new Singly_LL();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(5);
        list.addLast(7);
        list.addFirst(10);
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());

        //Linked List using Constructors
        LinkedList<String> list1 = new LinkedList<String>();
        list1.addFirst("Hello");
        list1.addLast("World");
        list1.addFirst("Adi");
        list1.removeFirst();
        list1.removeLast();
        list1.remove(0);
        System.out.println(list1);
        System.out.println(list1.size());

        for(int i = 0 ; i < list1.size() ; i++){
            System.out.println(list1.get(i));
        }
    }
}
