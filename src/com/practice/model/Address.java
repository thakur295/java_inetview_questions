package com.practice.model;

public class Address implements Cloneable{
	
	private String line1;
	private String line2;
	private String state;
	
	public Address() {
		this.line1 = "";
		this.line2 = "";
		this.state = "";
	}
	public Address(Address add) {
		this.line1 = add.getLine1();
		this.line2 = add.getLine2();
		this.state = add.getState();
	}
	public Address(String line1, String line2, String state) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.state = state;
	}
	
	@Override
	public Object clone() {
		return new Address(this.getLine1(),
				this.getLine2(),
				this.getState());
	}
	
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", state=" + state + "]";
	}
	

}
