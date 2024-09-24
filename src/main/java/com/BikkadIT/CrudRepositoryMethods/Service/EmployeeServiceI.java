package com.BikkadIT.CrudRepositoryMethods.Service;

import java.util.List;

import com.BikkadIT.CrudRepositoryMethods.Model.Employee;

public interface EmployeeServiceI {
	
	public boolean saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();
	
	public boolean updateEmployee(Employee emp);
	
	public boolean deleteAllEmp();
	
	public List<Employee> saveAllEmp(List<Employee> emps);
	
	public List<Employee> updateAllEmp(List<Employee> emps);
	
	public Employee getEmpById(int empId);
	
	public Employee getEmpByPP(int empId);
	

}
