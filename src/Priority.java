public class Priority {
    private Node front;

    public Priority() {
        front = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);

        if (isEmpty() || priority < front.priority) {
            newNode.next = front;
            front = newNode;
        } else {
            Node current = front;
            while (current.next != null && current.next.priority <= priority) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int data = front.data;
        front = front.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    public void printQueue() {
        Node current = front;
        while (current != null) {
            System.out.println("Data: " + current.data + " Priority: " + current.priority);
            current = current.next;
        }
    }
}