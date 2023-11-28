package sampleJavaProject;
public class SDETProgram1 {

	public static void main(String[] args) {
		
		//Given string
		String str = "Radar";
		//Reverse String
		String reverseStr = "";
		//String Length
		int strLength = str.length();
		//Looping of string to reverse
		for(int i=(strLength-1);i>=0;i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		System.out.println("Given string is "+str);
		System.out.println("Reversed string is "+reverseStr);
		
		//Check for palindrome
		if(str.equalsIgnoreCase(reverseStr)) {
			System.out.println("String is a palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}
	}

}