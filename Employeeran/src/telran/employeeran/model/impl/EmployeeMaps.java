package telran.employeeran.model.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import telran.employeeran.dto.Employee;
import telran.employeeran.model.interfaces.IEmployeeran;
@Service
public class EmployeeMaps implements IEmployeeran {
HashMap<Integer,Employee> employees=new HashMap<>();
	@Override
	synchronized public Employee getEmployee(int id) {
		return employees.get(id);
	}

	@Override
	synchronized public Map<Integer, Employee> getAllEmployees() {
		return new HashMap<Integer,Employee>(employees);
	}

	@Override
	synchronized public boolean addEmployee(Employee empl) {
		return employees.putIfAbsent(empl.id,
				empl)==null;
	}

	@Override
	synchronized public boolean removeEmployee(int id) {
		return employees.remove(id)!=null;
	}

}
