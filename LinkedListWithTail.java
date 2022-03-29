class Node1 {
    int data;
    Node1 next;
    Node1 prev;

    Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class LinkedListWithTail {
    Node1 head = null, tail = null;

    void insertAtBeginning(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = tail = newNode;
            // tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }

    }

    void addAtEnd(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

    }

    void removeAtBig() {
        head = head.next;
    }

    void removeAtEnd() {
        tail = tail.prev;
        tail.next = null;

    }

    void printAll() {
        Node1 cur = head;
        while (cur.next != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.print(cur.data);

    }

    public static void main(String[] arg) {
        LinkedListWithTail obj = new LinkedListWithTail();
        obj.insertAtBeginning(5);
        obj.insertAtBeginning(10);
        obj.insertAtBeginning(15);
        System.out.print("Store at Beginning:");
        obj.printAll();
        obj.addAtEnd(20);
        obj.addAtEnd(25);
        System.out.print("\nStore at Ending:");
        obj.printAll();
        System.out.print("\nRemove from Beginning:");
        obj.removeAtBig();
        obj.printAll();
        System.out.print("\nRemove from Ending:");
        obj.removeAtEnd();
        obj.printAll();

    }
}