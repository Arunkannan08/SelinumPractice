package com.practiceSelenium;

import org.testng.annotations.Test;

public class GroupingTestNg {

	@Test(groups = "Veg")
	private void idly() {
		System.out.println("Idly");
	}

	@Test(groups = "Veg")
	private void rice() {
		System.out.println("rice");
	}
	
	@Test(groups= "NONVEG")
	public void chicken()
	{
		System.out.println("Chicken");
	}
	
	@Test(groups="NONVEG")
	public void mutton()
	{
		System.out.println("Mutton");
	}

}
