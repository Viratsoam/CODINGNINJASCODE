package hashmap;
import java.util.ArrayList;
import java.util.HashMap;
public class PrintIntersection {

	
	public static void intersection(int[] arr1, int[] arr2){
		HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		for(int i=0;i<arr1.length;i++) {
			if(map1.containsKey(arr1[i])){
				int val = map1.get(arr1[i]);
				map1.put(arr1[i], val+1);
			}else
				{
				map1.put(arr1[i],1);
				}
		}
        for(int i=0;i<arr2.length;i++) {
        	if(map1.containsKey(arr2[i])) {
        		int val = map1.get(arr2[i]);
        		if(val>0) {
        			System.out.println(arr2[i]);
        			map1.put(arr2[i], val-1);
        		}
        	}
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2, 6, 8, 5, 4, 3};
		int arr2[] = {2, 3, 4, 7};
		
		intersection(arr1,arr2);

	}

}
