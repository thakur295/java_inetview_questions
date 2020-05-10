package com.practice.main;

import com.practice.model.Address;

public final class ImmutableClass {
	
	private final String name;
	private final Integer age;
	private final Address address;
	
	public ImmutableClass() {
		this.name = "";
		this.age = 0;
		this.address = new Address();
	}

	protected ImmutableClass(String name, Integer age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = new Address(address);

	}
	

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Address getAddress() {
		return new Address(address);
	}

	@Override
	public String toString() {
		return "ImmutableClass [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
