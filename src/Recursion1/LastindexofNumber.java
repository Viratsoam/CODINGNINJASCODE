/**
 * 
 */
package Recursion1;

/**
 * @author virat
 *
 */
public class LastindexofNumber {

	/**
	 * @param args
	 */
	public static int LastIndexofNumber(int arr[],int num,int i) {
		if(i==arr.length) {
			return -1;
		}
		int index = LastIndexofNumber(arr,num,i+1);
		if(index==-1)
		if(arr[i]==num)
			return index=i;
		
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,8,10,8};
		System.out.println(LastIndexofNumber(arr,9,0));

	}

}
