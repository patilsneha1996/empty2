package com.tests;

import org.testng.annotations.Test;

@Test(priority=1)
public class NewTest1 {
public void testGoogleHomepage()
{
	System.out.println("in test google homepage");
}
@Test(priority=2)
public void testAccentrurePortal()
{
	System.out.println("in test accenture Portal");
}
@Test(priority=3)
public void demoPortal()
{
	System.out.println("in test demo Portal");
}

	

}
