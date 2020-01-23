package geeksforgeeks;

public class subsetofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2^n
		find("abc");
	}
public static void find(String str) {
	int n = str.length();
	int rowsize = (int)Math.pow(2, n);
	for(int counter=0;counter<rowsize;counter++) {
		for(int j=0;j<n;j++) {
			if((counter&(1<<j))!=0) {
				System.out.print(str.charAt(j));
			}
		}
		System.out.println();
	}
	
}
}
