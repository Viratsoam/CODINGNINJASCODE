package geeksforgeeks;

public class findmissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		System.out.println(missingNumber(arr,5));

	}
public static int missingNumber(int arr[], int n) { 
	    
	    // Your code here
	    int count = 0;
	    int xor=1;
	    for(int i=1;i<=n;i++){
	        xor = i;
	        xor=xor^arr[i-1];
	        
	    } 
	    return xor;
}
}