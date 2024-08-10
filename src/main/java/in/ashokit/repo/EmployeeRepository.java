package in.ashokit.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	//select * from employee where emp_country='india';
	
	//empCountry is a entity class column name and convert first character of variable name to upper case
	public List<Employee> findByEmpCountry(String country);
	
	//select * from employee where emp_gender='Male'
	public List<Employee> findByEmpGender(String gender);
	
	//select * from employee where emp_gender='male' and emp_country='india'
	public List<Employee> findByEmpGenderAndEmpCountry(String gender ,String country);

//select * from employee where emp_salary>=5000
	public List<Employee> findByEmpSalaryGreaterThanEqual(double salary);
	
}
