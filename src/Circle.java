
public class Circle implements Shape{
	
	private int radius;

	public Circle(int radius) {		
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�������� "+radius+"�� ���Դϴ�.");
	}

	@Override
	public double getArea() {
		
		double area = radius * radius * PI;		
		
		return area;
	}
	
	

}
