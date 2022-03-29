class Stack8 {
    int stack1[], stack2[];
    static int top;
    static int size;

    Stack8(int x) {
        size = x;
        stack1 = new int[size];
        stack1 = new int[size];
        top = 0;
    }

    void push(int data) {
        if (top > size - 1)
            System.out.println("Stack is full");
        else {
            stack1[top++] = data;
            // System.out.println("inserted: " + data);
        }
    }

    int pop() {
        if (top <= 0) {
            return -1;
        } else {
            return stack1[--top];
        }
    }

}

public class Queue {
    private Stack8 s1, s2;

    // int rear=0, front=0;
    Queue() {
        s1 = new Stack8(5);
        s2 = new Stack8(5);
    }

    void enqueue(int data) {
        s1.push(data);
    }

    void putIntos2() {
        s2.push(s1.pop());
    }

    int dequeue() {
        return s2.pop();
    }

    boolean isFull() {
        return s1.top == s1.size;
    }

    public static void main(String[] arg) {
        int[] keys = { 1, 2, 3, 4, 5 };
        Queue q = new Queue();

        for (int key : keys) {
            q.enqueue(key);
        }
        for (int key : keys) {
            q.putIntos2();
        }
        System.out.println("removing: " + q.dequeue());
        System.out.println("removing: " + q.dequeue());

    }
}