package lab1;

import java.util.ArrayList;
public abstract class Rectangle extends Polygon {
	public Rectangle (ArrayList<Double> sides) throws Execption
	{
		super(sides);
		if (sides.size() != 4)
			throw new Exception("A rectangle requires exactly 4 sides."); 
	}
	@Override
	public double getArea() {
	    double width = sides.get(0);
	    double height = sides.get(1);
	    return width * height;
	}
	@Override
	public double getPerimeter() {
	    return 2 * (sides.get(0) + sides.get(1));
	}
	
	
	

}
