package BST;

public class BstNode<T> {

	public T data;
	public BstNode<T> left;
	public BstNode<T> rigth;
	public BstNode(T data) {
		this.data = data;
		left = null;
		rigth = null;
	}

}
