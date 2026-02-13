import java.util.Stack;

public class StackQueueEnqueueFriendly {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    // enqueue is O(1)
    public void enqueue(int x) {
        s1.push(x);
    }

    // dequeue is O(n) only when needed
    public int dequeue() {

        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}