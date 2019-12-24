package Stack;

public class StackUsingArrays {

	private int arr[];
	private int topIndex;
	
	public StackUsingArrays() {
		arr = new int[3];
		topIndex = -1;
	}
	public void push(int num)  {
		if(this.topIndex == arr.length-1) {
			doublecapacity();
		}
		arr[++topIndex]=num;
		
	}
	
	private void doublecapacity() {
		int temp[] = arr;
		arr = new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			arr[i] = temp[i];
		}
		
	}
	public int top() {
		
		if(this.topIndex == -1) {
			return -1;
		}
		
		return arr[this.topIndex];
		
	}
	
	public int pop() throws Exception {
		
		if(this.topIndex==-1) {
			throw new Exception("Stack is Empty!!");
		}
		
		int val = arr[topIndex];
		this.topIndex-=1;
		
		return val;
	}
	
	public int size() {
		
		return topIndex+1;
		
	}
	public boolean isEmpty() {
		
		if(topIndex==-1) {
			return true;
		}
		return false;
		
	}
	public void display() {
		for(int i=0;i<=topIndex;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
