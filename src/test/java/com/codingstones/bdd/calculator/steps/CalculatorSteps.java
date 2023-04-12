package com.codingstones.bdd.calculator.steps;

import com.codingstones.bdd.calculator.BaseClass;
import com.codingstones.bdd.calculator.CalculatorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.BeforeAll;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class CalculatorSteps {

    static CalculatorPage calculator;
    
	static BaseClass baseClass = new BaseClass();
	
	@BeforeAll
	public static void before_or_after_all() {
		
		baseClass.setup();
	}

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
    	calculator = new CalculatorPage();
    }
    
    
    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
    	calculator.sum(arg1, arg2);
    	
    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int arg1) throws Throwable {
        assertEquals(arg1, calculator.currentValue());
    }
    
    @When("^I subtract (\\d+) and (\\d+)$")
    public void i_subtract_and(int arg1, int arg2) throws Throwable {
        calculator.subtract(arg1, arg2);
    }
    
    @When("I multiply {int} and {int}")
    public void i_multiply_and(Integer int1, Integer int2) {
        calculator.mult(int1,int2);
    }
   
    @Given("I do something in the app")
    public void i_do_something_in_the_app() {
        calculator.prueba();
    }








}
