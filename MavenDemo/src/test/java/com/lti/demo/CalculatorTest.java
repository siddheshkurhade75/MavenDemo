package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator c = new Calculator();
	
	
	@Test
	public void testsayHello()
	{
		Assertions.assertEquals("hello",c.sayHello());
	}
	
	@Test
	public void testadd()
	{
		Assertions.assertEquals(100,c.add(60,40));
	}
	

	@Test
	void testAssertFalse()
	{
		Assertions.assertTrue("meenal".length()==6);
		Assertions.assertFalse("meenal".length()==10);
		
	}
	@Test
	void testAssertNull()
	{
		String str1=null;
		String str2="abcd";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
		
	}
	
	public void testArrayList()
	{
		ArrayList<Integer> myList=new ArrayList<Integer>();
		Assertions.assertEquals(0,myList.size());
		myList.add(100);
		myList.add(200);
		
		
		
	}
	

}
