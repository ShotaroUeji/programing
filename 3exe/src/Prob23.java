
public class Prob23 {
	public static void main(String[] args) {
		Turtle t1,t2;
		t1 = new Turtle();
		t2 = new Turtle();
		t1.move(10,200); t2.move(210, 200);
		t1.penDown(); t2.penDown();
		t1.go(41);t2.go(41);
		t1.rotate(90); t2.rotate(-60);
		t1.go(41);t2.go(41);
		t1.rotate(90); t2.rotate(-60);
		t1.go(41); t2.go(41);
		t1.rotate(90); t2.rotate(-60);
		t1.go(41);
		t2.go(41);
		t2.rotate(-60);
		t2.go(41);
		t2.rotate(-60);
		t2.go(41);
		t2.rotate(-60);
	}

}
