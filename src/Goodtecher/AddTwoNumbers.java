package Goodtecher;

import java.util.LinkedList;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll1 = new LinkedList();
		LinkedList<Integer> ll2 = new LinkedList();
		ll1.add(2);
		ll1.add(4);
		ll1.add(3);
		ll2.add(5);
		ll2.add(6);
		ll2.add(4);
		LinkedList<Integer> dummy=addtwoNumbers(ll1,ll2);
		while(!dummy.isEmpty()) {
			System.out.print(dummy.remove());
		}	
		
	}
	public static LinkedList addtwoNumbers(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
		LinkedList<Integer> dummy = new LinkedList();
		int carry = 0;
		while(!ll1.isEmpty() && !ll2.isEmpty()) {
			int sum = (carry + ll1.remove() + ll2.remove());
			carry = sum/10;
			dummy.add(sum%10);
		}
		while(!ll1.isEmpty()) {
			int sum = (carry + ll1.remove());
			carry = sum/10;
			dummy.add(sum%10);
		}
		while(!ll2.isEmpty()) {
			int sum = (carry + ll2.remove());
			carry = sum/10;
			dummy.add(sum%10);
		}
		if(carry != 0) {
			dummy.add(carry);
		}
		
		return dummy;
	}

}
