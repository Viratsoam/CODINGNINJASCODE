/**
 * 
 */
package Patterns1and2;

/**
 * @author virat
 *
 */
public class Allpattern2programs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void MirrorImageNumberPattern(int n) {
		for(int i=1;i<=n;i++){
            for(int s=i;s<n;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
	}
	public static void InvertedNumberPattern(int n) {
		for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
	}
	public static void StarPattern(int n) {
		for(int i=1;i<=n;i++){
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}
	public static void TriangleofNumbers(int n) {
		for(int i=1;i<=n;i++){
            int val1 = i;
            int val = 0;
            for(int k=n;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j<=((2*i-1)/2)+1){
                    System.out.print(val1);
                    val = val1;
                    val1+=1;
                }else{
                    val-=1;
                    System.out.print(val);
                }
            }
            System.out.println();
        }
	}
	public static void diamondOfStars(int n) {
		//Your Code goes here
        if(n%2!=0){
        for(int i=1;i<=(n/2)+1;i++){
            for(int k=(n/2)+1;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-((n/2)+1);i>=1;i--){
            for(int j=i+1;j<n-((n/2))+1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
            
        }else{
            for(int i=1;i<=(n/2)+1;i++){
            for(int k=(n/2);k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-((n/2)+1);i>=1;i--){
            for(int j=i;j<=n-(n/2);j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
            
        }
	}
	public static void HalfDiamondPattern(int n) {
		int count=0;
        int count1 = 0;
        int val = ((2*n-1)-n);
        int i =0;
        for(i=0;i<=2*n-1;i++){
            System.out.print("*");
            count = 0;
            if(i<=n){
            for(int j=1;j<=2*i-1;j++){
                if(count<i){
                    count+=1;
                    count1 = count;
                    System.out.print(count);
                }else{
                    count1-=1;
                    System.out.print(count1);
                }
            }
            }else{
                for(int j=1;j<=2*val-1;j++){
                    if(count<val){
                        count+=1;
                        count1 = count;
                        System.out.print(count);
                    }else{
                        count1-=1;
                        System.out.print(count1);
                    }
                }
                val = val -1;
            }
            if(i>=1){
            System.out.print("*");
            }
            System.out.println();
        }
        if(i==0){
            System.out.println("*");
        }
        System.out.println("*");

	}
	
	public static void ParallelogramPattern(int n) {
		for(int i=0;i<n;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}
	public static void SumPattern(int n) {
		for(int i=1;i<=n;i++){
            String str = "";
            int sum = 0;
            for(int j=1;j<=i;j++){
                if(i>1 && j<i){
                str = str + j + "+";
                }
                if(i==1 || j==i){
                    str = str + j;
                }
                sum+=j;
            }
            System.out.println(str + "=" + sum);
        }
	}
	public static void OddSquare(int n) {
		int arr[] = new int[n];
        int num = 1;
        for(int i=0;i<n;i++){
            arr[i] = num;
            num+=2;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            for(int j=i+1;j<n;j++){
                System.out.print(arr[j]);
            }
            for(int j=0;j<i;j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
		
	}
}
	

