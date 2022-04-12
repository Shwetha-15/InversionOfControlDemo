package com.tns.ioc;

public class Jio implements Sim
{
	public  Jio()
	{
		System.out.println("Object is getting created in the background");
	}
    public void calling() 
    {
    	System.out.println("Calling via Jio");
	}

	public void browsing() 
	{
		System.out.println("Browsing via Jio");
	}
}
