package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Newtest4 {
@Test(dataProvider="dp1")
public void testProvider(String username,String pwd)
{
	System.out.println(username+"\t\t"+pwd);
}
@DataProvider(name="dp1")
public Object[][] getData(){
	Object[][] obj=   {
			     {"sne","sne"},
		    	{"lee","lee"},
			     {"park","park"}
			
	};
	return obj;
	
}
}
