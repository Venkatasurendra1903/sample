package com.suri.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SumInTestNg 
{
	@Parameters({"a", "b"})
	@Test
	public void sum(int a, int b)
	{
		int sum = a + b;
		System.out.println("the sum is:"+ sum);
	}

}
