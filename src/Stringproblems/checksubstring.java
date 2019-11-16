/**
 * 
 */
package Stringproblems;

/**
 * @author virat
 *
 */
public class checksubstring {

	/**
	 * @param args
	 */
	public static int pow(int num,int x) {
		if(x==0) {
			return 1;
		}
		return num*pow(num,x-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xpix";
		//System.out.println(str.substring(1,3));
		//int num = 12345;
		String ch ="12";
		int num1 = 0;
		int len = 1;
		len = Integer.parseInt(ch);
		num1 = num1+len*pow(10,ch.length()-1);
		System.out.println(num1);
	}

}
