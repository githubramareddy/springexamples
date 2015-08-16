package com.rama.singletone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainAppDestorySingleTone {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SingleToneType stype1=SingleToneType.getInstance();
		SingleToneType stype2=null;
		Constructor stypes [] =SingleToneType.class.getDeclaredConstructors();
		for (Constructor constructor : stypes) {
			
			constructor.setAccessible(true);
			stype2=(SingleToneType)constructor.newInstance();
			break;
		}
		
		System.out.println(stype1);
		System.out.println(stype2);
	}

}
