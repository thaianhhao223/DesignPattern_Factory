package factory;

import entityComputer.Laptop;
import entityComputer.PC;
import entityComputer.Server;
import entityabstract.Computer;

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		if ("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);
		if ("Laptop".equalsIgnoreCase(type))
			return new Laptop(ram, hdd, cpu);
		return null;
	}
}
