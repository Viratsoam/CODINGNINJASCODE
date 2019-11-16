/**
 * 
 */
package Recursion1;

/**
 * @author virat
 *
 */
public class countNumber {

	/**
	 * @param args
	 */
	public static int CountNumber(int num) {
		if(num==0) {
			return 0;
		}
		int small = CountNumber(num=num/10);
		return small+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CountNumber(64321));

	}

}
