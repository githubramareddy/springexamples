package FactoryPattern;

public abstract class Computer {
	
	abstract public String getRam();
	abstract  public String getCpuId();
	abstract  public String getHdd();
	@Override
	public String toString()
	{
		return this.getRam()+" "+this.getCpuId()+" "+this.getHdd();
		
		
	}

}
