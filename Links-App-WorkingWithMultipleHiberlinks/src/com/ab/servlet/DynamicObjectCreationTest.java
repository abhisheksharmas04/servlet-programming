package com.ab.servlet;

import java.lang.reflect.Constructor;

public class DynamicObjectCreationTest {

	public static void main(String[] args) throws Exception{
		// Load the class
		Class c = Class.forName(args[0]);
		
		/*// create object using newInstance() method of java.lang.Class
		Object obj = c.newInstance();
		System.out.println(obj);*/
		
		// get all constructors of loaded java class
		Constructor cons[] = c.getDeclaredConstructors();
		
		// perform object
		Object obj = cons[1].newInstance(10,20);

	}

}
