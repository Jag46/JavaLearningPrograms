package testprogram;

public class RepeatProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatProgram());

	}
	
	public static long repeatProgram() {
		String s = "a";
		long n = 10;
		int i= (int) (n); 
		String S1 = s.repeat(i);
        String S2 = S1.substring(0, i);
        char ch = S2.charAt(0);
        return S2.chars().filter(e -> (char)e == ch).count();
	}

}
