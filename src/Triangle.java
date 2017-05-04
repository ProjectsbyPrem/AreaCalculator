

public class Triangle extends Shape {

	@Override
	public float computeArea() {

		float base = cacluateLenght(points.get(0),points.get(1));
		float height = cacluateLenght(points.get(1),points.get(2));
		float area = ( base * height)/2;
		System.out.println("Area of Triange is: "+ area);
		return area;
	}

}
