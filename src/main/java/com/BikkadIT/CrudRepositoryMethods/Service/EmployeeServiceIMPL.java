package com.BikkadIT.CrudRepositoryMethods.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.CrudRepositoryMethods.Model.Employee;
import com.BikkadIT.CrudRepositoryMethods.Repository.EmployeeRepository;

@Service
public class EmployeeServiceIMPL implements EmployeeServiceI {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public boolean saveEmployee(Employee emp) {
	Employee save=	employeeRepository.save(emp);
	if(save !=null) {
		return true;
		}
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
    List<Employee>all=(List<Employee>)	employeeRepository.findAll();
	return all;
}

	@Override
	public boolean updateEmployee(Employee emp) {
		Employee save=	employeeRepository.save(emp);
		if(save !=null) {
			return true;
			}
		return false;
	}

	@Override
	public boolean deleteAllEmp() {
		
	List<Employee> all=	(List<Employee>) employeeRepository.findAll();
	
	if(all.isEmpty()) {
		return false;
	}else {
		employeeRepository.deleteAll();
		return true;
	}
	
	

}

	@Override
	public List<Employee> saveAllEmp(List<Employee> emps) {
		 List<Employee> saveAll= (List<Employee>) employeeRepository.saveAll(emps);
		return saveAll;
	}

	@Override
	public List<Employee> updateAllEmp(List<Employee> emps) {
		List<Employee> saveAll= (List<Employee>) employeeRepository.saveAll(emps);
		return saveAll;
		
	}

	@Override
	public Employee getEmpById(int empId) {
		Employee byId=employeeRepository.findById(empId).get();
		return byId;
	}

	@Override
	public Employee getEmpByPP(int empId) {
		Employee byId=employeeRepository.findById(empId).get();
		return byId;
	}}
