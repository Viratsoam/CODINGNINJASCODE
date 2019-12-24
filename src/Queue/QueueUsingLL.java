package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLL<T> {  
	private Node<T> front;
	private Node<T> rear;
	private int size;
	//Queue<T> nn = new LinkedList<T>();

	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enque(T elem) {
		
	}
//	public T front(){
//		
//	}
//	public T deque() {
//		
//	}
}
