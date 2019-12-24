/**
 * 
 */
package LinkedList;

/**
 * @author virat
 *
 */
public class LL {

	/**
	 * @param args
	 * @return 
	 */
	
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
		 Node<Integer> node1 = new Node<Integer>(10);
		    Node<Integer>head=node1;
		    for(int i=2;i<5;i++)
		    {
		        Node<Integer> node2 = new Node<Integer>(i*10);
		        node1.next = node2;
		        node1=node2;
		    }
		    print(head);

	}

}
