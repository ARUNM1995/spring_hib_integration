package com.am.demo.controller;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.am.demo.dto.Register;
import com.am.demo.model.service.RegisterService;

@Controller
@RequestMapping("/")
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	public RegisterController() {
		System.out.println(this.getClass().getSimpleName()+" creeated");
	}
	
	@PostMapping(name = "/register")
	public void saveRegistrationData(Register register) {
		registerService.saveRegistrationData(register);
	}
}
