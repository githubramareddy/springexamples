package com.rama.abstracFactoryPattern;

public abstract class  Computer {
	@Override
	public String toString()
	{
		
		return this.getRam()+" "+this.getHdd();
	}
	public abstract String getRam();
	public abstract String getHdd();
}
