

public class Square extends Shape {

	@Override
	public float computeArea() {
		float length = cacluateLenght(points.get(0),points.get(1));
		float area = length * length;
		System.out.println("Area of Square is: "+ area);
		return area;
	}

	
	
}
