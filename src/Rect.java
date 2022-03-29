
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
		System.out.println(width + "x" + height + "크기의 사각형 입니다.");
	}

	@Override
	public double getArea() {
		double area = width * height;//사각형 넓이 공식
		return area;
	}
	
	
}
