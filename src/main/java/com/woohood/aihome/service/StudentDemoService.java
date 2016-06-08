package com.woohood.aihome.service;

import java.util.List;

import com.woohood.aihome.model.StudentDemo;

public interface StudentDemoService {

	int addStudentDemo(StudentDemo record);

	StudentDemo getStudentDemo(Integer id);

	List<StudentDemo> getStudentDemo(String name);

}
