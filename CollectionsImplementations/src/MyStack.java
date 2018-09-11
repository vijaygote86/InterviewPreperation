
public class MyStack {
	
	private int top;
	private long[] myStack;
	private int actualSize;
	
	public MyStack(int s)
	{
		this.actualSize =s;
		myStack = new long[actualSize];
		top = -1;
	}
	
	public int size()
	{
		return this.actualSize;
	}
	
	public void push(long pushValue)
	{
		myStack[++top] = pushValue;
	}
	
	public long pop()
	{
		return myStack[top--];
	}

	public boolean isStackFull()
	{
		return top == actualSize-1;
	}
	
	public boolean isStackEmpty()
	{
		return top ==-1;
	}
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack(10);
		long pushValue =10l;
		while(!stack.isStackFull())
		{
			stack.push(pushValue);
			System.out.println(pushValue + " pushed into stack");
			pushValue++;
			
		}
		System.out.println("*************");
		
		while (!stack.isStackEmpty()) {
			System.out.println("Popped from stack :" +stack.pop());
			
		}
	}
}
