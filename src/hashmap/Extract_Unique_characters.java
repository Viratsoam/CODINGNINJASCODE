package hashmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Extract_Unique_characters {
	
	public static String uniqueChar(String str){
		LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		String ans = "";
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i)+"")) {
				continue;
			}else {
				map.put(str.charAt(i)+"",1);
				ans+=str.charAt(i);
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
