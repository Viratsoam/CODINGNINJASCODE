/**
 * 
 */
package Recursion1;

/**
 * @author virat
 *
 */
public class FibonacciNumber {

	/**
	 * @param args
	 */
	public static int FibonacciNumber(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int fbn1=FibonacciNumber(n-1);
		int fbn2 = FibonacciNumber(n-2);
		return fbn1+fbn2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FibonacciNumber(5));
	}

}
