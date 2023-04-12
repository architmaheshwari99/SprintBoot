package com.architmahes.cruddemo;

import com.architmahes.cruddemo.dao.StudentDAO;
import com.architmahes.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {

		Student student = new Student("Paul", "Doe", "paul@email.com");

		studentDAO.save(student);

		System.out.println(student.getId());

	}

}
