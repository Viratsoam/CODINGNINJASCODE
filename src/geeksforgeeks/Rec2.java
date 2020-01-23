package geeksforgeeks;

public class Rec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9987;
		//System.out.println(fun(n,0));
		System.out.println(fun1(n));
	}
	public static int fun(int n,int sum) {
		if(n==0) {
			return sum;
		}
		return fun(n/10,sum+=n%10);
	}
	public static int fun1(int n) {
		if(n<10) {
			return n;
		}
		return n%10+fun1(n/10);
	}
}
