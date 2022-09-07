package com.test.modelmap;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controiir {
	@Autowired
	private ModelMapper mapper;
	@GetMapping("/")
public Employeebean gettest() {
	Employee e=new Employee(11, "Esla");
	Employeebean ebEmployeebean=mapper.map(e, Employeebean.class);
	return ebEmployeebean;
}
}
