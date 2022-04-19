class Stack {
    private char arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new char[size];
        capacity = size;
        top = 0;
    }

    void push(char data) {
        arr[top++] = data;
        // System.out.println("Inserting: " + data);
    }

    char pop() {
        return arr[--top];
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
}

public class PalindromeLinkedList {

    boolean palindrome(String str) {
        String s = str.replace(" ", "");
        String st = s.toLowerCase();

        int size = st.length() / 2;
        // System.out.println(st);
        Stack stack = new Stack(size);
        int i;
        for (i = 0; i < size; i++) {
            stack.push(st.charAt(i));
        }
        if (st.length() % 2 != 0) {
            i++;
        }
        while (i < st.length()) {
            if (stack.pop() != st.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String args[]) {
        // creating Linked List
        PalindromeLinkedList obj = new PalindromeLinkedList();
        String str = "Race car";

        System.out.print(obj.palindrome(str));
    }

}