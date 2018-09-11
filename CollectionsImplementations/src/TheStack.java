
public class TheStack {

	private int maxSize;
	private long[] myStack;
	private int top;
	
	public TheStack(int size)
	{
		this.maxSize = size;
		this.myStack = new long[maxSize];
		this.top = -1;
	}
	
	public boolean isFull()
	{
		return (top == maxSize -1);
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
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
		
		TheStack theStack =  new TheStack(10);
		long pusheValue = 11l;
		
		while(!theStack.isFull())
		{
			theStack.push(pusheValue);
			System.out.println("Pushed : " +pusheValue);
			pusheValue ++;
		}
		System.out.println("***************");
		while(!theStack.isEmpty())
		{
			long popedValue = theStack.pop();
			System.out.println("Popped : "+popedValue);
		}
	}
}
