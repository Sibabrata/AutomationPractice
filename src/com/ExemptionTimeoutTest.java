package com;

import org.testng.annotations.Test;

public class ExemptionTimeoutTest {
	
/*	@Test(timeOut=2, expectedExceptions=NumberFormatException.class)
	public void Infiniteloop() {
		int i = 1;
		while(i==1) {
			
			System.out.println(i);
		}
		*/
	
		@Test(expectedExceptions= NumberFormatException.class)
		public void Test1() {
			
			String x = "100A";
			Integer.parseInt(x);
		}
		
	}


