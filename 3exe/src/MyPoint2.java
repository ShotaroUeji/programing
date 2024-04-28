public class MyPoint2{
	int x, y;
	double getDistance() {
		return Math.sqrt(x*x + y*y);
	}
	void setPoint(int i,int j) {
		x = i; y= j;
	}
	
	void printCoord() {
		System.out.println("("+ x + "," + y + ")");
	}
}