/**
 * 
 */
package Recursion1;

import java.util.Scanner;

/**
 * @author virat
 *
 */
public class PMI {

	/**
	 * @param args
	 */
	public static void PMI(int n,int ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		ans+=n;
		PMI(n-1,ans);
	}
	public static int PMI(int n) {
		if(n==0) {
			return 0;
		}
		return n+PMI(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		/*
		 To find the sum of all the natural number is => n(n+1)/2
		 PMI => Principle of Math. Induction
		 */
		//System.out.println((n*(n+1))/2);
		System.out.println(PMI(n));
		PMI(n,0);
	}

}
