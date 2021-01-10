package com.java8.learning.linked.list;

public class LinkedList<T> {

    private LinkedListNode<T> linkedListHead;

    public LinkedList(final LinkedListNode<T> linkedListHead){
        this.linkedListHead = linkedListHead;
    }
    public LinkedList(){
    }

    public void printLinkedList(){
        LinkedListNode temp = linkedListHead;
        while(temp!=null) {
            System.out.print(temp.getValue()+" ");
            temp = temp.getNext();
        }
    }

    public void addLinkedListNode(T linkedListNodeValue){

        LinkedListNode<T> linkedListNode = new LinkedListNode<>();
        linkedListNode.setValue(linkedListNodeValue);

        if(this.linkedListHead == null){
            this.linkedListHead = linkedListNode;
        }else {
            LinkedListNode<T> temp = linkedListHead;
            while (temp.getNext()!= null){
                temp = temp.getNext();
            }
            temp.setNext(linkedListNode);
        }
    }

    public void addLinkedListNode(T linkedListNodeValue, int index){
        LinkedListNode<T> linkedListNode = new LinkedListNode<>();
        linkedListNode.setValue(linkedListNodeValue);

        if(index==0){
            linkedListNode.setNext(this.linkedListHead);
            this.linkedListHead = linkedListNode;
        } else {
            LinkedListNode<T> temp = this.linkedListHead; // index 0
            for (int i = 1; i < index; i++) { // from index 1.
                temp = temp.getNext();
            }
            LinkedListNode<T> tempNext = temp.getNext();
            temp.setNext(linkedListNode);
            linkedListNode.setNext(tempNext);
        }
    }

    public static void main(String[] a) {

        final LinkedList<Integer> linkedList = new LinkedList<>();
        //linkedList.addLinkedListNode(1);
        linkedList.addLinkedListNode(2);
        //linkedList.addLinkedListNode(3);
        linkedList.addLinkedListNode(4);
        linkedList.addLinkedListNode(5);
        //linkedList.addLinkedListNode(6);
        //linkedList.addLinkedListNode(3, 3);
        linkedList.addLinkedListNode(1, 0);
        linkedList.addLinkedListNode(3, 2);
        linkedList.addLinkedListNode(6, 5);
        linkedList.printLinkedList();
    }
}
