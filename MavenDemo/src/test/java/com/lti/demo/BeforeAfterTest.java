package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAfterTest {

Calculator c = new Calculator();
int sum;
	
	@BeforeAll
    public static void testDbConn()
    {
	System.out.println(" db conn is up");
    }

	@BeforeEach
	public void testStartup()
	{
		sum=500; 
		System.out.println(" before each");
	}
	
	@Test
	public void testsayHello()
	{
		Assertions.assertEquals("hello",c.sayHello());
		System.out.println(" sayHello");
		sum = sum+1000;
		System.out.println(  sum);
	}
	
	@Test
	public void testadd()
	{
		Assertions.assertEquals(100,c.add(60,40));
		System.out.println(" testadd");
		sum = sum+2000;
		System.out.println(  sum);
	}
	
	@Test
	void testAssertFalse()
	{
		Assertions.assertTrue("meenal".length()==6);
		Assertions.assertFalse("meenal".length()==10);//runs if condition is false
		Assertions.assertNotEquals("Hello","hello");
		System.out.println(" true true false");
	}
	
	@AfterAll
	public static void testDbClose()
	{
		System.out.println("once - db conn is closed");
		
	}
	
	@AfterEach
	public void testCleanUp()
	{
		sum=0;
		System.out.println("clean up");
		
	}
	
	
}
