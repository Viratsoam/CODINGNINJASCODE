package Priority_Queues;

import java.util.ArrayList;

public class MAX_Priority {

	  private ArrayList<Integer> heap;

		public MAX_Priority() {
			heap = new ArrayList<Integer>();
		}

		boolean isEmpty(){
			return heap.size() == 0;
		}

		int getSize(){
			return heap.size();
		}

		int getMax() {
			
			return heap.get(0);
		}

		void insert(int element){
			heap.add(element);
			int childIndex = heap.size() - 1;
			int parentIndex = (childIndex - 1) / 2;

			while(childIndex > 0){
				if(heap.get(childIndex) > heap.get(parentIndex)){
					int temp = heap.get(childIndex);
					heap.set(childIndex, heap.get(parentIndex));
					heap.set(parentIndex, temp);
					childIndex = parentIndex;
					parentIndex = (childIndex - 1) / 2;
				}else{
					return;
				}
			}
		}
	   
		int removeMax()  {
			
	        int ans = heap.get(0);
			heap.set(0, heap.get(heap.size()-1));
			heap.remove(heap.size()-1);
			int parentIndex = 0;
			int leftChildIndex = 2*parentIndex+1;
			int rightChildIndex = 2*parentIndex+2;
			
			while(leftChildIndex < heap.size()) {
				int maxIndex = parentIndex;
				if(heap.get(leftChildIndex)> heap.get(maxIndex)) {
					maxIndex = leftChildIndex;
				}
				if(rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)) {
					maxIndex = rightChildIndex;
				}
				if(maxIndex == parentIndex) {
					break;
				}
				
				int temp1 = heap.get(maxIndex);
				heap.set(maxIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp1);
				parentIndex = maxIndex;
				leftChildIndex = 2*parentIndex+1;
				rightChildIndex = 2*parentIndex+2;
			}
			return ans;
	        
		}


}
