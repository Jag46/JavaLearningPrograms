package sampleJavaProject;

public class ReversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num = 121;
			int num2 = num;
			System.out.println(num2);
			while(num>1) {
				int rev = num % 10;
				System.out.print(rev);
				num = num / 10;
			}
		System.out.println(num);
	}

}
