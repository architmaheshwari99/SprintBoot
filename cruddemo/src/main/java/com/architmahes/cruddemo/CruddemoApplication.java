package com.architmahes.cruddemo;

import com.architmahes.cruddemo.dao.StudentDAO;
import com.architmahes.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
//			readStudent(studentDAO);
//			readStudents(studentDAO);
//			findByLastName(studentDAO);
			updateStudent(studentDAO);
		};
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student st = studentDAO.findById(1);

		st.setFirstName("Fatty");

		studentDAO.update(st);

		System.out.println(st);
	}

	private void findByLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastName("Duck");
		for(Student st: students){
			System.out.println(st);
		}
	}

	private void readStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();

		for(Student st: students){
			System.out.println(st);
		}

	}

	private void readStudent(StudentDAO studentDAO) {

		Student student = new Student("Daffy", "Duck", "duck@email.com");

		studentDAO.save(student);

		int id = student.getId();
		System.out.println(id);

		Student st = studentDAO.findById(id);

		System.out.println(st);

	}

	private void createStudent(StudentDAO studentDAO) {

		Student student = new Student("Paul", "Doe", "paul@email.com");

		studentDAO.save(student);

		System.out.println(student.getId());

	}

}
