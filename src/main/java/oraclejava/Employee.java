package oraclejava;

public class Employee {

	private String name;
	
	private EmployeeAddress address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		
		return "Employee[name="+name+",address="+address+"]";
	}

	
	
}
