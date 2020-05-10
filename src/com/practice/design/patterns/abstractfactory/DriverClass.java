package com.practice.design.patterns.abstractfactory;

public class DriverClass {
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PcFactory("2GB", "1TB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16GB", "10TB", "4.4 GHz"));
		System.out.println(pc);
		System.out.println(server);
	}

}
