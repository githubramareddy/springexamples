package BuilderPattern;

public class Computer {

	
	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", hdd=" + hdd + ", isBloothEnabled="
				+ isBloothEnabled + ", isGraphicEnabled=" + isGraphicEnabled
				+ "]";
	}

	Computer(ComputerBuilder builder)
	{
		this.hdd=builder.hdd;
		this.ram=builder.ram;
		this.isBloothEnabled=builder.isBloothEnabled;
		this.isGraphicEnabled=builder.isGraphicEnabled;
		
	}
	private String ram;
	public String getRam() {
		return ram;
	}
	
	public String getHdd() {
		return hdd;
	}

		private String hdd;
	private boolean isBloothEnabled;
	private boolean isGraphicEnabled;
	
	public boolean isBloothEnabled()
	{
		return isBloothEnabled;
	}
	public boolean isGraphicEnabled()
	{
		
		return isGraphicEnabled;
	}
	
	
	static class ComputerBuilder{
		
		private String ram;
		public String getRam() {
			return ram;
		}
		
		public String getHdd() {
			return hdd;
		}
		ComputerBuilder(String ram,String hdd)
		{
			this.hdd=hdd;
			this.ram=ram;
			
		}

			
		

			private String hdd;
		private boolean isBloothEnabled;
		private boolean isGraphicEnabled;
		
		public ComputerBuilder setIsBloothEnabled(boolean isBloothEnabled)
		{
			this.isBloothEnabled=isBloothEnabled;
			return this;
		}
		
		public ComputerBuilder setIsGraphicEnabled(boolean isGraphicEnabled)
		{
			this.isGraphicEnabled=isGraphicEnabled;
			return this;
		}
		
		public Computer build()
		{
			
			return new Computer(this);
		}
		
	}
	
	
}
