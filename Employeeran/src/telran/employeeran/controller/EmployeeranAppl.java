package telran.employeeran.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.employeeran.model.interfaces.IEmployeeran;
import telran.employeeran.dto.*;
@SpringBootApplication
@RestController
@ComponentScan("telran.employeeran.model.impl")
@CrossOrigin
public class EmployeeranAppl {
@Autowired
IEmployeeran employees;

@PostMapping(value=EmployeeranApi.ADD_EMPLOYEE)
boolean addEmployee(@RequestBody Employee order) {
	return employees.addEmployee(order);
}
@DeleteMapping(value=EmployeeranApi.REMOVE_EMPLOYEE)
boolean removeEmployee(int id)
{
	return employees.removeEmployee(id);
}
@GetMapping(value=EmployeeranApi.GET_ALL_EMPLOYEES)
Map<Integer,Employee> getAllEmployees(){
	return employees.getAllEmployees();
}
@GetMapping(value=EmployeeranApi.GET_EMPLOYEE)
Employee getEmployee(int id) {
	return employees.getEmployee(id);
}
	public static void main(String[] args) {
		SpringApplication.run
		(EmployeeranAppl.class, args);

	}

}
