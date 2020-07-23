package javatut1;

public abstract class AbstractConceptShape {

	String color;
	public abstract String toString();
	public abstract double area();
	public void AbstractConceptShape(String color)
	{
	this.color=color;
	System.out.println("color is :" +color);
}
	
}
