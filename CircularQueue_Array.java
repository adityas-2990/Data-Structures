public class CircularQueue_Array {
    static class Queue{
        static int arr[];
        static int size;
        static int tail= -1;
        static int head = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return tail == -1 && head == -1;
        }

        public static boolean isFull(){
            return (tail+1)%size == head;
        }

        public static void add(int data){
            if (isFull()){
                System.out.println("Full Queue");
                return;
            }

            if(head == -1){
                head = 0;
            }

            tail = (tail+1)%size;
            arr[tail] = data;
        }

        public static int remove(){
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            int result = arr[head];
            if(tail == head){
                tail = head = -1;
            }else {
                head = (head + 1)%size;
            }
            return result;
        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[head];
        }

    }
    public static void main(String[] args) {

    }
}
