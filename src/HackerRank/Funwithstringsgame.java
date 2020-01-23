package HackerRank;

import java.util.*;
//import java.util.Scanner;

public class Funwithstringsgame {

	public static boolean ans(String s, String t){
        HashMap<Character,Character> map = new HashMap();
            for(int i=0;i<s.length();i++){
            	System.out.print(s.charAt(i)+" ");
                if(map.containsKey(s.charAt(i))){
                    char ch = map.get(s.charAt(i));
                    System.out.println(ch);
                    if(ch == t.charAt(i)){
                        continue;
                    }else{
                        
                        return false;
                    }
                }
                map.put(s.charAt(i),t.charAt(i));
            }
            
            return true;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        String t = sc.nextLine();
	        boolean ans = ans(s,t);
	        System.out.println(ans);

	}

}
