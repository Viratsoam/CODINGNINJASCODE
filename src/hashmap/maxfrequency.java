package hashmap;
//import java.security.KeyStore.Entry;
import java.util.*;
import java.util.LinkedHashMap;
public class maxfrequency {
	public static int maxFrequencyNumber(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int max =0;
        int ans = 0;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
            	int val = map.get(arr[i]);
            	val+=1;
               map.put(arr[i],val);
            }else {
            	map.put(arr[i], 1);
            }    
        }
        for(Map.Entry<Integer, Integer> val:map.entrySet()) {
        	if(max<val.getValue()) {
        		ans = val.getKey();
        		max = val.getValue();
        	}
        }
        return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6};
			System.out.println(maxFrequencyNumber(arr));
	}

}
