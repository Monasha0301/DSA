import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPopFriendly {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // push is O(n)
    public void push(int x) {

        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // pop is O(1)
    public int pop() {

        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return q1.remove();
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}