package com.vuclips;

public class LinkedListLoop {
	
	
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public void push(int new_data)
	{
		Node newNode = new Node(new_data);
		newNode.next = head;
		head = newNode;
	}
	
	Node detectLoop()
	{
		Node slow_ptr = head;
		Node fast_ptr = head;
		while(slow_ptr != null && fast_ptr != null && fast_ptr.next != null)
		{
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
			
			if(slow_ptr == fast_ptr)
			{
				return slow_ptr;
			}
		}
		return null;
	}

}
