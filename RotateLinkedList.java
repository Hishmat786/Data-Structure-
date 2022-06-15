import java.util.LinkedList;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class RotateLinkedList{
	int[] arr;
	Node head;
	int count;
	void addBig(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
		}else{
			newNode.next=head;
			head=newNode;
		}
	}
	
	void showAll(){
		Node cur=head;
		while(cur!=null){
			System.out.print(cur.data+" ");
			cur=cur.next;
			count++;
		}
	}
	
	void printReverse(){
		arr= new int[count];
		int i=0;
		Node cur=head;
		while(i<count){
			arr[i++]=cur.data;
			cur=cur.next;
		}
		for(int j=arr.length-1;j>=0;j--)
			System.out.print(arr[j]+" ");

	}
	public static void main(String[] arg){
		RotateLinkedList obj= new RotateLinkedList();
		obj.addBig(1);
		obj.addBig(2);
		obj.addBig(3);
		obj.addBig(4);
		obj.addBig(5);
		System.out.print("\nOrigenal LinkedList: ");
		obj.showAll();
		System.out.print("\nReversed LinkedList: ");
		obj.printReverse();
		System.out.print("\nOrigenal LinkedList: ");
		obj.showAll();
	
	}
}