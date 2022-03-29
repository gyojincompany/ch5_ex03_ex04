
public class ShapeEx {

	public static void main(String[] args) {
		Shape donut = new Circle(10); // 반지름이 10인 원 객체(업캐스팅)
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());

	}

}
//--- 다시 그립니다. 반지름이 10인 원입니다.
//면적은 314.0