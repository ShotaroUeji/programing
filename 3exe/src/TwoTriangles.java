
public class TwoTriangles {
	public static void main(String[] args) {
		Turtle t1 = new Turtle();
		Turtle t2 = new Turtle();
		
		t1.move(10,200); t2.move(210, 200);
		t1.penDown(); t2.penDown();
		t1.go(100);t2.go(100);
		t1.rotate(120); t2.rotate(-120);
		t1.go(100);t2.go(100);
		t1.rotate(120); t2.rotate(-120);
		t1.go(100); t2.go(100);
		}

}
