import java.util.*;
class Solution {
    int[] newArr;
    double mid=0;
	int m;
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int size=(nums1.length+ nums2.length);
        newArr= new int[size];
        for(int i=0; i<(nums1.length);i++){
            newArr[i]=nums1[i];
        }        
        for(int i=nums1.length;i<size; i++){
            newArr[i]=nums2[m];
			m++;
        }	
        Arrays.sort(newArr, 0,((size)) );
        /*
        if((size)%2!=0){
            mid=size/2;
            mid++;
        }
        else{
            int r=size/2;
            mid= (newArr[r]+newArr[r-1])/2.0;
        }
        return mid;*/
		if(newArr.length%2 == 0){
            int n = newArr.length/2;
            return (double) (newArr[n] + newArr[n-1])/2;
        } 
		else 
            return (double) newArr[newArr.length/2];
		
    }
}
public class MedianOfTwoSortedArrays{
	public static void main(String[] arg){
		Scanner cin= new Scanner(System.in);
	
		System.out.print("Enter Size of 1st Array:");
		int s1=cin.nextInt();
		int [] arr1=new int[s1];
		for(int i=0; i<s1;i++){
			arr1[i]=cin.nextInt();
		}
		
		System.out.print("Enter Size of 2nd Array:");
		int s2=cin.nextInt();
		int[] arr2=new int[s2];
		for(int i=0; i<s2;i++){
			arr2[i]=cin.nextInt();
		}
	
		Solution obj= new Solution();
		
		System.out.print(obj.findMedianSortedArrays(arr1,arr2));
	}
}