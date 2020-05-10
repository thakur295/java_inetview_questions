package com.practice.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.practice.model.Address;

public class DriverClass {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//singleton
		SingletonClass ins = SingletonClass.getInstance();
		SingletonClass ins1 = SingletonClass.getInstance();
		System.out.println(ins);
		System.out.println(ins1);
		Constructor<?>[] declaredConstructors = SingletonClass.class.getDeclaredConstructors();
		for(Constructor c: declaredConstructors) {
			c.setAccessible(true);
			ins1 = (SingletonClass) c.newInstance();
		}
		System.out.println(ins1);
		
		Address address = new Address("Lane1", "Mark St.", "LA");
		ImmutableClass immutableClass = new ImmutableClass("John", 25, address);
		System.out.println(immutableClass.toString());
		address = changeAddress(immutableClass.getAddress());
		System.out.println(immutableClass.toString());
	}
	
	private static Address changeAddress(Address add) {
		add.setLine1("Line2");
		return add;
	}

}
