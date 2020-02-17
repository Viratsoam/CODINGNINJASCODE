package geeksforgeeks.LinkedListGeeks;

public class LL<T> {
	private Node head;
	private int count = 0;
	public void insertFront(int x) {
		Node<T> nn = new Node(x);
		nn.next = head;
		head = nn;
		count++;
	}
	public int size() {
		return count;
	}
	public void insertEnd(int x) {
		Node nn = new Node(x);
		if(head==null) {
			head = nn;
			count++;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		count++;
		temp.next = nn;
	}
	public void diplay() {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
}
