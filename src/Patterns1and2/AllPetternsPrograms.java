/**
 * 
 */
package Patterns1and2;

/**
 * @author virat
 *
 */
public class AllPetternsPrograms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void ReverseNumberPattern(int n) {
		for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
	}
	public static void AlphaPattern(int n) {
		for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+i));
            }
            System.out.println();
        }
	}
	public static void CharacterPattern(int n) {
		int count = 0;
        for(int i=0;i<n;i++){
            count = i;
            for(int j=0;j<=i;j++){
            System.out.print((char)(65+count));
                count+=1;
            }
            System.out.println();
        }
	}

	public static void InterestingAlphabets(int n) {
		int count = 65 + n;
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print((char)(count-j));
            }
            System.out.println();
        }
	}
	
}
