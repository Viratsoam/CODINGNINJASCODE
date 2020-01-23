package geeksforgeeks;

public class Rec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun1(5);
	}
public static void fun1(int n) {
	if(n==0) {
		return;
	}
	//System.out.println(n);
	fun1(n);
	System.out.println(n);
}
}
