package org.staff.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.staff.dao.domain.Staff;
import org.staff.dao.repository.StaffRepository;
import org.staff.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffRepository staffRepository;

	@Override
	public List<Staff> findByName(String name) {
		return staffRepository.findByName(name);
	}

	@Override
	public List<Staff> findAll() {
		return staffRepository.findAll();
	}

	@Override
	public void save(Staff staff) {
		staffRepository.save(staff);
	}

	@Override
	public void saveAll(List<Staff> staffs) {
		staffRepository.saveAll(staffs);
	}

	@Override
	public void deleteById(long id) {
		staffRepository.deleteById(id);
	}

	@Override
	public void deleteInBatch(List<Staff> staffs) {
		staffRepository.deleteInBatch(staffs);
	}

	@Override
	public void deleteAll() {
		staffRepository.deleteAll();
	}
	
	
}
