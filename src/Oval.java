
public class Oval implements Shape{
	
	private int width, height;

	public Oval(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(width + "x" + height + "�� �����ϴ� Ÿ���Դϴ�.");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = width * height * PI;//Ÿ�� ���� ����
		return area;
	}
	
	
	
	
}
