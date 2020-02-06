package geeksforgeeks.Arrays;

import java.util.Scanner;

public class MaximumlengthEvenOddSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int arr[] = {5,10,20,6,3,8};
//		int arr[] = {7,10,13,14};
		int ans = maxlen(arr);
		System.out.println(ans);
	}
	public static int maxlen(int arr[]) {
		int count = 1;
		int ans = 1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 && arr[i-1]%2==0) {
				count++;
				ans = Math.max(ans, count);
			}else {
				count = 1;
			}
	}
		return ans;
	}
}
