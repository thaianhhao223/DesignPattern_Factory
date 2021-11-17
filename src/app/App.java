package app;

import entityabstract.Car;
import entityabstract.Computer;
import factory.CarFactory;
import factory.ComputerFactory;

public class App {
	public static void main(String[] args) {
		System.out.println("Computer Factory =====================================");
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
		System.out.println("Factory PC Config::" + pc.toString());
		System.out.println("Factory Server Config::" + server.toString());
		System.out.println("Car Factory =====================================");
		Car toyota = CarFactory.getCar("Toyota", "Newest modern car in the world", "enginear modern v4", "Toyota", "Move faster than every car");
		System.out.println("Factory Toyota config::"+toyota.toString());
	}
}
