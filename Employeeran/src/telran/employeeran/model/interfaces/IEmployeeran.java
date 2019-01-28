package telran.employeeran.model.interfaces;

import java.util.Map;

import telran.employeeran.dto.Employee;

public interface IEmployeeran {
Employee getEmployee(int id);
Map<Integer,Employee> getAllEmployees();
boolean addEmployee(Employee empl);
boolean removeEmployee(int id);
int[]getAddsRemoves();
int getSalary();
}
