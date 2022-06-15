class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class ReverseLinkedList{
	Node head;
	void addBig(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
		}else{
			newNode.next=head;
			head=newNode;
		}
	}
	
	Node makeReverse(Node head){
		Node cur=head,prev=null,next;
		while(cur!=null){
			next= cur.next;
			cur.next= prev;
			prev= cur;
			cur=next;
		}
		head=prev;
		return head;
	}
	
	void showAll(){
		Node cur=head;
		while(cur!=null){
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	public static void main(String[] arg){
		ReverseLinkedList obj= new ReverseLinkedList();
		obj.addBig(1);
		obj.addBig(2);
		obj.addBig(3);
		obj.addBig(4);
		obj.addBig(5);
		System.out.print("\nOrigenal LinkedList:");
		obj.showAll();
		System.out.print("\nReversed LinkedList:");
		
		Node cur=obj.makeReverse(obj.head);
		while(cur.next!=null){
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
		System.out.print(cur.data);
	
	}
}