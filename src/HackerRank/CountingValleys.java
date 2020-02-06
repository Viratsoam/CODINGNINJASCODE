package HackerRank;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		System.out.println(countingValleys(n,s));
	}
	static int countingValleys(int n, String s) {
        int ans = 0;
        int ups = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='U'){
                    ups++;
                if(ups==0){
                    ans++;
                }
            }else{
                ups--;
            }
        }
        return ans;
    }
}
