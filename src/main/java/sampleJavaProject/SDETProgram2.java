package sampleJavaProject;

public class SDETProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given Number
		int num = 12121;
		int rev = 0;
		//store it in variable
		int reverseNum = num;
		//Loop to reverse the number
		while(num>0) {
			int reminder = num % 10; //2
			rev = rev * 10 + reminder; //12
			num = num / 10;		//1
		}
		System.out.println("Reversed number is "+rev);
		//check palindrome
		if(rev==reverseNum) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("Given number not a palindrome");
		}

	}

}
