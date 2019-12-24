package Stack;

import java.util.Stack;

public class problems {
	public static boolean checkBalanced(String str) {
		// Write your code here
        
         Stack st = new Stack<>();
 
         
         for(int i = 0; i < str.length(); i++) {
 
                if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(') {
                   st.push(str.charAt(i));
 
        } else if (!st.empty() && (str.charAt(i)==']' && (char)st.peek()=='[') || 
                        (str.charAt(i)=='}' && (char)st.peek()=='{') ||
                        (str.charAt(i)==')' && (char)st.peek()=='(')) {
                       st.pop();
            } 
            }
 
         if(st.empty()) {
              return true;
         } else {
              return false;
         }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkBalanced("{ a + [ b+ (c + d)] + (e + f) }"));
	}

}
