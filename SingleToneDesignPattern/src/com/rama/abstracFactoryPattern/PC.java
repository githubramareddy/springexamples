package com.rama.abstracFactoryPattern;

public class PC  extends Computer{

	private String ram;
	private String hdd;
	
	PC(String ram,	String hdd)
	{
		this.hdd=hdd;
		this.ram=ram;
		
	}
	
	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return ram;
	}

	@Override
	public String getHdd() {
		// TODO Auto-generated method stub
		return hdd;
	}

}
