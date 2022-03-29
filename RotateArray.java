import java.util.*;
class solution{
	int size=0, rotate=0;
	int[] arrayNew;
	void showRotatedArray(int[] arr, int s, int r){
		size=s;
		rotate=r;
		arrayNew= new int[size];
		int j=0;
		for(int i=rotate; i<size;i++){	
			arrayNew[j]=arr[i];
			//System.out.println(arrayNew[i]);
			j++;
		}
		j=0;
		for(int i=(size-rotate);i<size;i++){
			arrayNew[i]=arr[j];
			j++;
		}
		System.out.println("Rotated Array");
		for(int i=0; i<size;i++){
			System.out.print(arrayNew[i]+" ");
		}
		
	}
}
public class RotateArray{
	public static void main(String[] ar){
		Scanner cin= new Scanner(System.in);

		System.out.print("Enter size of array:");
		int size= cin.nextInt();

		System.out.println("Enter array:");
		int[] arr= new int[size];
		
		for(int i=0; i<size; i++){
			arr[i]= cin.nextInt();
		}
		System.out.print("Enter number to rotate array:");
		int r= cin.nextInt();
		
		solution obj= new solution();
		obj.showRotatedArray(arr,size,r);
		
	}
}