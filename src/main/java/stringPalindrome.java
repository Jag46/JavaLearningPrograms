
public class stringPalindrome {

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
		//Check for palindrome

	}

}
