package testprogram;

import java.util.ArrayList;

public class FibonnaciAndPrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		       fib(1,100);
 }
		
		
		public static void fib(int boundarylow, int boundaryhigh) {
			int n1 = 0, n2 = 1, n3;
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int i=boundarylow;i<=boundaryhigh;i++) {
				n3=n1+n2;
				n1=n2;
				n2=n3;
				
				if(n3<boundaryhigh && n3>boundarylow) {
					
					 arr.add(n3);
					     
				}
				
          }
			System.out.println("Fibonnci series in 1 to 100:"+arr);
			System.out.println("Prime number in Fibonnci series: ");
			for(int j:arr) {
				boolean flag = false;
				for(int i = 2; i <= j / 2; ++i) {
				      // condition for nonprime number
				      if (j % i == 0) {
				        flag = true;
				        break;
				      }
				    }
				if(flag==false) {
					System.out.print(" "+j);
					
				}
			}
	}
}
