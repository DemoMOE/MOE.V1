package com.hcl.dao;

import java.sql.Connection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Student;

@Repository("baseDAO")
public class BaseDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public void home() {
		Transaction tx = hibernateTemplate.getSessionFactory().openSession().beginTransaction();
		Session ses = hibernateTemplate.getSessionFactory().openSession();
		Connection con = ses.connection();
		Student stu = new Student();
		System.out.println("BaseDAO:home() starting.");
		System.out.println("BaseDAO:home() ending.");
	}

}
