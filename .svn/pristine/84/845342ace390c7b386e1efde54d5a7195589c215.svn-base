package com.woohood.aihome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woohood.aihome.model.StudentDemo;
import com.woohood.aihome.model.StudentDemoExample;
import com.woohood.aihome.model.StudentDemoExample.Criteria;
import com.woohood.aihome.persistence.StudentDemoMapper;
import com.woohood.aihome.service.StudentDemoService;

/**
 * 
 * @function 学生Service
 * @description 
 * @author shenjinbo
 * @see [相关类/方法](可选)
 * @since [产品/模块版本](可选)
 */
@Service
public class StudentDemoServiceImpl implements StudentDemoService {

	@Autowired
	private StudentDemoMapper studentDemoMapper;

	@Override
	public int addStudentDemo(StudentDemo record) {
		return studentDemoMapper.insert(record);
	}

	@Override
	public StudentDemo getStudentDemo(Integer id) {
		return studentDemoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<StudentDemo> getStudentDemo(String name) {
		StudentDemoExample example = new StudentDemoExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameLike(name);
		return studentDemoMapper.selectByExample(example);
	}

}
