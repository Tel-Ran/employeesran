package telran.employeeran.model.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import telran.employeeran.dto.Employee;
import telran.employeeran.model.interfaces.IEmployeeran;
@Service
public class EmployeeMaps implements IEmployeeran {
	int salary;
	int added=0;
	int removed=0;
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
		added++;
		boolean res=employees.putIfAbsent(empl.id,
				empl)==null;
		if(res)
			salary+=empl.salary;
		return res;
	}

	@Override
	synchronized public boolean removeEmployee(int id) {
		removed++;
		Employee empl=employees.get(id);
		
		if(empl==null)return false;
		salary-=empl.salary;
		return employees.remove(id)!=null;
	}

	@Override
	public int[] getAddsRemoves() {
		return new int[] {added,removed};
	}

	@Override
	public int getSalary() {
		return salary;
	}
	

}
