package HackerRank;

import java.math.BigInteger;

public class BigintegereMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// We should be used this when we have more than 10 digits in our multiplication! 
		
		BigInteger f = new BigInteger("1");
		
		for(int i=481;i<570;i++) {
			f = f.multiply(BigInteger.valueOf(i)); 
			  
		}
		System.out.println(f);

	}

}
