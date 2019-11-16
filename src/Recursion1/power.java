/**
 * 
 */
package Recursion1;

/**
 * @author virat
 *
 */
public class power {

	/**
	 * @param args
	 */
	public static void pow(int n,int x,int ans) {
		if(x==0) {
			System.out.print(ans);
			return;
		}
		ans*=n;
		pow(n,x-1,ans);
	}
	
	public static int power(int n,int x) {
		if(x==0) {
			return 1;
		}
		int smallproblem = power(n,x-1);
		
		return n* smallproblem;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(5,3));
		pow(5,3,1);
	}

}
