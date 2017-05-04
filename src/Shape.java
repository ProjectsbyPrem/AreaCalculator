import java.util.Vector;

public abstract class Shape {

 
	
	protected float area;
	protected Vector<Position> points = new Vector<Position>();

	public abstract float computeArea();
	
	public float cacluateLenght(Position pointA,Position pointB){
		float distance = (float)Math.sqrt((pointA.getX()-pointB.getX())*(pointA.getX()-pointB.getX()) + (pointA.getY()-pointB.getY())*(pointA.getY()-pointB.getY()));
		return distance;
	}
	
	public void print(){
		
		System.out.println("Coordinates of points in shape are: ");
		for(Position position:  points){
			position.print();
		}
		computeArea();
		
	}
	
	public Vector<Position> getPoints() {
		return points;
	}

	public void setPoints(Vector<Position> points) {
		this.points = points;
	}
	
}