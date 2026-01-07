public class CircularDoublyLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
    }
}
