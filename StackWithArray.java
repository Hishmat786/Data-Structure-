import java.util.*;

class StackWithArray {
    private int arr[];
    private int top;
    private int capacity;

    StackWithArray(int size) {
        arr = new int[size];
        capacity = size;
        top = 0;
    }

    void push(int data) {
        arr[top++] = data;
        System.out.println("Inserting: " + data);
    }

    int pop() {
        return arr[--top];
    }

    int peek() {
        return arr[top - 1];
    }

    int size() {
        return top;
    }

    boolean isEmpity() {
        if (top == 0) {
            return true;
        } else
            return false;

    }

    public static void main(String[] arg) {
        StackWithArray stack = new StackWithArray(3);

        stack.push(1);
        stack.push(2);

        System.out.println("Removing:" + stack.pop());
        System.out.println("Removing:" + stack.pop());

        stack.push(3);

        System.out.println("Element at top is:" + stack.peek());
        System.out.println("Stack size is:" + stack.size());

        System.out.println("Removing:" + stack.pop());

        if (stack.isEmpity()) {
            System.out.println("Stack is Empity");
        } else {
            System.out.println("Stack is not Empity");
        }
    }
}