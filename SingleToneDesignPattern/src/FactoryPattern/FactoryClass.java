package FactoryPattern;

public class FactoryClass {
	
	public static Computer getType(String type,String ram,String cpuid,	String hdd)
	{
		
		if ("PC".equalsIgnoreCase(type)) {
		return new PC(ram, cpuid,hdd);	
		}
		else if ("server".equalsIgnoreCase(type)) {
			return new PC(ram, cpuid,hdd);
		}
		
		return null;
	}

}
