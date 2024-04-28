
public class Prob210 {
	public static void main(String[] args) {
		MyRectangle t = new MyRectangle();
		t.setPoint(20,24,4,19); 
		int area = t.computeArea();
		int circumference = t.computeCircumference();
		System.out.println("The area of the rectangle is "+ area  + 
				" ,and the circumference is "+ circumference);
	}

}
