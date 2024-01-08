package com.expedia.flightsbooking;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Grouping {
  
  @BeforeClass(alwaysRun=true)
  public void setUP() {
	  System.out.println("Before class");
  }

  @Test(groups = {"cars", "suv"})
  public void testBMWX6() {
	  System.out.println("Running test -> BMWX6");
  }
  
  @Test(groups = {"cars", "sedan"})
  public void testAudiA6() {
	  System.out.println("Running test -> AudiA6");
  }
  
  @Test(groups = {"motobike"})
  public void testNinja() {
	  System.out.println("Running test -> Ninja");
  }
  
  @Test(groups = {"motobike"})
  public void testHondaCBR() {
	  System.out.println("Running test -> HondaCBR");
  }
  
  @AfterClass(alwaysRun=true)
  public void cleanUp() {
	  System.out.println("After class");
  }

}
