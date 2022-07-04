package com.step;

import com.reusable.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	@Given("User first step {string}")
	public void userFirstStep(String string) {
	   
	}
	@Given("User first step	\"name\"")
	public void userFirstStepName() {
	  
	}
	@When("User second step")
	public void userSecondStep() {
		System.out.println("step2");
	}
	@When("User Third step")
	public void userThirdStep() {
		System.out.println("step3");
	}
	@Then("User last step")
	public void userLastStep() {
		System.out.println("step4");
	}

	@Given("User first step signup")
	public void userFirstStepSignup() {
		System.out.println("SignUp1");
	}
	@When("User second step signup")
	public void userSecondStepSignup() {
		System.out.println("SignUp2");
	}
	@When("User Third step signup")
	public void userThirdStepSignup() {
		System.out.println("SignUp3");
	}
	@Then("User last step signup")
	public void userLastStepSignup() {
		System.out.println("SignUp4");
	}
	
	@Given("User first step forget password")
	public void userFirstStepForgetPassword() {
		System.out.println("forget password1");
	}
	@When("User second step forget password")
	public void userSecondStepForgetPassword() {
		System.out.println("forget password2");
	}
	@When("User Third step forget password")
	public void userThirdStepForgetPassword() {
		System.out.println("forget password3");
	}
	@Then("User last step forget password")
	public void userLastStepForgetPassword() {
		System.out.println("forget password4");
	}
	
	@Given("User first verify page")
	public void userFirstVerifyPage() {
		System.out.println("verify page1");  
	}
	@When("User second step verify page")
	public void userSecondStepVerifyPage() {
		System.out.println("verify page2");  
	}
	@When("User Third step verify page")
	public void userThirdStepVerifyPage() {
		System.out.println("verify page3");  
	}
	@Then("User last step verify page")
	public void userLastStepVerifyPage() {
		System.out.println("verify page4");  
	}



}
