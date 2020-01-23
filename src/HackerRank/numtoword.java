package HackerRank;

import java.math.BigInteger;

public class numtoword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 1238237764;
		System.out.println(convertNumberTowords(num));
		
	}
	static String one[] = {"","one ","two ","three ","four ","five ","six ","seven ",
			"eigth ","nine ","ten ","eleven ","twelve ",
			"thirteen ", "fourteen ", "fifteen ", 
	        "sixteen ", "seventeen ", "eighteen ", 
	        "nineteen "
	};
	static String ten[] = {"","","twenty ", "thirty ", "forty ", 
	        "fifty ", "sixty ", "seventy ", "eighty ", 
	        "ninety "};
	
	public static String findword(int num,String str) {
		String out = "";
		if(num>19) {
			out+= ten[num/10] + one[num%10];
		}else {
			out+=one[num];
		}
		if(num !=0) {
			out+=str;
		}
		return out;
	}
	public static String convertNumberTowords(long num) {
		String out = "";
		out+=findword((int)(num/1000000000),"billion ");
		//num = num/1000000000;
		out+=findword((int)((num/100000000)%10),"million ");
		out+=findword((int)((num/1000000)%100),"crore ");
		out+=findword((int)((num/100000)%100),"lakh ");
		out+=findword((int)((num/10000)%100),"thousands ");
		out += findword((int)((num/1000)%100),"hundred ");
		if(num>100 && num%100>0) {
			out+="and ";
		}
		
		out += findword((int)(num%100),"");
		return out;
	}
}
