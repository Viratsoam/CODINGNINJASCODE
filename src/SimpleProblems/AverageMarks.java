/**
 * 
 */
package SimpleProblems;

import java.util.Scanner;

/**
 * @author virat
 *
 */
public class AverageMarks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        char ch = sc.next().charAt(0);
	        int m1 = sc.nextInt();
	        int m2 = sc.nextInt();
	        int m3 = sc.nextInt();
	        int avg = (m1+m2+m3)/3;
	        System.out.println(ch);
	        System.out.println(avg);
	}

}
/*
Average Marks

Write a program to input name (as a single character) and marks of three tests of a student (all integers). Then calculate and print the name and average (integer) of all test marks.
All the test marks are integers and calculate average also as integer. That is, you need to print the integer part of average only, neglect the decimal part.

Input format :
Line 1 : Name (Single character)
Line 2 : 3 Test marks (separated by space)

Output format :
Name Average (in different lines)

Sample Input 1 :
A
3 4 6
Sample Output 1 :
A
4

 */