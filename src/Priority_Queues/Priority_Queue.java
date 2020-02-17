package Priority_Queues;

import java.util.ArrayList;

public class Priority_Queue<T> {

	private ArrayList<Element<T>> heap;
	
	public Priority_Queue() {
		heap = new ArrayList<>();
	}
	
	public void insert(T value,int priority) {
		Element<T> e = new Element<>(value,priority);
		heap.add(e);
		
		int childIndex = heap.size()-1;
		int parentIndex = (childIndex - 1)/2;
		while(childIndex>0) {
			if(heap.get(childIndex).priority < heap.get(parentIndex).priority) {
				Element<T> temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;
			}else {
				return;
			}
		}
		
	}
	
	public int size() {
		return heap.size();
	}
	
	public T getMin() throws PriorityQueuesException {
		if(isEmpty()) {
			throw new PriorityQueuesException(); 
		}
		return heap.get(0).value;
	}
	
	private int parentNode(int index) {
		return (index-1)/2;
	}
	
	private int leftChildNode(int index) {
		return (2*index)+1;
	}
	
	private int rightChildNode(int index) {
		return (2*index)+2;
	}
	
	private boolean isLeaf(int index) {
		if(index>=(size()/2)&& index <= size()) {
			return true;
		}
		return false;
	}
	private void minHeapify(int index) 
    { 
  
        if (!isLeaf(index)) { 
            if (heap.get(index).priority > heap.get(leftChildNode(index)).priority 
                || heap.get(index).priority > heap.get(rightChildNode(index)).priority) { 
  
                if (heap.get(leftChildNode(index)).priority < heap.get(rightChildNode(index)).priority) { 
                    Element<T> temp = heap.get(index);
                    heap.set(index, heap.get(leftChildNode(index)));
                    heap.set(leftChildNode(index), temp);
                    minHeapify(leftChildNode(index)); 
                } 
   
                else { 
                	Element<T> temp = heap.get(index);
                    heap.set(index, heap.get(rightChildNode(index)));
                    heap.set(rightChildNode(index),temp);
                    minHeapify(rightChildNode(index)); 
                } 
            } 
        } 
    } 
	public T removeMin() throws PriorityQueuesException {
		if(isEmpty()) {
			throw new PriorityQueuesException(); 
		}
		Element<T> temp = heap.get(0);
		T ans = temp.value;
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parentIndex = 0;
		int leftChildIndex = 2*parentIndex+1;
		int rightChildIndex = 2*parentIndex+2;
		
		while(leftChildIndex < heap.size()) {
			int minIndex = parentIndex;
			if(heap.get(leftChildIndex).priority< heap.get(minIndex).priority) {
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < heap.size() && heap.get(rightChildIndex).priority < heap.get(minIndex).priority) {
				minIndex = rightChildIndex;
			}
			if(minIndex == parentIndex) {
				break;
			}
			
			Element<T> temp1 = heap.get(minIndex);
			heap.set(minIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp1);
			parentIndex = minIndex;
			leftChildIndex = 2*parentIndex+1;
			rightChildIndex = 2*parentIndex+2;
		}
		return ans;
	}
	
	public void display() {
		for(Element<T> val : heap) {
			System.out.print(val.priority);
		}
	}
	public boolean isEmpty() {
		
		return size()==0;
	}
}
