package org.staff.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.staff.dao.domain.Staff;

@Component
public interface StaffRepository extends JpaRepository<Staff, Long> {

	// 由方法名确定参数例如：findByNameAndId、findByNameOrId、
	List<Staff> findByName(String name);
	
}
