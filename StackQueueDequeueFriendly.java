import java.util.Stack;

public class StackQueueDequeueFriendly {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();

    // Enqueue operation (costly)
    public void enqueue(int x) {
        while (!mainStack.isEmpty()) {
            tempStack.push(mainStack.pop());
        }

        mainStack.push(x);

        while (!tempStack.isEmpty()) {
            mainStack.push(tempStack.pop());
        }
    }

    // Dequeue operation (efficient)
    public int dequeue() {
        if (mainStack.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return mainStack.pop();
    }

    public static void main(String[] args) {
        StackQueueDequeueFriendly q = new StackQueueDequeueFriendly();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
    }
}
