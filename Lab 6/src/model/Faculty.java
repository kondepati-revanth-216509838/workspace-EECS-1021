package model;

public class Faculty {

	String name;
	String address;
	int extension;
	
	public Faculty(String name, String address, int extension){
		this.name = name;
		this.address = address;
		this.extension = extension;
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

	public int getExtension() {
		return extension;
	}

	public void setExtension(int extension) {
		this.extension = extension;
	}
	
	public String getDescription() {
		String result = "";
		result = "Faculty " + this.name + " has campus address " + this.address + " and phone extension " + this.extension;
		
		return result;
	}
}
