
public class Position {
	private int x;
	private int y;
	public Position() {
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void print(){
		System.out.println("X coordinate = "+this.x + " and Y coordinate = "+this.y);
	}

}
