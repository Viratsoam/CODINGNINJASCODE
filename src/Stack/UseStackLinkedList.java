package Stack;

public class UseStackLinkedList {

	public static void main(String[] args) {
		StackUsingLinkedList<Integer> ob = new StackUsingLinkedList<Integer>();
		ob.push(10);
		ob.push(20);
		ob.push(40);
		ob.push(30);
		ob.display();
	}

}
