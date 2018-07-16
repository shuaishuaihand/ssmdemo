package com.agesun.mybatis.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.agesun.mybatis.bean.Employee;
import com.agesun.mybatis.dao.EmployeeMapper;
import com.agesun.mybatis.service.EmployeeService;


@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	/*@Autowired
	private EmployeeMapper  employeeMapper;*/
	
	@RequestMapping("/getemps")
	public String  emps(Map<String,Object> map){
		//Map<String,Object> map
		System.out.println("getemps");
	List<Employee>	emps=employeeService.getEmps();
	map.put("allemps", emps);
		return "list";
		
	}
	
	
	
	@RequestMapping("/getempsid")
	public String  empsid(Map<String,Object> map){
		//Map<String,Object> map
		System.out.println("getemps");
	Employee	emp=employeeService.getEmpById();
	map.put("empsid", emp);
		return "list";
		
	}

}
