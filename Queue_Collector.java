import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Collector {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //Queue<Integer> q = new ArrayDeque<>();
        q.add(4);
        q.add(5);
        q.peek();
        q.remove();
    }
}
