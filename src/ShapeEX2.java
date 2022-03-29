
public class ShapeEX2 {

	public static void main(String[] args) {
		Shape [] list = new Shape[3]; // Shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� �迭
		list[0] = new Circle(10); // �������� 10�� �� ��ü
		list[1] = new Oval(20, 30); // 20x30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rect(10, 40);	// 10x40 ũ���� �簢��
		
		
//		Circle cir = new Circle(10);
//		Oval ova = new Oval(20, 30);
//		Rect rec = new Rect(10, 40);

		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("������ " + list[i].getArea());

	}

}
//--- �ٽ� �׸��ϴ�. �������� 10�� ���Դϴ�.
//--- �ٽ� �׸��ϴ�. 20x30�� �����ϴ� Ÿ���Դϴ�.
//--- �ٽ� �׸��ϴ�. 10x40ũ���� �簢���Դϴ�.
//������ 314.0
//������ 1884.0000000000000002
//������ 400.0



