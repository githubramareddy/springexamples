package com.rama.singletonSerlizationConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SingleToneType obj1=SingleToneType.getInstance();
		SingleToneType obj2=null;
		
		
		FileOutputStream fos=new FileOutputStream(new File("rama.ser"));
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj1);
		
		FileInputStream fis=new FileInputStream("rama.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		obj2=(SingleToneType)ois.readObject();
		System.out.println(obj1);
		System.out.println(obj2);
		

	}

}
