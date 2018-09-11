package src.test.java.designpatterns.factory;

public class ShapeFactory {

	
	public Shape getShape(String shapeType)
	{
		if(shapeType == null)
			return null;
		if(shapeType ==  "Circle")
			return new Circle();
		if(shapeType == "Triangle")
			return new Triangle();
		return null;
	}
}
