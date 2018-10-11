
public class ReverseLinkList {
	
	
	public static void main(String[] args) {
		
		Node list = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
		Node temp = list;
		
//		while(temp != null)
//		{
//			System.out.println(temp.id);
//			temp = temp.next;
//		}
		
		reverse(list);
		
	}
	
	public static void reverse(Node list)
	{
		//Node temp = null;
		Node newList =  null;
		Node l = list;
		while(l != null)
		{
			
//			temp = l;
//			temp.next = null;
			
			Node temp = new Node(l.id, null);
			
			if(newList == null)
			{
				newList = temp;
			}
			else {
				
				temp.next = newList;
				newList = temp;
			}
			l = l.next;
			
		}
		
		while(newList != null)
		{
			System.out.println(newList.id);
			newList = newList.next;
		}
		
	}

}

class Node
{
	int id;
	Node next;
	
	Node(int id, Node next)
	{
		this.id = id;
		this.next = next;
	}
}
