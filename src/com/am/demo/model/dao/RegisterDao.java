package com.am.demo.model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.am.demo.dto.Register;

@Repository
public class RegisterDao {

	@Autowired
	private SessionFactory sessionFactory;
	public RegisterDao() {
		System.out.println(this.getClass().getSimpleName()+" creeated");
	}
	
	public void saveRegistrationData(Register register) {
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
				session.save(register);
				transaction.commit();
	}
}
