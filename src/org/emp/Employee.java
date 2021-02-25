package org.emp;

public class Employee {
	
	private void empid() {
		System.out.println("Safiya is 10967442");
	
	}
	
	private void empName() {
	
		System.out.println("Safiya");

	}	
	
	private void empDob() {
		System.out.println("10/1992/26");

	}
	
	private void empMail() {
		System.out.println("mohamedsheik 16@ gamil.com");

	}
	
 public static void main(String[] args) {
	 
	 Employee abc=new Employee();
	 
	 abc.empName();
	 abc.empMail();
	 abc.empDob();
	 abc.empid();
	
}

}
