package com.rama.abstracFactoryPattern;

public class ComputerFactory {

	
	public  static  Computer  createComputer(AbstractFactory af) {
		
		return af.createComputer();
	}

}
