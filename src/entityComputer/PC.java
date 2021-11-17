package entityComputer;

import entityabstract.Computer;

public class PC extends Computer {
	// required parameters
	private String HDD;
	private String RAM;
	private String CPU;

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.HDD;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.RAM;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.CPU;
	}

	public PC(String hdd, String ram, String cpu) {
		super();
		HDD = hdd;
		RAM = ram;
		CPU = cpu;
	}

}
