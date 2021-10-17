package org.emp;

public class Employee {
	public void empId() {
		System.out.println("Employee id:11");
		// TODO Auto-generated method stub

	}
	public void empId(int id) {
		System.out.println("Employee id:"+id);
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId();
		e.empId(100);
	}

}
