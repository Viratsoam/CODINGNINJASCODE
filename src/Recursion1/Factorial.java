/**
 * 
 */
package Recursion1;

/**
 * @author virat
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
	}
	public static void fact(int n,int sum) {
		if(n==0) {
			System.out.println(sum);
			return;
		}
		if(n>0) {
			sum=sum*n;
		}
		System.out.println(sum);
		fact(n-1,sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		fact(n,1);
		fact(n);
	}

}
