package data_structures;

import data_structures.Node;
public class LinkedList {
	
	public Node head;
	/**
	 * Adds an element to the end of linked list
	 * 
	 * @param head
	 * @param value
	 * @return
	 */
	public static Node insert(Node head, int value) {
		Node newNode = new Node();
		newNode.setValue(value);
		
		if (head.next == null) {
			head.next = newNode;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = newNode;
		}
		
		printLinkedList(head);
		
		return head;
	}
	
	/**
	 * Removes and element from the end of linked list
	 * 
	 * @param head
	 * @param number
	 * @return
	 */
	public static Node deleteNode(Node head, int number) {
		if (head.value == number) {
			head = head.next;
		} else {
			Node n = head;
			while (n.next != null) {
				if (n.next.value == number) {
					n.next = n.next.next;
				}
				n = n.next;
			}
		}
		
		printLinkedList(head);
		return head;
	}
	
	/**
	 * Prints linked list
	 * 
	 * @param head
	 */
	public static void printLinkedList(Node head) {
		System.out.println("\nUpdated Linked List -> ");
		while (head != null) {
			if (head.next != null) {
				System.out.print(head.value + " -> ");
			} else {
				System.out.print(head.value + " ");
			}
			
			head = head.next;
		}
	}

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.head = new Node();
		ls.head.value = 8;
		ls.head = LinkedList.insert(ls.head, 72);
		ls.head = LinkedList.insert(ls.head, 56);
		ls.head = LinkedList.insert(ls.head, 98);
		ls.head = LinkedList.insert(ls.head, 23);
		ls.head = LinkedList.insert(ls.head, 17);
		ls.head = LinkedList.deleteNode(ls.head, 98);
	}
}
