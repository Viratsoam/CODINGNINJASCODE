package HackerRank;
import java.util.*;
public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		sockMerchant(9,arr);
	}
	 public static void sockMerchant(int n, int[] ar) {
	        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
	        int count=0;
	        for(int i=0;i<n;i++){
	            if(map.containsKey(ar[i])){
	                count++;
	                //map.put(ar[i],false);
	                map.remove(ar[i]);
	                continue;
	            }
	            map.put(ar[i],true);
	        }
	        System.out.println(count);
	    }
}
