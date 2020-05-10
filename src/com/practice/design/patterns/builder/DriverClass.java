package com.practice.design.patterns.builder;

public class DriverClass {
	
	public static void main(String[] args) {
		Computer pc = new Computer.ComputerBuilder("2GB", "1TB").build();
		System.out.println(pc);
	}

}
