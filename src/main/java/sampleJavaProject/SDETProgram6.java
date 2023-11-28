package sampleJavaProject;

import java.util.Scanner;

public class SDETProgram6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number check the odd or even: ");
		int inputValue = scan.nextInt();
		if(inputValue%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		
	}
}
