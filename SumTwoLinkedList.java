import java.util.*;

class Node9 {
    int data;
    Node9 next;

    Node9(int data) {
        this.data = data;
        this.next = null;
    }
} // end of Node class

class SumTwoLinkedList {
    Node9 head;
    Node9 rev = null;

    public void add(int data) {
        Node9 newNode = new Node9(data);
        Node9 cur = head;
        if (isEmpty()) {
            head = newNode;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
            // System.out.println(cur.data);
        }

    } // end of add method

    public void printAll() {
        Node9 cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    } // end of printAll method

    boolean isEmpty() {
        return (head == null);
    }

    void reverse() {
        Node9 cur = head, next, p;
        p = null;
        while (cur != null) {
            next = cur.next;
            cur.next = p;
            p = cur;
            cur = next;
        }
        head = p;
    }

    Node9 sumList(Node9 h1, Node9 h2) {
        Node9 sumHead = new Node9(0);
        Node9 cur = sumHead;
        int sum = 0, carry = 0;
        while (h1 != null || h2 != null) {
            int x = h1 != null ? h1.data : 0;
            int y = h2 != null ? h2.data : 0;
            sum = x + y + carry;
            carry = sum / 10;
            cur.next = new Node9(sum % 10);
            cur = cur.next;
            if (h1 != null)
                h1 = h1.next;
            if (h2 != null)
                h2 = h2.next;

        }
        if (carry > 0) {
            cur.next = new Node9(carry);
        }

        return sumHead.next;

    }

    public static void main(String args[]) {
        SumTwoLinkedList obj = new SumTwoLinkedList();
        SumTwoLinkedList list1 = new SumTwoLinkedList();
        SumTwoLinkedList list2 = new SumTwoLinkedList();

        list1.add(1);
        list1.add(2);
        list1.add(5);

        System.out.print("1st Linked list: ");
        list1.printAll();
        System.out.print("\n2nd Linked list: ");
        list2.add(7);
        list2.add(5);
        list2.add(5);

        list2.printAll();

        list1.reverse();
        list2.reverse();
        System.out.print("\nsum is: ");
        Node9 sumNode = obj.sumList(list1.head, list2.head);

        Node9 cur = sumNode, next, p;
        p = null;
        while (cur != null) {
            next = cur.next;
            cur.next = p;
            p = cur;
            cur = next;
        }
        sumNode = p;

        Node9 curS = sumNode;
        while (curS != null) {
            System.out.print(curS.data + " ");
            curS = curS.next;
        }
    }

}
