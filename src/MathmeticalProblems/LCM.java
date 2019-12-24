package MathmeticalProblems;

public class LCM {
	
	// Find the LCM of two Numbers 
	public static int lcm(int a,int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		for(int i=max;;i+=max) {
			if(i%min==0) {
				return i;
			}
		}
	}
	public static int gcd(int a,int b) {
		if(a==0) {
			return b;
		}
		return gcd(b%a,a);
	}
	public static int lcm1(int a,int b) {
		return (a*b)/gcd(a,b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
