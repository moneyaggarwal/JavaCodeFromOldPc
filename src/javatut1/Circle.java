package javatut1;

public class Circle extends AbstractConceptShape {
	double radius;

	@Override
	public String toString() {
		
		return "color:" +super.color+ "\n "+"area of circle is :" +area();
	}

	@Override
	public double area() {
		
		return Math.PI*Math.pow(radius,2);
	}
   

	public Circle(String color,double radius)
    {
    	super.color=color;
    	this.radius=radius;
    }
}
