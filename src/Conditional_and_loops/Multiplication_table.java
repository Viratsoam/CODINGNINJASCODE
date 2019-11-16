/**
 * 
 */
package Conditional_and_loops;

import java.util.Scanner;

/**
 * @author virat
 *
 */
public class Multiplication_table {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }

	}

}
