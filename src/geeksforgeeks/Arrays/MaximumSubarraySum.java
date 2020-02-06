package geeksforgeeks.Arrays;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-3,8,-2,4,-5,6};
		int ans = sum(arr);
		System.out.println(ans);
	}
	public static int sum(int arr[]) {
		int ans = arr[0];
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			max = Math.max(max+arr[i], arr[i]);
			ans = Math.max(max,ans);
		}
		return ans;
	}
}
