package org.openqa.org.openqa.selenium;

import org.testng.annotations.Test;

public class NewTest2 {
  @Test(priority = 4)
  public void D() {
	  System.out.println("D");
  }

@Test(priority = 1)
public void R() {
	System.out.println("R");
}


@Test(priority =3 )
public void S() {
	System.out.println("S");
}

@Test(priority = 2)
public void A() {
	System.out.println("A");
}

}