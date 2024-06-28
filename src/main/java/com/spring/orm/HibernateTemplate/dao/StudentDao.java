package com.spring.orm.HibernateTemplate.dao;

import java.util.List;

import com.spring.orm.HibernateTemplate.entity.Student;

public interface StudentDao {

	int save(Student theStudent);

	Student findById(int id);

	List<Student> findAll();

	void update(Student theStudent);

	void delete(int id);

}
