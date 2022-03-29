
public class Km2Mile extends Converter{

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		double km_mile = src / ratio;
		return km_mile;
	}

	@Override
	protected String srcString() {
		// TODO Auto-generated method stub
		String km = "km";
		return km;
	}

	@Override
	protected String destString() {
		String mile = "mile";
		return mile;
	}
	
	
	
}
