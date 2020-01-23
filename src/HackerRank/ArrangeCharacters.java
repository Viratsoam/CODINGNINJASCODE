package HackerRank;

import java.util.Arrays;
import java.util.HashMap;

public class ArrangeCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "avlr";
		String str1 = "sales is the something";
		System.out.println(ans(str,str1));

	}
public static String ans(String str, String str1) {
	int j = 0;
	int i = 0;
	String common = str;
	HashMap<String,String> map = new HashMap<>();
 	while(j<str1.length()) {
 		if(i==str.length())
			i=0;
		if(i<str.length()) {
			if(map.containsKey(""+str.charAt(i))) {
				String temp = map.get(""+str.charAt(i));
				map.put(""+str.charAt(i),temp+str1.charAt(j));
			}else {
				map.put(""+str.charAt(i),""+str1.charAt(j));
			}
			
		}
		i++;
		j++;
	}
 	char[] ch=str.toCharArray();
 	Arrays.sort(ch);
 	String nstr = new String(ch);
 	String ans = common;
 	for(int k=0;k<nstr.length();k++) {
 		if(map.containsKey(""+nstr.charAt(k))) {
 			String temp = map.get(""+nstr.charAt(k));
 			ans+=temp;
 		}
 	}
 	return ans;
	
}
}
