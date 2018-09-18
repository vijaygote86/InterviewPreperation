
public class MyStack {
	
	private int maxSize;
	private int top;
	private long myStack[];
	
	public MyStack(int size)
	{
		this.maxSize = size;
		this.myStack = new long[maxSize];
		this.top = -1;
	}
	
	public boolean isFull()
	{
		return top == maxSize-1;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public void push(long l)
	{
		myStack[++top] = l;
	}
	
	public long pop()
	{
		return myStack[top--];
	}
	
	public static void main(String[] args) {
		
		MyStack myStack = new MyStack(10);
		long pushedVal = 1L;
		while(!myStack.isFull())
		{
			myStack.push(pushedVal);
			pushedVal++;
			
		}
		while(!myStack.isEmpty())
		{
			System.out.println(myStack.pop());
		}	
	}

}
