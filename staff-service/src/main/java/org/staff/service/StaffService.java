package org.staff.service;

import java.util.List;

import org.staff.dao.domain.Staff;

public interface StaffService {
	/**
	 * 根据名字查询用户信息
	 * @param name
	 * @return
	 */
	List<Staff> findByName(String name);

	/**
	 * 查询所有用户信息
	 * @return
	 */
	List<Staff> findAll();
	
	/**
	 * 新增用户信息
	 * @param staff
	 */
	void save(Staff staff);
	
	/**
	 * 批量增加用户
	 * @param staffs
	 */
	void saveAll(List<Staff> staffs);
	
	/**
	 * 根据id删除用户信息
	 * @param id
	 */
	void deleteById(long id);
	
	/**
	 * 删除所有用户信息
	 */
	void deleteAll();
	
	/**
	 * 批量删除用户信息
	 * @param staffs
	 */
	void deleteInBatch(List<Staff> staffs);
	
}
