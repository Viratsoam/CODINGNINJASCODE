package geeksforgeeks.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {1,2,3,4,5,6,7,8};
		reverse(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
public static void reverse(int arr[]) {
	int i = 0;
	int j = arr.length-1;
	while(i<j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
		j--;
	}
}
}
