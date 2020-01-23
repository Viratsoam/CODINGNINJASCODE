package Goodtecher;

import java.util.HashMap;

public class twoSum {
	
	// Simple approach 
	public static int[] fun1(int ar[], int target) {
		// 0(n^2)
		int arr[] = new int[2];
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length-1;j++) {
				if(i!=j && ar[i]+ar[j]==target) {
					arr[0] = ar[j];
					arr[1] = ar[i];
					break;
				}
			}
		}
		return arr;
		
	}
	// Two pointer approach
	public static int[] fun2(int ar[], int target) {
		// array should be sorted in this case "It's called two pointer approach"
		int ans[] = new int[2];
		int i = 0;
		int j = ar.length-1;
		while(i<j) {
			if(ar[i]+ar[j]==target) {
				ans[0] = ar[j];
				ans[1] = ar[i];
				break;
			}else if(ar[i]+ar[j]>target) {
				j--;
			}else {
				i--;
			}
		}
		return ans;
	}
	
	// HashMap approach better solution
	public static int[] fun3(int ar[],int target) {
		// 0(n)
		int ans[] = new int[2];
		HashMap<Integer,Integer> map = new HashMap(); 
		for(int i=0;i<ar.length;i++) {
			if(map.containsKey(target-ar[i])) {
				ans[0] = map.get(target-ar[i]);
				ans[1] = i;
				break;
			}
			map.put(ar[i], i);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {2, 7, 11, 15};
		int target = 9;
		int ans[] = fun3(ar,target);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
