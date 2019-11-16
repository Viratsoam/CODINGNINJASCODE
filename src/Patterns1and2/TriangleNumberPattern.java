/**
 * 
 */
package Patterns1and2;

import java.util.Scanner;

/**
 * @author virat
 *
 */
public class TriangleNumberPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print(i);
	            }
	            System.out.println();
	        }
		
	}

}
/*
 N=4
1
22
333
4444
 */