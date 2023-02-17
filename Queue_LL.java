public class Queue_LL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }

        static class Queue{
            static Node head = null;
            static Node tail = null;

            public static boolean isEmpty(){
                return head == null && tail == null;
            }

            public static void add(int data){
                Node newNode = new Node(data);
                if(tail == null){
                    tail = head = newNode;
                    return;
                }
                tail.next = newNode;
                tail = newNode;

            }

            public static int remove(){
                if(isEmpty()){
                    System.out.println("Empty Queue");
                    return -1;
                }
                if (head == tail){
                    tail = null;
                }

               int front = head.data;
                head = head.next;

                return front;

            }

            public static int peek(){
                if (isEmpty()){
                    System.out.println("Empty Queue");
                    return -1;
                }
                return head.data;
            }


        }
    }

    public static void main(String[] args) {

    }
}
