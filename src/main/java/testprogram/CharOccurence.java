package testprogram;


public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JagadishBR";
		
		char[] ch = str.toCharArray();
		for(Character k: ch) {
			String j = k.toString();
		System.out.print("Occurance of "+j+" = ");
		System.out.println(str.chars().filter(e->(char)e==k).count());
	}
	}
}
