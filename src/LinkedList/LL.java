/**
 * 
 */
package LinkedList;

import java.util.LinkedList;

/**
 * @author virat
 *
 */
public class LL {

	/**
	 * @param args
	 * @return 
	 */

	public static Node<Integer> AddTwoNumber(Node<Integer> l1, Node<Integer> l2){
		if(l1== null) {
			return null;
		}
		if(l2==null) {
			return null;
		}
		
		Node<Integer> ans = l1;
		Node<Integer> prev = null;
		int c = 0;
		while(l1!=null && l2!=null) {
			int sum = l1.data + l2.data + c;
			int num = sum % 10;
			ans.data = num;
			ans.next = prev;
			prev = ans;
			c = sum/10;
			l1 = l1.next;
			l2 = l2.next;
		}
		while(l1!=null) {
			int sum = l1.data + c;
			int num = sum % 10;
			ans.data = num;
			ans.next = prev;
			prev = ans;
			c = sum /10;
			l1 = l1.next;
		}
		while(l2!=null) {
			int sum = l2.data + c;
			int num = sum % 10;
			ans.data = num;
			ans.next = prev;
			prev = ans;
			c = sum/10;
			l2 = l2.next;
		}
		return ans;
	}
	public static void print(Node<Integer> head){
	    Node<Integer> temp = head;

	    while(temp != null){
	        System.out.print(temp.data +" ");
	        temp = temp.next;
	    }
	    System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node<Integer> l1 = new Node<Integer>(null);
		 Node<Integer> l2 = new Node<Integer>(null);
//		 l1.add(1);
//		 l1.add(2);
//		 l1.add(3);
//		 LinkedList<Integer> l2 = new LinkedList<Integer>();
//		 l2.add(5);
//		 l2.add(6);
//		 l2.add(7);
		 
//		    Node<Integer>head=node1;
//		    for(int i=2;i<5;i++)
//		    {
//		        Node<Integer> node2 = new Node<Integer>(i*10);
//		        node1.next = node2;
//		        node1=node2;
//		    }
		Node<Integer> ans =  AddTwoNumber(l1,l2);
		    

	}

}
