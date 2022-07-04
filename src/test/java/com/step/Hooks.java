package com.step;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void m1() {
		System.out.println("Hooks 1");
	}
	
	@After
	public void m2() {
		System.out.println("Hooks 2");
	}


}
