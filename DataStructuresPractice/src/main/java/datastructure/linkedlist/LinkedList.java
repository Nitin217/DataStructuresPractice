package main.java.datastructure.linkedlist;

import lombok.Data;

@Data
public class LinkedList {

	Node head;
	Node tail;
	int length;

	public LinkedList(int value) {
		this.head = new Node(value);

		this.tail = this.head;
		this.length = 1;
	}

	public void append(int value) {
		Node newNode= new Node(value);
		this.tail.setNext(newNode);
		this.tail=newNode;
		this.length++;
	}

	public void prepend(int value) {
		Node newNode= new Node(value);
		newNode.setNext(this.head);
		this.head=newNode;
	}
	
	public void printList() {
		Node currentNode = this.head;
		while (currentNode != null) {
			System.out.println(currentNode.getValue());
			currentNode = currentNode.getNext();
		}

	}
	
	
	public static void main(String args[]) {
		LinkedList list=new LinkedList(10);
		list.append(5);
		list.append(16);
		list.prepend(1);
		System.out.println(list.toString());
		list.printList();
	}
}
