package com.java8.learning.tree;

public class TreeNode2<T> {
	
	T value;
	TreeNode2<T> left;
	TreeNode2<T> right;
	
	public TreeNode2(){
		
	}
	
	public TreeNode2(T value){
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public TreeNode2<T> getLeft() {
		return left;
	}
	public void setLeft(TreeNode2<T> left) {
		this.left = left;
	}
	public TreeNode2<T> getRight() {
		return right;
	}
	public void setRight(TreeNode2<T> right) {
		this.right = right;
	}
	
	public boolean isLeaf() {
		return left==null && right==null;
	}
	
	public boolean hasLeft() {
		return left!=null;
	}
	
	public boolean hasRight() {
		return right!=null;
	}
	
	
	public static TreeNode2<Integer> getSampleTree(){
		TreeNode2<Integer> root = new TreeNode2<Integer>();
		root.setValue(10);
		root.setLeft(getNode(20));
		root.setRight(getNode(30));

        TreeNode2<Integer>  lastLeftNode = getLastLeftNode(root);
        lastLeftNode.setLeft(getNode(40));
        lastLeftNode.setRight(getNode(50));

        TreeNode2<Integer>  lastRightNode = getLastRightNode(root);
        lastRightNode.setLeft(getNode(60));
        lastRightNode.setRight(getNode(70));

        lastLeftNode = getLastLeftNode(root);
        lastLeftNode.setLeft(getNode(80));
        lastLeftNode.setRight(getNode(90));


        return root;
	}

	private static TreeNode2 getLastLeftNode(TreeNode2 node){
	    if(node.isLeaf()){
	        return node;
        }else{
	        return getLastLeftNode(node.left);
        }
    }

    private static TreeNode2 getLastRightNode(TreeNode2 node){
        if(node.isLeaf()){
            return node;
        }else{
            return getLastRightNode(node.right);
        }
    }

	private static TreeNode2<Integer> getNode(int i) {
		return new TreeNode2<Integer>(i);
	}
}
