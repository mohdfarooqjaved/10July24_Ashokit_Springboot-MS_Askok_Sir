package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		EmployeeService service=context.getBean(EmployeeService.class);
		service.saveEmployee();
		service.getAllEmps();
		service.getEmpsWithCountry("india");
		service.getEmpsByGender("Male");
		service.getEmpsByGenderAndCountry("male", "india");
		service.getEmpsBySalaryGreaterThan(5000.00);
	}

}
