package testprogram;

import java.util.ArrayList;
import java.util.List;

public class ListOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	 public static List<Integer> oddNumbers(int l, int r) {
		    // Write your code here
		    List<Integer> list = new ArrayList<Integer>();
		    for(int i=l; i<=r; i++){
		        if(i%2!=0){
		            list.add(i);
		        }
		    }
		    return list;
		    }
	 
	 public static List<Integer> rotLeft(List<Integer> a, int d) {
		    // Write your code here
		    
		    for(int i=0; i<d; i++){
		        int j, first;
		        int f = a.size();
		        first = a.get(0);
		        for(j=0; j< f-1; j++){
		            a.set(j, a.get(j+1));
		        }
		        a.set(j, first);
		    }
		    return a;
		    }


	
public static List<Integer> rotright(List<Integer> a, int d) {
    // Write your code here
    
    for(int i=0; i<d; i++){
        int j, temp;
        int f = a.size();
        temp = a.get(f);
        for(j=f; j>0; j--){
            a.set(j, a.get(j-1));
        }
        a.set(j, temp);
    }
    return a;
}




}
