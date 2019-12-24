/**
 * 
 */
package Recursion1;

/**
 * @author virat
 *
 */
public class FirstIndexofNumber {

	/**
	 * @param args
	 */
	public static int firstindexofnumber(int arr[],int num,int i) {
		if(i==arr.length-1) {
			return -1;
		}
		if(arr[i]==num) {
			return i;
		}
		return firstindexofnumber(arr,num,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9, 8, 10, 8};
		//use helper function inside the function
		System.out.println(firstindexofnumber(arr,11,0));
	}

}
