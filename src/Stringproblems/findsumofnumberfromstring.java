package Stringproblems;

public class findsumofnumberfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ans("hello57dk25vikas4"));
	}
	public static int ans(String str) {
		String ans = "";
		int sum = 0;
		int a[] = {0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				ans+=str.charAt(i);
			}else {
				if(!ans.equals("")) {
					sum+= Integer.parseInt(ans);
					ans="";
				}
			}
		}
		if(!ans.equals(""))
		sum+=Integer.parseInt(ans);
		return sum;
	}
}
