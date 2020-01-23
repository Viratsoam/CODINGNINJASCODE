package geeksforgeeks;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,5,7,30,11};
		//rotate(arr);
		//fun(arr);
		rotatebyN(arr,3);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	// Rotate by n
	
	public static void rotatebyN(int arr[], int n) {
		for(int i=0;i<n;i++) {
			int temp = arr[0];
			for(int j=1;j<arr.length;j++) {
				arr[j-1] = arr[j];
			}
			arr[arr.length-1]= temp;
		}
	}
	
	// Rotate by one
	public static void rotate(int arr[]) {
		
			int temp = arr[0];
			for(int j=1;j<arr.length;j++) {
				arr[j-1] = arr[j];
			}
			arr[arr.length-1] = temp;
		
	}

	
	// Reverse the Array
public static void fun(int [] arr) {
	int i=0;
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
