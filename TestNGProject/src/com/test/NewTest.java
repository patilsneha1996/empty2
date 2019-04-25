package com.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
  @Test
  public void testAssertion()
  {
	  SoftAssert s=new SoftAssert();
	  String actual="sneha";
	  String expected="sneha";
	  System.out.println("in check1");
	  s.assertEquals(actual, expected);
	  System.out.println("in check 2");
	  s.assertTrue(5>3);
	  System.out.println("in check 3");
	 s.assertTrue(5<3);
	  s.assertAll();
  }
  
}
