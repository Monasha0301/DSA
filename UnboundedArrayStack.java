public class UnboundedArrayStack {

    private int[] array;
    private int top;
    private int capacity;

    public UnboundedArrayStack() {
        capacity = 2;
        array = new int[capacity];
        top = -1;
    }

    public void push(int x) {

        if (top == capacity - 1) {
            resize(capacity * 2);
        }

        array[++top] = x;
    }

    public int pop() {

        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        int value = array[top--];

        if (top + 1 > 0 && top + 1 == capacity / 4) {
            resize(capacity / 2);
        }

        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void resize(int newCapacity) {

        int[] newArray = new int[newCapacity];

        for (int i = 0; i <= top; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        capacity = newCapacity;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
