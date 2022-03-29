
public class Won2Dollar extends Converter{	
	
	public Won2Dollar(double ratio) {
		this.ratio = ratio;//외부에서 객체 생성될때 인수로 들어온 값으로 ratio를 초기화		
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
		String won = "원";
		return won;
	}

	@Override
	protected String destString() {
		// TODO Auto-generated method stub
		String dollar = "달러";
		return dollar;
	}
	
}
