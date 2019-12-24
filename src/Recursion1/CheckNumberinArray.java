/**
 * 
 */
package Recursion1;

/**
 * @author virat
 *
 */
public class CheckNumberinArray {

	/**
	 * @param args
	 */
	public static boolean CheckNumberinArray(int arr[],int num) {
		if(arr.length==0) {
			return false;
		}
		if(arr[0]==num) {
			return true;
		}
		int smallans[] = new int[arr.length-1];
		for(int i=1;i<smallans.length;i++) {
			smallans[i-1]=arr[i];
		}
		boolean ans = CheckNumberinArray(smallans,num);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9, 7, 10};
		int num = 8;
		System.out.println(CheckNumberinArray(arr,num));
	}

}
