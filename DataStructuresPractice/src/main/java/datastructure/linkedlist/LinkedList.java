package main.java.datastructure.linkedlist;

import java.util.Arrays;

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
		this.length++;
	}
	
	public void printList() {
		int[] list=new int[this.length];
		Node currentNode = this.head;
		int i=0;
		while (currentNode != null) {
			list[i]=currentNode.getValue();
			currentNode = currentNode.getNext();
			i++;
		}
		System.out.println(Arrays.toString(list));
	}
	
	public void insert(int node, int value) {
		// if node is greater than length , throw error
		if (node >= this.length) {
			this.append(value);
		} else {
			// if node is less than or equal to length then insert
			int i = 0;
			Node currentNode = this.head;
			while (i <= node) {
				if (i < node) {
					currentNode = currentNode.getNext();

				} else if (i == node) {
					Node newNode = new Node(currentNode.getValue());
					newNode.setNext(currentNode.getNext());
					currentNode.setValue(value);
					currentNode.setNext(newNode);
					this.length++;//forgot to increase length
				}
				i++;
			}
		}

	}
	
	public void remove(int node) {
		if(node>=this.length || node<0) {
			System.out.println("Invalid Index");
		}else {
			int i=0;
			Node leaderNode = this.head;
			Node nodeTodelete;
		
			while(i<=node) {
				if (i < node-1) {
					leaderNode = leaderNode.getNext();

				}else if (i == node) {
					nodeTodelete = leaderNode.getNext();
					leaderNode.setNext(nodeTodelete.getNext());
					this.length--;
				}
				i++;
			}
		}
		
	}
	
	
	public static void main(String args[]) {
		LinkedList list=new LinkedList(10);
		list.append(5);
		list.append(16);
		list.prepend(1);
		list.insert(66, 2);;
		list.insert(1, 100);;
		list.printList();
		list.remove(6);
		list.printList();
	}
}
