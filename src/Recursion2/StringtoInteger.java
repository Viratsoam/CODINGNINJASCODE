/**
 * 
 */
package Recursion2;

/**
 * @author virat
 *
 */
public class StringtoInteger {

	/**
	 * @param args
	 */
	public static int num1 = 0;
	public static int pow(int num,int x) {
		if(x==0) {
			return 1;
		}
		return num*pow(num,x-1);
	}
    
    public static int convertStringToInt(String input,int sum,int num,String str){
        if(input.length()==0){
            return 1;
        }
        sum = Integer.parseInt(""+input.charAt(0));
        convertStringToInt(input.substring(1),sum,num,str);
        num = num+sum*pow(10,str.length()-input.length());
        num1 = num1 + num;
        return num1; 
        
    }
    
	public static int convertStringToInt(String input){
		// Write your code here
        int len = input.length();
        int sum = 0;
        String str = input;
        int ans = convertStringToInt(input,sum,0,str);
        return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertStringToInt("1231"));
	}

}
