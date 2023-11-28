package sampleJavaProject;

public class SDETProgram8 {
	
	//Check the number of occurrence of a char in given String using Lambda
	
	//function to check the occurrence
	public static long getCharOccurrence(String str, Character c) {
		return str.chars().filter(e -> (char)e == c).count();
	}
	
	public static void main(String[] args) {
		System.out.println("Number of occrentce of Given char in the string: " +getCharOccurrence("Jagadish", 'a'));
		
	}

}
