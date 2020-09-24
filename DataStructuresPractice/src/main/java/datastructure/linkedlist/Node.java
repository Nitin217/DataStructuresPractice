package main.java.datastructure.linkedlist;

import lombok.Data;

@Data
public class Node {

	private int value;
	private Node next;
	private Node previous;
	
	public Node(int value) {
		this.value=value;
		this.next=null;
		this.previous=null;
	}
	
}
