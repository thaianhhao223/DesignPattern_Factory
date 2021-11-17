package entityCar;

import entityabstract.Car;

public class Honda extends Car{
	// required parameters
	private String Infor;
	private String Display;
	private String Proceducer;
	private String Feature;
	@Override
	public String getInfor() {
		// TODO Auto-generated method stub
		return this.Infor;
	}

	@Override
	public String getDisplay() {
		// TODO Auto-generated method stub
		return this.Display;
	}

	@Override
	public String getProducer() {
		// TODO Auto-generated method stub
		return this.Proceducer;
	}

	@Override
	public String getFeature() {
		// TODO Auto-generated method stub
		return this.Feature;
	}

	public Honda(String infor, String display, String proceducer, String feature) {
		super();
		Infor = infor;
		Display = display;
		Proceducer = proceducer;
		Feature = feature;
	}

}
