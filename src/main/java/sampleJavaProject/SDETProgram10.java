package sampleJavaProject;

public class SDETProgram10 {

		  public static void main(String[] args) {

		    int num = 6;
		    boolean flag = false;
		    for(int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (flag==false) {
		      System.out.println(num + " is a prime number.");}
		    else {
		      System.out.println(num + " is not a prime number.");
		  }
		  }
}
