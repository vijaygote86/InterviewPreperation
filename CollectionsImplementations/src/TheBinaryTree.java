
public class TheBinaryTree {
	
	public static void main(String[] args) {
		
		
		int[] array = {5,1,3,6,7,9,8};
		
		createBinaryTree(array);
		
	}
	
	
	public static void createBinaryTree(int[] a)
	{
		
		boolean flag = true;
		BNode root = null;
		
		BNode temp = null;
		
		for(int i=0; i<a.length; i++)
		{
			BNode next = new BNode();
			next.id=a[i];
			if(root == null)
			{
				root = next;
			}
			else
			{
				temp = root;
				flag =true;
				
				while(flag)
				{
					if(temp.id < next.id && temp.right != null)
					{
						temp = temp.right;
					}
					else if(temp.id > next.id && temp.left != null)
					{
						temp = temp.left;
					}
					else
						flag =false;
				}
				if(temp.id < next.id)
				{
					temp.right = next;
				}
				else
					temp.left = next;
			}
		}
		System.out.println("***");
	}

}

class BNode
{
	int id;
	BNode left;
	BNode right;
}
