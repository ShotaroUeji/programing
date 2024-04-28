
public class Prob28 {
	public static void main(String[] args) {
		Turtle t = new Turtle();
		int i,j;
		t.move(110,300);
		t.penDown();
		for(j=0;j<6;j++) {
			t.go(90);
			
			t.rotate(60);
			for(i = 0;i<6;i++) {
				t.go(11);
				t.rotate(60);
			}
			
		}
	}

}
