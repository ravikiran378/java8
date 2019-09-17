package com.java8.learning.tree;

public class TraversTree2 {

	private static final String SPACE = " ";
	
	public static <T>  void traversePreOrder(TreeNode2<T> node) {
		System.out.print(SPACE+ node.value);
		if(node.hasLeft()) {
			traversePreOrder(node.left);
		}	
		if(node.hasRight()) {
			traversePreOrder(node.right);
		}
	}
	
	public static <T> void traversePostOrder(TreeNode2<T> node) {
		if(node.hasLeft()) {
			traversePostOrder(node.left);
		}		
		if(node.hasRight()) {
			traversePostOrder(node.right);
		}
		System.out.print(SPACE+ node.value);
	}
	
	public static <T> void traverseInOrder(TreeNode2<T> node) {
		if(node.hasLeft()) {
			traverseInOrder(node.left);
		}
		System.out.print(SPACE+ node.value);
		if(node.hasRight()) {
			traverseInOrder(node.right);
		}
	}
	
	public static void main(String[] args) {
		TreeNode2<Integer> root = TreeNode2.getSampleTree();
		System.out.println("traverse PreOrder...");
		traversePreOrder(root);
		System.out.println(System.lineSeparator()+ "traverse PostOrder...");
		traversePostOrder(root);
		System.out.println(System.lineSeparator()+ "traverse InOrder...");
		traverseInOrder(root);
	}

}
