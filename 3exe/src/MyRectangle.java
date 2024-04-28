
public class MyRectangle {
	MyPoint2 point1, point2;
	void setPoint(int a,int b,int c,int d){
		point1 = new MyPoint2();
		point2 = new MyPoint2();
		
		point1.x= a; point1.y=b;
		point2.x = c; point2.y=d;
		
	}
	int computeLength(){
		int length = point1.x - point2.x;
		return length;
		
	}
	int computeWidth(){
		int width = point1.y - point2.y;
		return width;
		
	}
	int computeArea(){
		int Area = computeLength()*computeWidth();
		return Area;
		
	}
	int computeCircumference(){
		int Circumference = 2*(computeLength()+computeWidth());
		return Circumference;
	}

}
