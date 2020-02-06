package geeksforgeeks.Arrays;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,7,6,8,6,6,6,6};
		int n = arr.length/2;
		HashMap<Integer,Integer> map = new HashMap();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int val = map.get(arr[i]);
				map.put(arr[i],val+1);
				continue;
			}
			map.put(arr[i],1);
		}
		int i=0;
		for(i=0;i<arr.length;i++) {
			int val = map.get(arr[i]);
			if(val>n) {
				System.out.print(i+" ");
			}
		}
		
	}
}
