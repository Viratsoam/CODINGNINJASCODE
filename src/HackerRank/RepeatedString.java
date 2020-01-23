package HackerRank;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 1000000000;
		repeatedString("a",n);
	}
	public static long repeatedString(String s, long n) {
        String str = "";
        long count = 0;
    for(int i=0;i<n;i++){
    	for(int j=0;j<s.length();j++) {
    		if(str.length()<n){
                str += s.charAt(j);
            }else{
                break;
            }
        }
        
    }
    System.out.println(str);
    for(int i=0;i<str.length();i++) {
    	if(str.charAt(i)=='a') {
    		count++;
    	}
    }
   // System.out.println(count);
	return count;

}

}
