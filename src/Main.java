public class Main {
    public static void main(String[] args) {
        Priority P = new Priority();

        P.enqueue(35, 3);
        P.enqueue(27, 2);
        P.enqueue(90, 5);
        P.enqueue(50, 1);

        System.out.println("Priority Queue: ");
        P.printQueue();

        System.out.println("Peek: " + P.peek());  // Peek at the highest priority element

        System.out.println("Dequeue: " + P.dequeue());
        System.out.println("Dequeue: " + P.dequeue());
        System.out.println(P.isEmpty());
        System.out.println("Dequeue: " + P.dequeue());

        System.out.println("Updated Priority Queue: ");
        P.printQueue();
    }
}
