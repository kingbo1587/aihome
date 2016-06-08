package com.woohood.aihome.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woohood.aihome.model.StudentDemo;
import com.woohood.aihome.service.StudentDemoService;

/**
 * 
 * @function 学生示例Controller类
 * @description
 * @author shenjinbo
 * @see [相关类/方法](可选)
 * @since [产品/模块版本](可选)
 */
@Controller
@RequestMapping("studentDemo")
public class StudentDemoController {

	@Autowired
	private StudentDemoService studentDemoService;

	/**
	 * 
	 * @function 只定义一个值，get和post请求都可以
	 * @modify <author> <date> <remark>
	 */
	@RequestMapping("toHelloWorld")
	public String toHelloWorld(Model model) {
		model.addAttribute("msg", "Hello World!我支持get和post");
		return "demo/hello_world";
	}

	/**
	 * 
	 * @function 支持get方法
	 * @modify <author> <date> <remark>
	 */
	@RequestMapping(value = "toHelloWorldGet", method = RequestMethod.GET)
	public String toHelloWorld2(Model model) {
		model.addAttribute("msg", "Hello World!我支持get");
		return "demo/hello_world";
	}

	/**
	 * 
	 * @function 支持post方法
	 * @modify <author> <date> <remark>
	 */
	@RequestMapping(value = "toHelloWorldPost", method = RequestMethod.POST)
	public String toHelloWorld3(Model model) {
		model.addAttribute("msg", "Hello World!我支持post");
		return "demo/hello_world";
	}

	/**
	 * 
	 * @function 根据id获取学生信息
	 * @description
	 * @param id
	 * @return
	 * @exception/throws [异常类型][异常说明]
	 * @author shenjinbo
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 * @date 2016年2月24日 下午2:00:58
	 * @modify <author> <date> <remark>
	 */
	@RequestMapping("getById")
	@ResponseBody
	public StudentDemo getById(Integer id) {
		return studentDemoService.getStudentDemo(id);
	}

}