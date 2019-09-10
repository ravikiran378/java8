package com.java8.learning.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TreeNode<T> {
	
	private T value = null;
	private List<TreeNode<T>> children = new ArrayList<>();
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public List<TreeNode<T>> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode<T>> children) {
		this.children = children;
	}

	public void addChildren(@SuppressWarnings("unchecked") final T... children2) {
		children.addAll(Arrays.asList(children2).stream().map(v -> getNodeWithVal(v)).collect(Collectors.toList()));
	}
	
	public TreeNode<T> getChildren(int indexBasedPosition) {
		return children.get(indexBasedPosition);
	}

	public TreeNode<T> getChildrenHavingValue(T value) {
		return children.stream().filter(c -> c.getValue().equals(value)).findAny().orElse(null);
	}
	
	private final TreeNode<T> getNodeWithVal(T val) {
		TreeNode<T> newNode = new TreeNode<T>();
		newNode.setValue(val);
		return newNode;
	}
	
	public boolean isLeaf() {
		return this.getChildren().isEmpty();
	}
	
	public static TreeNode<Integer> getSampleTree() {
		
		TreeNode<Integer> root = new TreeNode<>();
		root.setValue(1);
		root.addChildren(2,3,4);
		
		root.getChildrenHavingValue(2).addChildren(21,22,23,24);
		root.getChildrenHavingValue(3).addChildren(31,32,33,34);
		root.getChildrenHavingValue(4).addChildren(41,42,43,44);
		
		root.getChildrenHavingValue(2).getChildrenHavingValue(21).addChildren(221,222,223,224);
		
		root.getChildrenHavingValue(3).getChildrenHavingValue(32).addChildren(321,322,323,324);
		
		root.getChildrenHavingValue(4).getChildrenHavingValue(43).addChildren(421,422,423,424);
		
		return root;
	}
	
	
	public static TreeNode<Integer> getSampleTree2() {
		
		TreeNode<Integer> root = new TreeNode<>();
		root.setValue(1);
		root.addChildren(2,3);
		
		root.getChildrenHavingValue(2).addChildren(4,5);
		
		return root;
	}
}
