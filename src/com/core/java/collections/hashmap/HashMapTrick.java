package com.core.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTrick {

	static class Employee {
		
		private Integer employeeId;
		private String employeeName;
		
		public Employee(Integer employeeId, String employeeName) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
		}
		
		public Integer getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (employeeId == null) {
				if (other.employeeId != null)
					return false;
			} else if (!employeeId.equals(other.employeeId))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Map<Employee, Integer> employees = new HashMap<>();
		employees.put(new Employee(1, "Ravi"), 1);
		employees.put(new Employee(2, "Vinod"), 2);
		employees.put(new Employee(3, "Kiran"), 3);
		
		System.out.println(employees);
		
		for(Employee emps : employees.keySet()) {
			if(emps.getEmployeeId()==2) {
				emps.setEmployeeId(4);
				emps.setEmployeeName("Gyan");
			}
		}
		
		System.out.println(employees);
		
		System.out.println(employees.get(new Employee(4, "Gyan")));
		
	}

}
