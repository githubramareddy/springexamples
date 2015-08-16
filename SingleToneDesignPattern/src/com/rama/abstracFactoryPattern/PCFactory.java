package com.rama.abstracFactoryPattern;

public class PCFactory  implements AbstractFactory{

	private String ram;
	private String hdd;
	PCFactory(String ram, String hdd){
		this.hdd=hdd;
		this.ram=ram;
		
	}
	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC(ram, hdd);
	}

}
