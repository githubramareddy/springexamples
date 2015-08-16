package com.rama.abstracFactoryPattern;

public class Server extends Computer {
	private String ram;
	private String hdd;
	
	Server(String ram,	String hdd)
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
