/**
 * 
 */
package LinkedList;

/**
 * @author virat
 *
 */
public class Node<T> {
	T data;
	Node head;
	Node<T> next;
	Node(T data){
		this.data = data;
		//next = null;
	}
	public Node<T> add(int new_data) 
    { 
        Node new_node = new Node(new_data); 
  
        if (head == null) 
        { 
            head = new Node(new_data); 
            return null; 
        } 
        new_node.next = null; 
        Node last = head;  
        while (last.next != null) 
            last = last.next; 
  
        last.next = new_node; 
        return head; 
    } 
	
}
