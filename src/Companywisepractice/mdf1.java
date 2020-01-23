package Companywisepractice;

public class mdf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 78, y = 88, z = 68;
		int c = 0;
//		while( x>0 || y>0 || z>0) {
//			x--;
//			y--;
//			z--;
//			c++;
//		}
	
		//System.out.println(findlargest(x,y,z));
		System.out.println(fact(48));
	}
	public static int findlargest(int x, int y, int z) {
		
		if ((y / x) == 0)
            return ((y / z) == 0) ? z : y; 
		
        return ((x / z) == 0) ? z : x; 
	}
	public static long fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
}
