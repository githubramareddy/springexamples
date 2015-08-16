package com.rama.EgharInsilizationStaic;

public class SingToneType {
	
	private  static final SingToneType stype;
	static
	{
		
		stype=new SingToneType();
	}
	
	public static SingToneType getInstance()
	{
		
		return stype;
	}
	private SingToneType()
	{}

}
