package testprogram;

public class SwapStrings {
	
	public SwapStrings() {
		super();
		// TODO Auto-generated constructor stub
	}

	int a;
	int b;
	
	public SwapStrings(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Namratha";
		String b = "Jags";
		a = a.concat(b);
		b = a.substring(0, (a.length()-b.length()));
		System.out.println(b);
		a = a.substring(b.length());
		System.out.println(a);

	}

}
