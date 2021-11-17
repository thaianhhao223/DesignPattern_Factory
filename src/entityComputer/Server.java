package entityComputer;

import entityabstract.Computer;

public class Server extends Computer{
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
	public Server(String hDD, String rAM, String cPU) {
		super();
		HDD = hDD;
		RAM = rAM;
		CPU = cPU;
	}
	
}
