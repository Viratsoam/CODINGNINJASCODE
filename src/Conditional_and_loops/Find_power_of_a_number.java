/**
 * 
 */
package Conditional_and_loops;

import java.util.Scanner;

/**
 * @author virat
 *
 */
public class Find_power_of_a_number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int n = sc.nextInt();
	        int ans = 1;
	        while(n!=0){
	            ans = ans * x;
	            n--;
	        }
	        System.out.println(ans);
	}

}
