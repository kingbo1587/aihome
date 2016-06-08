package com.woohood.aihome.service.impl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.woohood.aihome.model.StudentDemo;
import com.woohood.aihome.service.StudentDemoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextTest.xml")
public class StudentDemoServiceImplTest {

	@Autowired
	private StudentDemoService studentDemoService;

	@Test
	public void testAddStudentDemo() {
		StudentDemo record = new StudentDemo();
		record.setName("xiaoming4");
		record.setAge(1);
		int i = studentDemoService.addStudentDemo(record);
		assertEquals(1, i);
	}

	@Test
	public void testgetStudentDemo() {
		List<StudentDemo> list = studentDemoService.getStudentDemo("xiaoming3");
		assertEquals(3, list.get(0).getId().intValue());
	}

}
