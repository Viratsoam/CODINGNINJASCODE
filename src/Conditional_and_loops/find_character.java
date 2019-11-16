/**
 * 
 */
package Conditional_and_loops;

import java.util.Scanner;

/**
 * @author virat
 *
 */
public class find_character {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       char ch = sc.next().charAt(0);
		        if((int)ch>=65 && (int)ch<=90){
		            System.out.println(1);
		        }else if((int)ch>=99 && (int)ch<=122){
		            System.out.println(0);
		        }else{
		            System.out.println(-1);
		        }
	}

}
/*
 Find Character Case
Send Feedback
Write a program to determine whether the entered character is in uppercase or lowercase, or is an invalid character.
Print
 1 for uppercase
 0 for lowercase 
-1 for any other character (special characters or others)
Input format :
Single Character
Output format :
1 or 0 or -1
Sample Input 1 :
v
Sample Output 1 :
0
Sample Input 2 :
V
Sample Output 2 :
1
Sample Input 3 :
#
Sample Output 3 :
-1

 
 */