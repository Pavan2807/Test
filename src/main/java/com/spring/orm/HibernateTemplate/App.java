package com.spring.orm.HibernateTemplate;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.orm.HibernateTemplate.dao.StudentDao;
import com.spring.orm.HibernateTemplate.dao.StudentDaoImplementation;
import com.spring.orm.HibernateTemplate.entity.Student;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				HibernateConfiguration.class);
		StudentDao dao = (StudentDao) context.getBean("studentDaoImplementation");

		Student s = new Student("Patil", "AP");
		dao.save(s);
		System.out.println("saved");
		System.out.println("=================");

		List<Student> students = dao.findAll();
		for (Student s1 : students) {
			System.out.println(s1);
		}
		System.out.println("=================");

		System.out.println(dao.findById(2));
		System.out.println("=================");

		Student s1 = dao.findById(4);
		s1.setName("Pavan");
		dao.update(s1);
		System.out.println("updated");
		System.out.println("=================");

		dao.delete(2);
		System.out.println("Deleted");

	}
}
