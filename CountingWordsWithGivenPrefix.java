import java.util.*;
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        boolean check= false;
        
        for(int i=0;i<words.length;i++){
            if(words[i].contains(pref)){
                for(int j=0; j<pref.length();j++){
                    if(pref.charAt(j) == words[i].charAt(j)){
                        check= true;
                    } 
                    else break;
                }
                if(check == true){
                    count++;
                }
                check =false;
            }  
        }
         return count;  
    }
}
public class CountingWordsWithGivenPrefix{
	public static void main(String[] arg){
		Scanner cin= new Scanner(System.in);
		System.out.print("Enter size of Array:");
		int size= cin.nextInt();
		
		String[] array= new String[size];
		
		for(int i=0; i<size; i++){
			array[i]=cin.next();
		}
		
		System.out.print("Enter Prefix:");
		String pre=cin.next();
		
		Solution obj= new Solution();
		System.out.println(obj.prefixCount(array,pre));
	}
}