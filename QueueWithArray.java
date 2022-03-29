class Queue {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = 0;
        count = 0;
    }

    void enqueue(int item) {
        arr[rear++] = item;
        System.out.println("Inserted: " + item);
        count++;
    }

    void dequeue() {
        System.out.println("Removing: " + arr[front++]);
        count--;
    }

    int peek() {
        return arr[front];
    }

    int size() {
        return count;
    }

    boolean isEmpity() {
        if (rear == front)
            return true;
        else
            return false;
    }

    boolean isFull() {
        return (rear == capacity - 1);
    }
}

public class QueueWithArray {
    public static void main(String[] ar) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is: " + q.size());

        q.dequeue();
        q.dequeue();

        if (q.isEmpity())
            System.out.println("Queue is Empity");
        else
            System.out.println("Queue is not Empity");

    }
}