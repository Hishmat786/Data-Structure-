import java.util.ArrayList;
class Node 
{
    int key;
    Node left, right, parent;
    //constructor
    Node(int key){
        this.key = key;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
public class BST {
    Node root;
    static int sum = 0;
    //cons without val
    BST(){
     root = null;   
    }
    //adding values in BST
    Node addRec(Node root, int val){
        if(root==null){
            root = new Node(val);
        }
        if(val > root.key){
            root.right = addRec(root.right, val);
            root.right.parent = root;
        }
        if(val < root.key){
            root.left = addRec(root.left, val);
            root.left.parent = root;
        }
        return root;
    }
    void add(int val){
        root = addRec(root, val);
    }
    //searching a Node in BST
    Node search(Node root,int val){
        
        if(root.key == val)
        {
            return root;
        }
        if(val > root.key){
            if(root.right != null){
                root = search(root.right, val);
            }
            else
                return root;
        }
        if(val < root.key){
            if(root.left != null){
                root= search(root.left, val);
            }
            else
                return root;
        }
       return root;
    }
    //left descedents of node
    Node leftDescendent(Node root){
        if(root == null || root.left == null){
            return root;
        }
       
        else
            return leftDescendent(root.left);
    }
    //Right Ancestors method
    Node rightAncestor(Node node){
        if(node.key < node.parent.key){
            return node.parent;
        }
        return rightAncestor(node.parent);
    }
    //Next method
    Node next(Node node){
        if(node.right != null){
            return leftDescendent(node.right);
        }
        else
            return rightAncestor(node);
    }
    
    //finding next largest val
    void findNext(int val){
        Node n = search(root, val);
        Node res = next(n);
        System.out.println(res.key);
    }
    
    //finding a range of values
    ArrayList<Integer> rangeSearch(int x, int y){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Node tem = search(root, x);
        while(tem.key <= y){
            if(tem.key >= x){
                list.add(tem.key);
            }
            tem = next(tem);
        }
    return list;
    }
    
    //traversal
    void inOrder(Node root){
        if(root == null){
            return;
        }
        else
        {
            inOrder(root.left);
            System.out.print(root.key+" ");
            inOrder(root.right);
        }
    }
     //post order
    void postOrder(Node root){
        if(root == null){
            return;
        }
        else
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key+" ");
        }
    }
    //pre order
    void preOrder(Node root){
        if(root == null){
            return;
        }
        else
        {
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
   //finding height of a binary tree
    int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        
        return Math.max(heightOfTree(root.left), heightOfTree(root.right))+1;
    }
    //size of tree
    int sizeOfTree(Node root){
       if(root == null){ 
            return 0;
       }
       return 1+sizeOfTree(root.left)+sizeOfTree(root.right);
       
    }
    // size and sum of right sub tree;
    int SumOfSubTree(Node root){
        if(root == null){
            return 0;
        }
        else
        {
            sum = sum + root.key;
            SumOfSubTree(root.left);
            SumOfSubTree(root.right);
        }
        return sum;
    }
    //sum of external nodes
    int SumOfExternalNodes(Node root){
        if(root == null){
            return 0;
        }
        else
        {
           if(root.left == null && root.right == null){
                sum = sum + root.key;
           }
          
           SumOfExternalNodes(root.left);
           SumOfExternalNodes(root.right);
        }
        return sum;
    }
    
     //sum of enternal Nodes nodes
    int SumOfEnternalNodes(Node root){
        if(root == null){
            return 0;
        }
        else
        {
           if(!(root.left == null && root.right == null)){
                sum = sum + root.key;
           }
          
           SumOfEnternalNodes(root.left);
           SumOfEnternalNodes(root.right);
        }
        return sum;
    }
    
    //delete a Node
    // This method mainly calls deleteRec()
	void deleteKey(int key) { 
            root = deleteRec(root, key);
        } 
	Node deleteRec(Node root, int key)
	{
		if (root == null)
			return root;
		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);
		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			root.key = minValue(root.right);
			root.right = deleteRec(root.right, root.key);
		}
		return root;
	}

	int minValue(Node root)
	{
		int minv = root.key;
		while (root.left != null)
		{
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}
    
    public static void main (String arg[])
    {
        BST tree = new BST();
        tree.add(10);
        tree.add(15);
        tree.add(7);
        tree.add(6);
        tree.add(20);
        tree.add(22);
        tree.add(8);
        tree.add(14);
        Node res = tree.search(tree.root, 7);
        System.out.println("Finding 7 in BST: ");
        System.out.println(res.key);
        Node leftMost = tree.leftDescendent(tree.root);
         System.out.println("Left Most Decsedent: ");
        System.out.println(leftMost.key);
         System.out.println("Finding Next of 6 in BST: ");
        tree.findNext(6);
         System.out.println("Range Search: ");
        ArrayList<Integer> values = tree.rangeSearch(6, 20);
        System.out.println(values);
        System.out.println("In Order Traversal: ");
        tree.inOrder(tree.root);
        System.out.println("\nPre Order Traversal: ");
        tree.preOrder(tree.root);
        System.out.println("\nPost Order Traversal: ");
        tree.postOrder(tree.root);
        System.out.println("\nSize of Tree: "+tree.sizeOfTree(tree.root));
        System.out.println("Height of Tree: "+tree.heightOfTree(tree.root));
        Node n = tree.search(tree.root, 8);
        System.out.println("Parent of 8 is: "+n.parent.key);
        System.out.println("Sum of Right Sub Tree: "+tree.SumOfSubTree(tree.root.right));
        tree.sum = 0;
        System.out.println("Sum of left Sub Tree: "+tree.SumOfSubTree(tree.root.left));
        tree.sum =0;
        System.out.println("Sum of External Nodes: "+tree.SumOfExternalNodes(tree.root));
        tree.sum = 0;
        System.out.println("Sum of Enternal Nodes: "+tree.SumOfEnternalNodes(tree.root));
        tree.postOrder(tree.root);
        tree.deleteKey(20);
        System.out.println();
        tree.postOrder(tree.root);
        tree.deleteKey(7);
        System.out.println();
        tree.postOrder(tree.root);
    }
}
