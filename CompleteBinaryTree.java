class CompleteBinaryTree{
    int size;
    int[] arrBT;
    int root=-1;

    CompleteBinaryTree(int size){
        this.size=size;
        arrBT = new int[size];
    }
    
    int parrent(int i){
        return i/2;
    }
    int leftchild(int i){
        return 2*i;
    }
    int rightChild(int i){
        return 2*i+1;
    }
    void shiftUp(int i){
        while(i>0 && arrBT[parrent(i)]<arrBT[i]){
            int temp= arrBT[parrent(i)];
            arrBT[parrent(i)]=arrBT[i];
            arrBT[i]=temp;
            i=parrent(i);
        }
    }
    void shiftDown(int i){
        int maxIndex= i;
        int l= leftchild(i);
        if(l<size && arrBT[l]>arrBT[maxIndex])
            maxIndex=l;
        int r= rightChild(i);
        if(r<size && arrBT[r]>arrBT[maxIndex])
            maxIndex=r;
        if(i!=maxIndex){
            int temp= arrBT[i];
            arrBT[i]=arrBT[maxIndex];
            arrBT[maxIndex]=temp;
            shiftDown(maxIndex);
        }
    }
    void insert(int p){
        root=root+1;
        arrBT[root]=p;
        shiftUp(root);
    }
    int extractMax(){
        int result=arrBT[0];
        arrBT[0]=arrBT[root];
        root=root-1;
        shiftDown(0);
        return result;
    }
    void remove(int i){
        arrBT[i]= Integer.MAX_VALUE;
        shiftUp(i);
        extractMax();
    }
    void changePriority(int i,int p){
        int oldp = arrBT[i];
        arrBT[i] = p;
        if (p > oldp){
            shiftUp(i);
        }
        else{
            shiftDown(i);
        }
    }
    public static void main(String[] args) {
        CompleteBinaryTree obj= new CompleteBinaryTree(9);
        obj.insert(45);
        obj.insert(20);
        obj.insert(14);
        obj.insert(21);
        obj.insert(31);
        obj.insert(7);
        obj.insert(11);
        obj.insert(13);
        obj.insert(7);
        //System.out.print(obj.arrBT[0]);
        System.out.print("\nQueue is: ");
        for(int i=0;i<obj.arrBT.length;i++){
            System.out.print(obj.arrBT[i]+" ");
        }
        System.out.println("\nmax number: "+obj.extractMax());
        obj.remove(2);
        System.out.print("After remove: ");
        for(int i=0;i<obj.arrBT.length;i++){
            System.out.print(obj.arrBT[i]+" ");
        }
        System.out.println("\nchanged Priority ");
        obj.changePriority(4,49);
        System.out.print("after change Queue is: ");
        //System.out.print(obj.arrBT[0]);
        for(int i=0;i<obj.arrBT.length;i++){
            System.out.print(obj.arrBT[i]+" ");
        }

    }
}