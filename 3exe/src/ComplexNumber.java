
public class ComplexNumber {
	int x,y;
	void print() {
		System.out.println(x + "+" + y + "i");
	}
	double abs() {
		return Math.sqrt(x*x + y*y);
	}

}
