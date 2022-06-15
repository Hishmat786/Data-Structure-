import java.util.*;
class PriorityQueueUsingArray   
{   
    private int[] arr;
    private int i=-1;
  
    // constructor
    public PriorityQueueUsingArray(int size) {
	 arr = new int[size];
    }
    //isfull method
    boolean isFull(){
     return i == arr.length-1;   
    }
    public void insert(int val) {    	 
    	if(isFull()){
            System.out.println("Queue is Full!");
            return;
        }
        arr[++i] = val;       
    	
    }
    // isEmpty 
    boolean isEmpty(){
	return i == -1;
    }
    
    public int extractMax() {
	if(isEmpty()){
	System.out.println("Queue is Empty!");
	return -1;
	}   	 
    	Arrays.sort(arr);
        int value = arr[i--];
        return value;    
    }
    
    public int getMax() {      	 
    	if(isEmpty()){
	System.out.println("Queue is Empty!");
	} 
        Arrays.sort(arr);
	return arr[i];
    }
    
    public boolean searchData(int data) {
	boolean bool = false;      	 
    	for(int i=0; i<arr.length; i++){
	    if(arr[i]==data){
		bool = true;
		break;
	    }
	}
	return bool;
    }
    
    public static void main(String[] args)   
    {   
      PriorityQueueUsingArray q = new PriorityQueueUsingArray(5);
    	
    	q.insert(1);
	q.insert(4);
	q.insert(5);
	q.insert(9);
	q.insert(7);
    	
    	System.out.println(q.extractMax());
    	System.out.println(q.extractMax());
    	q.insert(10);
	q.insert(6);
    	System.out.println(q.getMax());
    	System.out.println(q.extractMax());
    	System.out.println(q.searchData(5));	
    }   
}   