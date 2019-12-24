package BinaryTree;

import java.util.Scanner;

public class BTUse {
	public static BTNode<Integer> takeInputBetter(boolean isRoot,int parentData, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root node:");	
		}else {
			if(isLeft) {
				System.out.println("Enter the left node of:"+ parentData);
			}else {
				System.out.println("Enter the right node of:"+ parentData);
			}
		}
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BTNode<Integer> root = new BTNode<Integer>(rootData);
		BTNode<Integer> leftroot = takeInputBetter(false,rootData,true);
		BTNode<Integer> rightroot = takeInputBetter(false,rootData,false);
		root.left = leftroot;
		root.right = rightroot;
		return root;
	}
	public static BTNode<Integer> takeInput(){
		System.out.println("Enter the root node:");
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BTNode<Integer> root = new BTNode<Integer>(rootData);
		BTNode<Integer> leftroot = takeInput();
		BTNode<Integer> rightroot = takeInput();
		root.left = leftroot;
		root.right = rightroot;
		return root;
	}
	public static void PrintDetailedTree(BTNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+":");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		PrintDetailedTree(root.left);
		PrintDetailedTree(root.right);
	}
	public static void PrintTree(BTNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		PrintTree(root.left);
		PrintTree(root.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BTNode<Integer> root = new BTNode<Integer>(1);
//		BTNode<Integer> rootleft = new BTNode<Integer>(2);
//		BTNode<Integer> rootright = new BTNode<Integer>(3);
//		root.left = rootleft;
//		root.right = rootright;
//		BTNode<Integer> rootleftright = new BTNode<Integer>(4);
//		BTNode<Integer> rootrightleft = new BTNode<Integer>(5);
//		rootleft.right = rootleftright;
//		rootright.left = rootrightleft;
//		
		//PrintTree(root);
		PrintDetailedTree(takeInputBetter(true,0,true));
	}

}
