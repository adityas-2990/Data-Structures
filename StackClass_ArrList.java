import java.util.ArrayList;

public class StackClass_ArrList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = list.get(list.size() -1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek(){
            if (isEmpty()){
                return -1;
            }

            return list.get(list.size()  -1);
        }

    }

    public static void main(String[] args) {

        StackClass_LL.Stack s = new StackClass_LL.Stack();
        s.push(2);
        s.push(4);
        s.push(3);
        s.push(5);

        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        s.pop();
        s.pop();

        System.out.println(s.peek());

    }
}
