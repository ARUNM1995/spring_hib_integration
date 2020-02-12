package com.am.demo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.am.demo.dto.Register;
import com.am.demo.model.dao.RegisterDao;

@Service
public class RegisterService {

	@Autowired
	private RegisterDao registerDao;
	public RegisterService() {
		System.out.println(this.getClass().getSimpleName()+" creeated");
	}
	
	public void saveRegistrationData(Register register) {
		registerDao.saveRegistrationData(register);
	}
}
