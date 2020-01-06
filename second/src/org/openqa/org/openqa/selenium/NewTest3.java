package org.openqa.org.openqa.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest3 {
  @Test
  public void f() {
	  System.out.println("S");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("A");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("N");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("D");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("E");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("P");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("K");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("U");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("M");
  }

}
