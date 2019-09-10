package com.java8.learning.tree;

import java.util.ArrayList;
import java.util.List;

public class TraverseTree {
	
	public static <T> void traversePreOrder(TreeNode<T> tree) {
		System.out.print(" "+tree.getValue());
		for(TreeNode<T> child: tree.getChildren()) {
			traversePreOrder(child);
		}
	}

	public static <T> void traversePostOrder(TreeNode<T> tree) {
		for(TreeNode<T> child: tree.getChildren()) {
			traversePostOrder(child);
		}
		System.out.print(" "+tree.getValue());
	}
	
	public static <T> List<TreeNode<T>> getReverseList(List<TreeNode<T>> children) {
		List<TreeNode<T>> reversedChildren = new ArrayList<>();
			for(TreeNode<T> child: children) {
				reversedChildren.add(0, child);
			}
		return reversedChildren;
	}

	public static void main(String[] args) {
		System.out.println("Pre Order");
		traversePreOrder(TreeNode.getSampleTree2());
		System.out.println();
		System.out.println("Post Order");
		traversePostOrder(TreeNode.getSampleTree2());
	}

}
