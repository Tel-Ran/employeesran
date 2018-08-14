package telran.employeeran.dto;

public class Employee {
public int id;
public String emailAddress;
public String name;
public String gender;
public String companyName;
public int salary;
public String title;
public String getTitle() {
	return title;//was missing
}
public int getId() {
	return id;
}
public String getEmailAddress() {
	return emailAddress;
}
public String getName() {
	return name;
}
public String getGender() {
	return gender;
}
public String getCompanyName() {
	return companyName;
}
public int getSalary() {
	return salary;
}

}
