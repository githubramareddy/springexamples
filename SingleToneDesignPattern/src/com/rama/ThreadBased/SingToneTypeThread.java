package com.rama.ThreadBased;

public class SingToneTypeThread {
private static SingToneTypeThread stype;

private SingToneTypeThread()
{}

public static synchronized SingToneTypeThread getInstance()
{
	
if (stype==null) {
	
	synchronized(SingToneTypeThread.class){
		if (stype==null) {
			stype=new SingToneTypeThread();	
		}
	
	
	}
}
return stype;
	
}

}
