package com.woohood.aihome.demo;

import org.junit.Test;

public class TestTryCatch {

	/**
	 * 
	 * @function 验证return 之后finally依旧执行
	 */
	@Test
	public void test1() {
		try {
			return;
		} catch (Exception e) {
		} finally {
			System.out.println("Hello World!");
		}
	}

}
