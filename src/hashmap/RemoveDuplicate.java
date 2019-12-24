package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,2,3,4,2,5,6,7,3,6};
		ArrayList<Integer> ans = removeDuplicate(arr);
		System.out.println(ans);
	}

	private static ArrayList<Integer> removeDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer,Boolean> map = new HashMap<>();
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			map.put(arr[i], true);
			output.add(arr[i]);
		}
		return output;
	}

}
