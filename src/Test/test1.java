/**
 * 
 */
package Test;

import java.util.Scanner;

/**
 * @author virat
 *
 */
public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void Palindromenumber(int n) {
		int rev = 0;
        int check = n;
        while(n!=0){
            int num = n%10;
            rev = rev*10 + num;
            n = n /10;
        }
        if(rev == check){
        System.out.println("true");    
        }else{
            System.out.println("false");
        }
	}
	public static void CheckAP(int n, int a1,int a2) {
		Scanner sc = new Scanner(System.in);
		int cd = a2 - a1;
        for(int i=0;i<n-2;i++){
            int fm = a2;
            a2 = sc.nextInt();
            if((a2-fm)!= cd){
                System.out.println("false");
                return;
            }
            
        }
        System.out.println("true");
	}
	public static void NumberStarpattern1(int n) {
		for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j==i){
                System.out.print("*");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }

	}
}
