import java.util.*;
class SortArray{
	public static void main(String[] arg){
		int[] ar={4,5,8,2,1,3};
		Arrays.sort(ar,0,6);
		for(int i=0; i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}
}