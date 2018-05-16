package org.satff.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.staff.dao.domain.Staff;
import org.staff.service.StaffService;

@RestController
@EnableAutoConfiguration
public class StaffController {
	@Autowired
	private StaffService staffService;
	
	//增（put）删(delete)改(post)查(get)
	@PutMapping(value="add")
	public String toAdd(@RequestParam("name") String name,@RequestParam("age") int age){
		List<Staff> staffs = staffService.findByName(name);
		if(CollectionUtils.isEmpty(staffs)){
			Staff staff = new Staff();
			staff.setName(name);
			staff.setAge(age);
			staffService.save(staff);
			return "true";
		}
		return "exists";
	}
	
	@DeleteMapping(value="delete")
	public boolean delete(@RequestParam(value = "id") long id){
		staffService.deleteById(id);
		return true;
	}
	
	@GetMapping(value="findAll")
	public String findAll(){
		return staffService.findAll().toString();	
	}
}
