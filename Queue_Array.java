public class Queue_Array {
    static class Queue{
        static int arr[];
        static int size;
        static int tail = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmp(){
            return tail == -1;
        }

        //Enqueue
        public static void add(int data){
            if (tail == size -1){
                System.out.println("Full Queue");
                return;
            }

            tail++;
            arr[tail] = data;
        }

        public static int remove(){
            if(isEmp()){
                System.out.println("Empty Queue");
                return -1;
            }

            int head = arr[0];
            for (int i = 0; i < tail; i++) {
                arr[i] = arr[i+1];
            }
            tail--;
            return head;
        }

        //Peek
        public static int peek(){
            if (isEmp()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }



    }
    public static void main(String[] args) {

        Queue q = new Queue(5);
        q.add(4);
        q.add(5);
        q.add(6);

        while (!q.isEmp()){
            System.out.println(q.peek());
            q.remove();
        }

    }

}
