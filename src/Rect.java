
public class Rect implements Shape {
	
	private int width, height;

	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(width + "x" + height + "ũ���� �簢�� �Դϴ�.");
	}

	@Override
	public double getArea() {
		double area = width * height;//�簢�� ���� ����
		return area;
	}
	
	
}
