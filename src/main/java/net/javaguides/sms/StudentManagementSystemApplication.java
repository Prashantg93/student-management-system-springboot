package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication extends SpringBootServletInitializer implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	 @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder 
	   application) {
	      return application.sources(StudentManagementSystemApplication.class);
	   }
	 
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		  Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
		  studentRepository.save(student1);
		  
		  Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
		  studentRepository.save(student2);
		  
		  Student student3 = new Student("tony", "stark", "tony@gmail.com");
		  studentRepository.save(student3);
		 
		
	}

}
