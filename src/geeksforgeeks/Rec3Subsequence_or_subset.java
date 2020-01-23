package geeksforgeeks;

import java.util.ArrayList;

public class Rec3Subsequence_or_subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> out = ans("abc");
		System.out.println(out);

	}

	private static ArrayList<String> ans(String string) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ans = helper(string,"");
		return ans;
		
	}
	private static ArrayList<String> ans = new ArrayList();
	private static ArrayList<String> helper(String string,String curr) {
		// TODO Auto-generated method stub
		if(string.length()==0) {
			ans.add(curr);
			return ans;
		}
		
		helper(string.substring(1),curr); 
		helper(string.substring(1),curr+string.charAt(0));
		
		
		return ans;
		
	}

}
