package com.expedia.flightsbooking;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class TestNG_SoftAsserts {
 
	

	@Test
  public void testSum() {
		SoftAssert sa = new SoftAssert();
		System.out.println("\nRunning Test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(2, 3);
		sa.assertEquals(result, 1);
		System.out.println("\nLine after line 1");
		sa.assertEquals(result, 5);
		System.out.println("\nLine after line 2");
		sa.assertAll();
  }
}
