package main.java.datastructure.linkedlist;

import lombok.Data;

@Data
public class DoublyNode {
	private int value;
	private DoublyNode next;
	private DoublyNode previous;
	
	public DoublyNode(int value) {
		this.value=value;
		this.next=null;
		this.previous=null;
	}

}
