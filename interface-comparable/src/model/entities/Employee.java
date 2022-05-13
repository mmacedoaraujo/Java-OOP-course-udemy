package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;

	List<Employee> employee = new ArrayList<>();

	public Employee() {

	}

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee.add(employee);
	}

	@Override
	public int compareTo(Employee otherEmployee) {
		return -salary.compareTo(otherEmployee.getSalary());
	}

}
