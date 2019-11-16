/**
 * 
 */
package Conditional_and_loops;

import java.util.Scanner;

/**
 * @author virat
 *
 */
public class factors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        for(i=2;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }

	}

}
