package hashmap;

import java.util.HashMap;
import java.util.Map;

public class maxfrequencychar {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		String str = "asabhdnbsjgsdufbsandjlkfhgauofg";
		mAXfQ(str);
	}
	 public static void mAXfQ(String str) {
		 HashMap<Character,Integer> map = new HashMap<>();
		 int max = Integer.MIN_VALUE;
		 for(int i=0;i<str.length();i++) {
			 if(map.containsKey(str.charAt(i))) {
				 int val = map.get(str.charAt(i));
				// System.out.println(val);
				 map.put(str.charAt(i),val+1);
				 continue;
			 }
			 map.put(str.charAt(i),1);
		 }
		 char ch = ' ';
		 for(Map.Entry<Character,Integer> val: map.entrySet()) {
			 int ans = val.getValue();
			 
 			 if(ans>=max) {
				 max = ans;
				 ch = val.getKey();
			 }
		 }
		 System.out.println(max);
		 System.out.println(ch);
	 }
}
