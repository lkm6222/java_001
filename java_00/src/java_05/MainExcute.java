package java_05;

public class MainExcute {
	
	public static void main() {
		
		
		//부모 클래스 생성자
		Point point = new Point();
		
		point.setX(10);
		point.setY(20);
		
		System.out.println("Point x값 : " + point.getX());
		System.out.println("Point x값 : " + point.getY());
		
		
		//자식 클래스 생성자 - Point 클래스를 상속받았음
		Circle circle = new Circle();
	}
}
