package com.spring.orm.HibernateTemplate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.orm.HibernateTemplate.entity.Student;

@Repository("studentDaoImplementation")
public class StudentDaoImplementation implements StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public Student findById(int id) {
		Student s = hibernateTemplate.get(Student.class, id);
		return s;
	}

	@Override
	public List<Student> findAll() {
		List<Student> students = hibernateTemplate.loadAll(Student.class);
		return students;
	}

	@Override
	@Transactional
	public int save(Student theStudent) {
		int i = (Integer) hibernateTemplate.save(theStudent);
		return i;
	}

	@Override
	@Transactional
	public void update(Student theStudent) {
		hibernateTemplate.saveOrUpdate(theStudent);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Student s1 = hibernateTemplate.get(Student.class, id);
		hibernateTemplate.delete(s1);
	}

}
