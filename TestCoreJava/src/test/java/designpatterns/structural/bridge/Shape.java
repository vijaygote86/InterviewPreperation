package src.test.java.designpatterns.structural.bridge;

public abstract class Shape {
	
	protected Color color;
	
	public Shape(Color c)
	{
		this.color = c;
	}
	
	abstract public void applyColor();
}
