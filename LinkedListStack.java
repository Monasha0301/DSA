public class LinkedListStack {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top = null;

    // Push
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop
    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    // Display
    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
    }
}
