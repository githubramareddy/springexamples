package com.rama.singletone;

public class SingleToneType {
	private SingleToneType()
	{
		
		
	}
	private static final SingleToneType stype=new SingleToneType();
	public static SingleToneType getInstance()
	{
		
		return stype;
	}
	

}
