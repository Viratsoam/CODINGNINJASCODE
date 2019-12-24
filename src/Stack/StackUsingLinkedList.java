package Stack;

public class StackUsingLinkedList<T> {

	private Node<T> head;
	private int size;
	
	public StackUsingLinkedList() {
		head = null;
		size = 0;
	}
	public int size() {
		
		return size;
	}
	public void push(T ele) {
		Node<T> nn = new Node<T>(ele);
		nn.next = head;
		head = nn;
		size++;
		
	}
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}
	
	public T pop() throws Exception {
		if(head==null) {
			throw new Exception("Stack is Empty!!");
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	public void display() {
		Node<T> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}
