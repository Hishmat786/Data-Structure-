import javax.lang.model.util.ElementScanner14;

class Queue9 {
    static int front, rear;
    int queue[];

    Queue9(int size) {
        queue = new int[size];
        front = rear = 0;
    }

    void enqueue(int data) {
        queue[rear++] = data;
        System.out.println("inserted: " + data);
    }

    int dequeue() {
        return queue[front++];
    }

    int peek() {
        return queue[--rear];
    }

}

public class StackUsingStack {
    Queue9 q1, q2;

    StackUsingStack() {
        q1 = new Queue9(5);
        q2 = new Queue9(5);
    }

    void push(int data) {
        if (!isFull())
            q1.enqueue(data);
        else {
            System.out.println("Queue is full");
        }
    }

    void queuetoStack() {
        q2.enqueue(q1.peek());
    }

    int pop() {
        return q2.dequeue();
    }

    boolean isFull() {
        if ((Queue9.front != 0) && (Queue9.front == Queue9.rear))
            return true;
        else
            return false;
    }

    public static void main(String[] arg) {
        int[] keys = { 1, 2, 3, 4, 5 };
        StackUsingStack s = new StackUsingStack();
        for (int key : keys) {
            s.push(key);
        }
        for (int key : keys) {
            s.queuetoStack();
        }
        System.out.println("Remove:" + s.pop());
        System.out.println("Remove:" + s.pop());
    }
}