package Stack;

public class StackArrayUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays stack = new StackUsingArrays();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("This is the top of Stack:- "+stack.top());
		//System.out.println("Pop element of Stack:- "+stack.pop());
		System.out.println("Size of the stack:- "+stack.size());
		System.out.println("Is stack Empty:- "+stack.isEmpty());
		stack.display();
	}

}
