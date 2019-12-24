/**
 * 
 */
package Arraysproblems.Array1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author virat
 *
 */
public class Array1Allproblems {

	/**
	 * @param args
	 */
	
	public static int max(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int LinearSearch(int arr[], int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}
	public static int[] arrange(int n) {
		int arr[] = new int[n];
		int k = 0;
		int count1 = 1;
		if(n%2==0) {
			int count2 = n;
			for(int i=0;i<n;i++) {
				if(i<n/2) {
					arr[k]= count1;
					count1+=2;
					k++;
				}else {
					arr[k] = count2;
					count2-=2;
					k++;
				}
			}
		}else {
			int count2 = n-1;
			for(int i=0;i<n;i++) {
				if(i<(n/2)+1) {
					arr[k]= count1;
					count1+=2;
					k++;
				}else {
					arr[k] = count2;
					count2-=2;
					k++;
				}
			}
		}
		
		return arr;
	}
	public static void printAllPairs(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}
	public static int[] SwapAlternate(int arr[]) {
			for(int i=0;i<arr.length-1;i+=2) {
				int temp = arr[i];
				arr[i]= arr[i+1];
				arr[i+1] = temp;
			}	
		
		
		return arr;
	}
	// It's work only when we have two duplicates only
	public static int FindUnique(int arr[]) {
		int val = arr[0];
		for(int i=1;i<arr.length;i++) {
			val = val ^ arr[i];
		}
		return val;
	}
	public static void FindUnique1(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(arr[i]);
			}
		}
	}
	// Find unique element using HashMap o(n)
	public static int findunique2(int arr[]) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(arr.length);
		for(int val:arr) {
			Integer occurence = map.get(val);
			map.put(val,occurence==null?1:occurence+1);
		}
		for(Map.Entry<Integer, Integer> ans: map.entrySet()) {
			if(ans.getValue()==1) {
				return ans.getKey();
			}
		}
		return -1;
	}
	// Find duplicate in o(n) using hashmap
	public static void duplicate(int arr[]) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(arr.length);
		for(int val:arr) {
			Integer occurence = map.get(val);
			map.put(val,occurence==null ?1:occurence+1);
		}
		for(Map.Entry<Integer, Integer> e: map.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey());
			}
		}
	}
	
	public static int duplicate1(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	public static void ArrayIntersection(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
	// It's only work on Sorted Arrays
	public static void printIntersection(int arr1[],int arr2[],int m, int n) {
		int i = 0, j = 0; 
	      while (i < m && j < n) 
	      { 
	        if (arr1[i] < arr2[j]) 
	          i++; 
	        else if (arr2[j] < arr1[i]) 
	          j++; 
	        else 
	        { 
	          System.out.print(arr2[j++]+" "); 
	          i++; 
	        } 
	      } 
	}
	public static void ArrayIntersection1(int arr1[],int arr2[]) {
		
		printIntersection(arr1,arr2,arr1.length,arr2.length);
	}
	
	// PairSum problem
	public static void PairSum(int arr1[],int n) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=i;j<arr1.length;j++) {
				if(i!=j && arr1[i]+arr1[j]==n) {
					if(arr1[i]>arr1[j]) {
						System.out.println("("+arr1[j]+", "+arr1[i]+")");
					}else {
						System.out.println("("+arr1[i]+", "+arr1[j]+")");
					}
				}
					
			}
		}
	}
	// Better Approach for pairSum problem o(n)
	public static void PairSum1(int []arr1,int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			int val = n - arr1[i];
			if(set.contains(val)) {
				if(arr1[i]>val) {
					System.out.println("("+val+", "+arr1[i]+")");
				}else {
					System.out.println("("+arr1[i]+", "+val+")");
				}
			}
			set.add(arr1[i]);
		}
	}
	
	
	public static void TripletSum(int arr1[],int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr1.length-2;i++) {
			int val = n - (arr1[i]+arr1[i+1]+arr1[i+2]);
			if(set.contains(val)) {
				int max = Math.max(Math.max(val,arr1[i+2]), Math.max(arr1[i],arr1[i+1]));
				int min = Math.min(Math.min(val,arr1[i+2]),Math.min(arr1[i], arr1[i+1]));
				System.out.println(min+" "+val+" "+max);
			}
			set.add(arr1[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr2[] = {2,6,8,5,4,3};
//		int arr1[] = {2, 3, 4, 7 };
		int arr1[] = {1, 2, 4, 5, 6}; 
        int arr2[] = {2, 3, 5, 7}; 
        int arr[] = {1,2,3,4,5,6,7};
		//ArrayIntersection1(arr1,arr2);
		//PairSum1(arr1,7);
		TripletSum(arr,12);
//		int ans[] = SwapAlternate(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(ans[i]+" ");
//		}
//		int arr[] = {1,4,7,6,5};
//		printAllPairs(arr);
		
//		System.out.println(FindUnique(arr));
//		FindUnique1(arr);
		//duplicate(arr);
	}

}
