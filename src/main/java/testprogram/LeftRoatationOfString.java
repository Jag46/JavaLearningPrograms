package testprogram;

public class LeftRoatationOfString {
			
		// function that rotates s towards left by d
		static String leftrotate(String str, int d)
		{
				String ans = str.substring(d) + str.substring(0, d);
				return ans;
		}

		// function that rotates s towards right by d
		static String rightrotate(String str, int d)
		{
				String ans = str.substring(str.length()-d) + str.substring(0, str.length()-d);
				return ans;
		}

		// Driver code
		public static void main(String args[])
		{
				String str1 = "Jagadish";
				System.out.println(leftrotate(str1, 2));

				String str2 = "Jagadish";
				System.out.println(rightrotate(str2, 2));
		}


}
