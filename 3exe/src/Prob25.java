
public class Prob25 {
	public static void main(String[] args){
	MyPoint p= new MyPoint();
	MyPoint q = new MyPoint();
	p.x = 20; p.y = 24;
	q.x = 4; q.y = 19;
	
	double d1 ,d2;
	d1 = p.getDistance();
	d2 = q.getDistance();
	
	System.out.println("Distance between P and o is " + d1+ "\nDistace　between Q and o is " + d2 );
	}
}
