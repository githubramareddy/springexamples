package FactoryPattern;

public class Server  extends Computer{
	private String ram;
	private String cpuid;
	private String hdd;
	
	public Server(String ram,	 String cpuid,	String hdd)
	{
		this.ram=ram;
		this.cpuid=cpuid;
		this.hdd=hdd;
		
	}
	
	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return ram;
	}

	@Override
	public String getCpuId() {
		// TODO Auto-generated method stub
		return cpuid;
	}

	@Override
	public String getHdd() {
		// TODO Auto-generated method stub
		return hdd;
	}

}
