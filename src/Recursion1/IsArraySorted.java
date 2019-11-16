/**
 * 
 */
package Recursion1;

/**
 * @author virat
 *
 */
public class IsArraySorted {

	/**
	 * @param args
	 */
	public static boolean isArraysort(int arr[]) {
		if(arr.length<=1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		int smallarr[] = new int[arr.length-1];
		for(int i=1;i<smallarr.length;i++) {
			smallarr[i-1]= arr[i];
		}
		boolean checkans = isArraysort(smallarr);
		
		return checkans;
	}
	public static boolean isArraySorted(int arr[]) {
		if(arr.length<=1) {
			return true;
		}
		int newarr[] = new int[arr.length-1];
		for(int i=1;i<newarr.length;i++) {
			newarr[i-1] = arr[i];
		}
		boolean smallans = isArraySorted(newarr);
		if(!smallans) {
			return false;
		}
		if(arr[0]<=arr[1]) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,1,6,9,5};
		System.out.println(isArraySorted(arr));
		System.out.println(isArraysort(arr));

	}

}
