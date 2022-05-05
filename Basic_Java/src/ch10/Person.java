package ch10;

public class Person {
	private String name, address;
	
	public Person(String n,String add) {
		// TODO Auto-generated constructor stub
		this.name=n;
		this.address=add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
