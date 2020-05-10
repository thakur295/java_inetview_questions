package com.practice.design.patterns.factory;

public class DriverClass {
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "2GB", "1TB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16GB", "10TB", "4.4 GHz");
		System.out.println(pc);
		System.out.println(server);
	}

}
