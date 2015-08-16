package com.rama.LazyLoading;

public class SingleToneType {
	
private SingleToneType(){}

private static class SingleToneTypeHelper {
	private static  final SingleToneType stype=new SingleToneType();
	
}

public static SingleToneType getInstance()
{
return SingleToneTypeHelper.stype;	
}
	
}
