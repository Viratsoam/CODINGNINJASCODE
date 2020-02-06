package geeksforgeeks.Arrays;

import java.util.Scanner;

public class Rotatebyone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int ar[] = {1,2,3,4,5,6,7,8}; 
		//rotateByOne(ar);

//		Reversal Algorithm to rotate the array  by 'k'.
		rotateByK(ar,0,k-1);
		rotateByK(ar,k,ar.length-1);
		rotateByK(ar,0,ar.length-1);
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
	
//	Reversal algorithm to rotate the array by K position
	
public static void rotateByK(int arr[],int start,int end) {
	while(start < end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		end--;
		start++;
		
	}
}
	
public static void rotateByOne(int arr[]) {
	for(int i=0;i<arr.length-1;i++) {
		int temp = arr[i];
		arr[i] = arr[i+1];
		arr[i+1] = temp;
	}
}
}
