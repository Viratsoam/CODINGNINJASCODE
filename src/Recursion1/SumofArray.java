/**
 * 
 */
package Recursion1;

/**
 * @author virat
 *
 */
public class SumofArray {

	/**
	 * @param args
	 */
	public static int SumofArray(int arr[]) {
		if(arr.length==0) {
			return 0;
		}
		int smallans[] = new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallans[i-1]=arr[i];
		}
		return arr[0]+ SumofArray(smallans);
	}
	public static void SumOfArray(int arr[],int sum) {
		if(arr.length<=1) {
			sum+=arr[0];
			System.out.println(sum);
			return;
		}
		sum+=arr[0];
		int smallans[] = new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallans[i-1]=arr[i];
		}
		SumOfArray(smallans,sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9, 8, 9};
		SumOfArray(arr,0);
		System.out.println(SumofArray(arr));

	}

}
