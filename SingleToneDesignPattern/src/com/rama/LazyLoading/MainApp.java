package com.rama.LazyLoading;

public class MainApp {

	public static void main(String[] args) {
		SingleToneType stype1=SingleToneType.getInstance();
		SingleToneType stype2=SingleToneType.getInstance();
System.out.println(stype1);
System.out.println(stype2);
	}

}
