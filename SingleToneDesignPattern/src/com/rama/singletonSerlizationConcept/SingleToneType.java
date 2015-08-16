package com.rama.singletonSerlizationConcept;

import java.io.Serializable;

public class SingleToneType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4041298131027700369L;
	private SingleToneType()
	{
		
		
	}
	private static final SingleToneType stype=new SingleToneType();
	public static SingleToneType getInstance()
	{
		
		return stype;
	}
	
	protected Object readResolve()
	{
		
		return stype;
	}
	

}
