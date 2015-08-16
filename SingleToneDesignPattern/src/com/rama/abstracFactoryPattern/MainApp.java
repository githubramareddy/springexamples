package com.rama.abstracFactoryPattern;

public class MainApp {

	public static void main(String[] args) {
		Computer cf=ComputerFactory.createComputer(new ServerFactory("40gbRam", "500TbHdd"));
		System.out.println(cf);
		
		
	}
}
