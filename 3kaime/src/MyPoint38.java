
public class MyPoint38 {
	private int x;
	private int y;

	void setPoint(int xpos, int ypos) {
		x = xpos;
		y = ypos;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	double getDistance() {
		return Math.sqrt(x*x + y*y);
	}
	
	double getDistanceFrom(MyPoint38 q){
		return Math.sqrt((x-q.x)*(x-q.x)+(y-q.y)*(y-q.y));
	}

}
