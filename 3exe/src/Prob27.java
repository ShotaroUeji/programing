
public class Prob27 {
	public static void main(String[] args) {
		ComplexNumber p = new ComplexNumber();
		ComplexNumber q = new ComplexNumber();
		
		p.x = 20;p.y=24;
		q.x = 4; q.y = 19;
		
		p.print();System.out.println("distance is "+ p.abs());
		
		q.print();System.out.println("distance is "+ q.abs());
		
	}

}
