package com.rama.abstracFactoryPattern;

public class ServerFactory  implements AbstractFactory{

	private String ram;
	private String hdd;
	ServerFactory(String ram, String hdd){
		this.hdd=hdd;
		this.ram=ram;
		
	}
	
	@Override
	public Computer createComputer() {
		
		return new Server(ram, hdd);
	}

}
