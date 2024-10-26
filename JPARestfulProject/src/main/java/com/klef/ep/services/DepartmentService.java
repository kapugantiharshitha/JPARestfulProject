package com.klef.ep.services;

import java.util.List;

import com.klef.ep.models.Department;

public interface DepartmentService 
{
	public String addDepartment(Department dept);
	public List<Department>viewALLDepartments();

}
