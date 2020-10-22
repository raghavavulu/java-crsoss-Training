package com.nttdata.Collections;

public  class Employe{
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employe other = (Employe) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (age != other.age)
		return false;
	if (empName == null) {
		if (other.empName != null)
			return false;
	} else if (!empName.equals(other.empName))
		return false;
	return true;
}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
@Override
	public String toString() {
		return "Employe [empName=" + empName + ", address=" + address + ", age=" + age + "]";
	}
public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public Employe(String empName, String address, int age) {
		super();
		this.empName = empName;
		this.address = address;
		this.age = age;
	}
private String empName;
private String address;
private int age;


}


