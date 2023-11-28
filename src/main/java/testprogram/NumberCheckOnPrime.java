package testprogram;

import java.util.ArrayList;

public class NumberCheckOnPrime {
	
	public static void main(String[] args) {
		checkOnNumber(10);
	}
	
	public static void checkOnNumber(int n) {
		
		for(int i=1;i<=n;i++) {
			boolean flag = false;
			if(i==1) {
				System.out.println("Given number is "+i+" is odd & Prime");
				flag=true;
			}
			else if(i%2==0) {
				System.out.print("Given number is "+i+" is Even");
			}else {
				System.out.print("Given number is "+i+" is odd");
			}
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			for(int j=2;j<=i/2;++j) {
				if(i%j==0) {
					list1.add(j);
					flag = true;
				}
			}
			if(list1.size()!=0 && flag==true) {
				System.out.println(" & not a Prime Number & factors are : " +list1);
			}
			if(flag==false) {
			System.out.println(" & prime");}
		}
		
	}

}
