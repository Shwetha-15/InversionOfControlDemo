package com.tns.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{
     public static void main(String[] args) 
     {
    	  //Hard code
	/*	  Airtel a = new Airtel();
		  a.calling();
		  a.browsing();
		  
		  Jio j= new Jio();
		  j.calling();
		  j.browsing();    */
    	 
    	 ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
    	 Sim s = c.getBean("sim",Sim.class);
    	 s.calling();
    	 s.browsing();
	 }
}
