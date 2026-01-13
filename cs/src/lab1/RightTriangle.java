package lab1;

import java.util.ArrayList;
public abstract class RightTriangle extends Polygon {
	
	public RightTriangle (ArrayList<Double> sides) throws Execption
	{
		super(sides);
		if (sides.size() != 3)
			throw new Exception("A triangle need 3 sides."); 
	}
	@Override
	public double computeArea() {
		double area = sides.get(0)*sides.get(1)*0.5;
		return area; 
	}
	
	
	

}
