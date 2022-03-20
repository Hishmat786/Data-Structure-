class Node {
	String name;
	Node prev, next;

	Node(String name) {
		this.name = name;
	}
}

public class DoubleLinkedList {
	static Node head, tail = null;

	// Add node with name in beginning of linkedlist, name as param
	public void insertAtBeginning(String name) {
		Node newNode = new Node(name);
		if (head == null) {
			head = newNode;
			head.next = null;
			head.prev = null;
		} else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}

	// Add node in beginning of linedlist, node as param
	public void insertAtBeginning(Node node) {
		if (head == null) {
			head = node;
			head.next = null;
			head.prev = null;
		} else {
			head.prev = node;
			node.next = head;
			head = node;
			head.prev = null;
		}
	}

	// Add node in end of linedlist, name as param
	public void insertAtEnd(String name) {
		Node newNode = new Node(name);
		Node cur = head;
		if (head == null) {
			cur = newNode;
		} else {
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
			newNode.prev = cur;
			cur = newNode;
			cur.next = null;
		}
	}

	// Add node in end of linedlist, node as param
	public void insertAtEnd(Node node) {
		Node cur = head;
		if (head == null) {
			cur = node;
		} else {
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = node;
			node.prev = cur;
			cur = node;
			cur.next = null;
		}

	}

	// Add node after name which is provided as param , name and node as params
	public void insertAfterName(String name, Node node) {
		Node cur = head;
		if (head == null) {
			cur = node;
		} else {
			while (cur.next != null) {
				if (cur.name == name) {
					Node temp = cur.next;
					cur.next = node;
					node.prev = cur;
					node.next = temp;
					temp.prev = node;
				}
				cur = cur.next;
			}
		}
	}

	// Add node before name which is provided as param , name and node as params
	public void insertBeforeName(String name, Node node) {
		Node cur = head;
		if (head == null) {
			cur = node;
		} else {
			while (cur.next != null) {
				if (cur.name == name) {
					Node temp = cur.prev;
					cur.prev = node;
					node.next = cur;
					node.prev = temp;
					temp.next = node;
				}
				cur = cur.next;
			}
		}

	}

	// Make double linkedlist as Circular Double LinkedList
	public void makeCircular() {
		Node cur = head;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = head;
		head.prev = cur;
	}

	// Print all the nodes in linkedlist, make sure it works on circular double
	// linkedlist
	public void printAll() {
		Node cur = head;
		while (cur.next != null) {
			System.out.print(cur.name + " ");
			cur = cur.next;
		}
		System.out.print(cur.name);
	}

	// Reverse the doubly linked list
	public void reverse() {
		Node cur = head;
		while (cur.prev != head) {
			System.out.print(cur.prev.name + " ");
			cur = cur.prev;
		}
		System.out.print(cur.prev.name);
	}

	// Test the class
	public static void main(String[] args) {
		DoubleLinkedList obj = new DoubleLinkedList();
		System.out.println("\n_______Enter at Beginning_______");
		obj.insertAtBeginning("Asif");
		obj.insertAtBeginning("Parkash");
		obj.insertAtBeginning("Nizam");
		obj.printAll();
		System.out.println("\n_______Enter name at Beginning with nodes_______");
		obj.insertAtBeginning(new Node("Saif"));
		obj.insertAtBeginning(new Node("Hassan"));
		obj.printAll();
		System.out.println("\n_______Enter at End_______");
		obj.insertAtEnd("Islam");
		obj.insertAtEnd("Hishmat");
		obj.printAll();
		System.out.println("\n_______Enter at End with object_______");
		obj.insertAtEnd(new Node("Ali"));
		obj.insertAtEnd(new Node("Akbar"));
		obj.printAll();
		System.out.println("\n_______Enter Node after given name_______");
		obj.insertAfterName("Hishmat", new Node("Aneel"));
		obj.printAll();
		System.out.println("\n_______Enter Node Before given name_______");
		obj.insertBeforeName("Islam", new Node("Shar"));
		obj.printAll();
		System.out.println("\nAfter Circular accesseing first node from last:");
		obj.makeCircular();
		Node temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}
		System.out.print(temp.next.name);
		System.out.println("\n_______Reverse linked list_______");
		obj.reverse();

	}

}
