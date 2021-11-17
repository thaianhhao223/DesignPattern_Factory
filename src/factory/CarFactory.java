package factory;

import entityCar.Honda;
import entityCar.Nexus;
import entityCar.Toyota;
import entityComputer.PC;
import entityComputer.Server;
import entityabstract.Car;
import entityabstract.Computer;

public class CarFactory {
	public static Car getCar(String type, String infor, String display, String proceducer, String feature) {
		if ("Honda".equalsIgnoreCase(type))
			return new Honda(infor,display,proceducer,feature);
		if ("Nexus".equalsIgnoreCase(type))
			return new Nexus(infor,display,proceducer,feature);
		if ("Toyota".equalsIgnoreCase(type))
			return new Toyota(infor,display,proceducer,feature);
		return null;
	}
}
