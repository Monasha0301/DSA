public class LinkedListFIFOQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node front = null;
    private Node rear = null;

    // Enqueue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + front.data);
        front = front.next;
        if (front == null)
            rear = null;
    }

    // Display
    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}
