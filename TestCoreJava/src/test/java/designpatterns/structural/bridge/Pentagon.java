package src.test.java.designpatterns.structural.bridge;

public class Pentagon extends Shape{
	
	public Pentagon(Color c)
	{
		super(c);
	}

	@Override
	public void applyColor() {

		System.out.print("Pentagon filled with colour ");
		color.applyColor();
	}

	
}
