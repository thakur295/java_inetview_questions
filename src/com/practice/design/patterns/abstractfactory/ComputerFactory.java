package com.practice.design.patterns.abstractfactory;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}

}
