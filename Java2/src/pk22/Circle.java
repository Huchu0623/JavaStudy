package pk22;

public class Circle implements Cloneable{
	
	
	
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.point = new Point(x,y);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	public String toString() {
		
		return "원점은" + point + "이고," + "반지름은" + radius + "입니다";
	
	}

}
