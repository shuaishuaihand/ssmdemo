package com.agesun.mybatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agesun.mybatis.bean.Employee;
import com.agesun.mybatis.dao.EmployeeMapper;
import com.agesun.mybatis.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Resource
	EmployeeMapper em;
	
	@Override
	public List<Employee> getEmps() {
		System.out.println("--------------------");
		return em.getEmps();
	}

	@Override
	public Employee getEmpById() {
		
		return em.getEmpById(1);
	}

}
