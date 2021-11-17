package entityabstract;

public abstract class Car {
	public abstract String getInfor();
	public abstract String getDisplay();
	public abstract String getProducer();
	public abstract String getFeature();
	@Override
	public String toString() {
		return "Car [Infor=" + getInfor() + ",Display=" + getDisplay() + ",Producer=" + getProducer()
				+ ", Feature=" + getFeature() + "]";
	}
	
}
