/**
 * 
 */
package Arraysproblems.Array1;

/**
 * @author virat
 *
 */
public class Return_Array_Sum {

	/**
	 * @param args
	 */
	public static int sum(int arr[]) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9, 8, 9};
		System.out.println(sum(arr));

	}

}
