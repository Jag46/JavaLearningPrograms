package sampleJavaProject;

public class SDETProgram4 {
	//Write a Java Program to reverse a string without using String inbuilt function reverse().
	    public static void main(String[] args) {
	        String str = "Saket Saurav";
	        char[] chars = str.toCharArray();  // converted to character array and printed in reverse order
	        for(int i= chars.length-1; i>=0; i--) {
	            System.out.print(chars[i]);
	        }
	    }

}
