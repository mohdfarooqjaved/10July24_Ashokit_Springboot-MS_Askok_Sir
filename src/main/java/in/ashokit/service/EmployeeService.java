package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@Service
public class EmployeeService {

	public EmployeeRepository empRepo;
	
	//constructor Injection is performed 
	EmployeeService(EmployeeRepository empRepo)
	{
		this.empRepo=empRepo;
	}
	
	public void saveEmployee()
	{
		Employee emp=new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Raju");
		emp.setEmpSalary(6000.00);
		emp.setEmpGender("male");
		emp.setEmpCountry("India");
		//insert record 
		empRepo.save(emp);
		System.out.println("Employee Record save....");
	}
	
	public void getAllEmps()
	{
		Iterable<Employee> emps=empRepo.findAll();
		emps.forEach(System.out::print);
		emps.forEach(p->System.out.println(p));
	}
	
	public void getEmpsWithCountry(String country)
	{
		Iterable<Employee> emps=empRepo.findByEmpCountry(country);
		emps.forEach(System.out::print);
		emps.forEach(p->System.out.println(p));
	}
	
	public void getEmpsByGender(String gender)
	{
		Iterable<Employee> emps=empRepo.findByEmpGender(gender);
		emps.forEach(System.out::print);
		emps.forEach(p->System.out.println(p));
	}
	
	public void getEmpsByGenderAndCountry(String gender,String country)
	{
		Iterable<Employee> emps=empRepo.findByEmpGenderAndEmpCountry(gender,country);
		emps.forEach(System.out::print);
		emps.forEach(p->System.out.println(p));
	}
	
	public void getEmpsBySalaryGreaterThan(double salary)
	{
		Iterable<Employee> emps=empRepo.findByEmpSalaryGreaterThanEqual(salary);
		//emps.forEach(System.out::print);
		emps.forEach(p->System.out.println(p.getEmpSalary()));
	}
	
}
