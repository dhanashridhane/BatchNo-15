package com.BikkadIT.CrudRepositoryMethods.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.CrudRepositoryMethods.Model.Employee;
import com.BikkadIT.CrudRepositoryMethods.Service.EmployeeServiceI;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceI employeeServiceI;
	
	@PostMapping(value="/saveEmp",consumes = {"application/json"})
	public ResponseEntity<String> SaveEmployee(@RequestBody Employee emp){
	boolean saveEmployee=employeeServiceI.saveEmployee(emp);
	
	if(saveEmployee) {
		String msg="Employee Saved";
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		
	}else {
		String msg1="Employee not Saved";
		return new ResponseEntity<String>(msg1, HttpStatus.BAD_REQUEST);
	}
	}
	
	@GetMapping(value="/getAllEmp", produces ="application/json")
	public ResponseEntity<List<Employee>> getAllEmp(){
	List<Employee> allEmployee= employeeServiceI.getAllEmployee();
		return new ResponseEntity<List<Employee>>(allEmployee,HttpStatus.OK); 
	
	}
	
	@PutMapping(value="/updateEmp",consumes = {"application/json"})
	public ResponseEntity<String> updateEmployee(@RequestBody Employee emp){
	boolean saveEmployee=employeeServiceI.updateEmployee(emp);
	
	if(saveEmployee) {
		String msg="Employee Updated";
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		
	}else {
		String msg1="Employee not Updated";
		return new ResponseEntity<String>(msg1, HttpStatus.BAD_REQUEST);
	}
	}
	@DeleteMapping("/deleteAllEmp")
	public ResponseEntity<String> deleteAllEmp(){
		 boolean deleteAllEmp= employeeServiceI.deleteAllEmp();
		 
		 if(deleteAllEmp) {
				String msg="Employee Deleted";
				return new ResponseEntity<String>(msg, HttpStatus.OK);
				
			}else {
				String msg1="Employee not Deleted";
				return new ResponseEntity<String>(msg1, HttpStatus.BAD_REQUEST);
			}
		 
		
		
	}
	@PostMapping(value="/saveAllEmp",consumes="application/json",produces="application/json")
	public ResponseEntity<List<Employee>> saveAllEmp(@RequestBody List<Employee>emps){
		List<Employee> saveAllEmp= employeeServiceI.saveAllEmp(emps);
		return new ResponseEntity<List<Employee>>(saveAllEmp,HttpStatus.CREATED);
		
	}
	@PutMapping(value="/updateAllEmp",consumes="application/json",produces="application/json")
	public ResponseEntity<List<Employee>> updateAllEmp( List<Employee>emps){
		List<Employee> saveAllEmp= employeeServiceI.saveAllEmp(emps);
		return new ResponseEntity<List<Employee>>(saveAllEmp,HttpStatus.CREATED);
	} 
	@GetMapping(value="/getEmpByIdQp",produces="application/json")
    public ResponseEntity<Employee> getEmpByIdQp(@RequestParam int empId){
	Employee empByIdQp= employeeServiceI.getEmpById(empId);
	return new ResponseEntity<Employee>(empByIdQp,HttpStatus.OK);
	
}
	@GetMapping(value="/getEmpByIdPP/{empId}",produces="application/json")
    public ResponseEntity<Employee> getEmpByIdPP(@PathVariable int empId){
	Employee empByIdQp= employeeServiceI.getEmpByPP(empId);
	return new ResponseEntity<Employee>(empByIdQp,HttpStatus.OK);
	}}
	
