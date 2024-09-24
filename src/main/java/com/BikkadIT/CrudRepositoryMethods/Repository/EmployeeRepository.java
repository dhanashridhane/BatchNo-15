package com.BikkadIT.CrudRepositoryMethods.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.CrudRepositoryMethods.Model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
