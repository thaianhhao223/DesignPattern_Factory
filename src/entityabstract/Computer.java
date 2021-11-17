package entityabstract;

public abstract class Computer {
		public abstract String getHDD();
		public abstract String getRAM();
		public abstract String getCPU();
		@Override
		public String toString() {
			return "Computer [HDD=" + this.getHDD() + ", RAM=" + this.getRAM() + ", CPU=" + this.getCPU() + "]";
		}
		
}
