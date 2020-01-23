package geeksforgeeks;

public class Rec3Maxcut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Maxcut(23,12,9,11));
	}
	public static int Maxcut(int n,int a,int b,int c) {
		if(n<0) {
			return -1;
		}
		if(n==0) {
			return n;
		}
		
		int ans=Math.max(Maxcut(n-a,a,b,c),Math.max(Maxcut(n-b,a,b,c), Maxcut(n-c,a,b,c)));
		if(ans<0) {
			return -1;
		}else {
			return 1+ans;
		}
	}
}
