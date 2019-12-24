/**
 * 
 */
package Recursion1;

/**
 * @author virat
 *
 */
public class isArraySortedbetter {

	/**
	 * @param args
	 */
	
	// This function check array is sorted or not from start index to end.
	public static boolean isArraySortedBetter(int a[],int start) {
		if(start==a.length-1) {
			return true;
		}
		if(a[start]>a[start+1]) {
			return false;
		}
		boolean result = isArraySortedBetter(a,start+1);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,5,4};
		System.out.println(isArraySortedBetter(arr,0));
	}

}
