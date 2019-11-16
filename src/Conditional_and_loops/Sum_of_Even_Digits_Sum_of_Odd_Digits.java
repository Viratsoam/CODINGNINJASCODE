/**
 * 
 */
package Conditional_and_loops;

import java.util.Scanner;

/**
 * @author virat
 *
 */
public class Sum_of_Even_Digits_Sum_of_Odd_Digits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        while(n!=0){
           int n1 = n % 10;
            if(n1%2==0){
                even = even + n1;
            }else{
                odd = odd + n1;
            }
            n = n/10;
        }
        System.out.println(even + "   " + odd);
	}

}
