package com.rama.ThreadBased;

public class MainApp {

	public static void main(String[] args) {
		SingToneTypeThread stype1=SingToneTypeThread.getInstance();
		SingToneTypeThread stype2=SingToneTypeThread.getInstance();
		System.out.println(stype1);
		System.out.println(stype2);
		
	}

}
