
public class TheLinkedList {
	
	private static int counter;
	private Node head;

	private class Node{
		
		Node next;
		Object data;
		
		public Node(Object objectValue)
		{
			next = null;
			data = objectValue;
		}
		
		public Node(Node nextValue, Object objectValue)
		{
			next = nextValue;
			data = objectValue;
		}
		
		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}
	}
	
	public void add(Object data)
	{
		if(head == null)
			head = new Node(data);
		else
		{
			Node temp = new Node(data);
			Node current = head;
			if(current != null)
			{
				while (current.getNext() != null) {
					current = current.getNext();
				}
				current.setNext(temp);
			}
		}
		incrementCounter();
	}
	
	public Object get(int index)
	{
		if(index < 0)
			return null;
		Node current = null;
		
		if(head != null)
		{
			current = head.getNext();
			for(int i =0; i< index; i++)
			{
				if(current.getNext() == null)
					return null;
				
				current = current.getNext();
			}
			return current.getData();
		}
		return current;
	}
	
	
	public void incrementCounter()
	{
		counter++;
	}
	
	public void decrementCounter()
	{
		counter--;
	}
	
	public int getCounter()
	{
		return this.counter;
	} 
}
