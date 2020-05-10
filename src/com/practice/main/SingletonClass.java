package com.practice.main;

public class SingletonClass {
	
	public static SingletonClass instance = null;

	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	public static SingletonClass getInstance() {
		
		if(instance == null) {
			synchronized (SingletonClass.class) {
				if(instance == null) {
					instance = new SingletonClass();
				}
			} 
		}
			
		return instance;
	}

}
