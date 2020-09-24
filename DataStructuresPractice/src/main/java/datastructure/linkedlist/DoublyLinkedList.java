package main.java.datastructure.linkedlist;

import java.util.Arrays;

import lombok.Data;

@Data
public class DoublyLinkedList {
	DoublyNode head;
	DoublyNode tail;
	int length;

	public DoublyLinkedList(int value) {
		this.head = new DoublyNode(value);
		this.tail = this.head;
		this.length = 1;
	}

	public void append(int value) {
		DoublyNode newDoublyNode= new DoublyNode(value);
		newDoublyNode.setPrevious(this.tail);
		this.tail.setNext(newDoublyNode);
		this.tail=newDoublyNode;
		this.length++;
	}

	public void prepend(int value) {
		DoublyNode newDoublyNode= new DoublyNode(value);
		newDoublyNode.setNext(this.head);
		this.head.setPrevious(newDoublyNode);
		this.head=newDoublyNode;
		this.length++;
	}
	
	public void printList() {
		int[] list=new int[this.length];
		DoublyNode currentDoublyNode = this.head;
		int i=0;
		while (currentDoublyNode != null) {
			list[i]=currentDoublyNode.getValue();
			currentDoublyNode = currentDoublyNode.getNext();
			i++;
		}
		System.out.println(Arrays.toString(list));
	}
	
	
	public void printElements() {
		System.out.println(this.head);
	}
	
	public void insert(int DoublyNode, int value) {
		// if DoublyNode is greater than length , throw error
		if (DoublyNode >= this.length) {
			this.append(value);
		} else {
			// if DoublyNode is less than or equal to length then insert
			int i = 0;
			DoublyNode currentDoublyNode = this.head;
			while (i <= DoublyNode) {
				if (i < DoublyNode) {
					currentDoublyNode = currentDoublyNode.getNext();

				} else if (i == DoublyNode) {
					DoublyNode newDoublyNode = new DoublyNode(currentDoublyNode.getValue());
					newDoublyNode.setNext(currentDoublyNode.getNext());
					currentDoublyNode.setValue(value);
					currentDoublyNode.setNext(newDoublyNode);
					this.length++;//forgot to increase length
				}
				i++;
			}
		}

	}
	
	public void remove(int DoublyNode) {
		if(DoublyNode>=this.length || DoublyNode<0) {
			System.out.println("Invalid Index");
		}else {
			int i=0;
			DoublyNode leaderDoublyNode = this.head;
			DoublyNode DoublyNodeTodelete;
		
			while(i<=DoublyNode) {
				if (i < DoublyNode-1) {
					leaderDoublyNode = leaderDoublyNode.getNext();

				}else if (i == DoublyNode) {
					DoublyNodeTodelete = leaderDoublyNode.getNext();
					DoublyNodeTodelete.getNext().setPrevious(DoublyNodeTodelete.getPrevious());
					leaderDoublyNode.setNext(DoublyNodeTodelete.getNext());
					this.length--;
				}
				i++;
			}
		}
		
	}
	public DoublyLinkedList reverse() {
		DoublyNode currentDoublyNode=this.tail;
		DoublyLinkedList reverseList=new DoublyLinkedList(currentDoublyNode.getValue()); 
		this.tail=this.head;
		this.head=currentDoublyNode;
		while (currentDoublyNode != null && currentDoublyNode.getPrevious()!=null) {
			reverseList.append(currentDoublyNode.getPrevious().getValue());
			currentDoublyNode = currentDoublyNode.getPrevious();		
		}
		
		return reverseList;
	}
	
	
	public static void main(String args[]) {
		try {
			DoublyLinkedList list=new DoublyLinkedList(10);
			list.append(5);
			list.append(8);
			list.append(2);
			list.prepend(0);
			list.printList();
			list.remove(1);
			list.printList();
			DoublyLinkedList reverseList=list.reverse();
			reverseList.printList();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
