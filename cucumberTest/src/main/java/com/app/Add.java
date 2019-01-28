package com.app;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add {
	@Given("the input {string}") 
	public void theInputOntPlusOne (String string) throws Throwable{
		
	
		throw new PendingException();
	}
	
	@When("the calculator is executed")
	public void theCalculatorIsExecuted() throws Throwable{
		
		
		throw new PendingException();
	}
	
	@Then("the output should be \"2\"")
	public void theOutPutShoulBe(String string) throws Throwable{
		
		throw new PendingException();
	}
	

}
