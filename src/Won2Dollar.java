
public class Won2Dollar extends Converter{	
	
	public Won2Dollar(double ratio) {
		this.ratio = ratio;//�ܺο��� ��ü �����ɶ� �μ��� ���� ������ ratio�� �ʱ�ȭ		
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		double won_dollar = src / ratio;
		return won_dollar;
	}

	@Override
	protected String srcString() {
		// TODO Auto-generated method stub
		String won = "��";
		return won;
	}

	@Override
	protected String destString() {
		// TODO Auto-generated method stub
		String dollar = "�޷�";
		return dollar;
	}
	
}
