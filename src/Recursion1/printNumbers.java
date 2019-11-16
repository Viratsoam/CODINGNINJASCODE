/**
 * 
 */
package Recursion1;

/**
 * @author virat
 *
 */
public class printNumbers {

	/**
	 * @param args
	 */
	public static void IncreasingOrderRecursively(int n) {
		if(n==0) {
			return;
		}
		IncreasingOrderRecursively(n-1);
		System.out.print(n+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncreasingOrderRecursively(5);
	}

}
