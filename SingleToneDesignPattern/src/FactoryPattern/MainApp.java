package FactoryPattern;

public class MainApp {

	public static void main(String[] args) {
		Computer c=FactoryClass.getType("pc", "4GbRam", "coredue", "500GBHD");
		Computer c1=FactoryClass.getType("server", "40GbRam", "I7Prosceer", "500TBHD");
		Computer c2=FactoryClass.getType("mytype", "40GbRam", "I7Prosceer", "500TBHD");
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);

	}

}
