package org.satff.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.staff.dao.domain.Staff;
import org.staff.service.StaffService;

@Controller
@EnableAutoConfiguration
public class TestController {
	@Autowired
	private StaffService staffService;
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String toLogin(){
		System.out.println(staffService.findAll().toString());
		return "login";
	}
	
}
