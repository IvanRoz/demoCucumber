package com.codingstones.bdd.calculator.steps;

import com.codingstones.bdd.calculator.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.BeforeAll;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculatorSteps {

    static Calculator calculator;

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
    	calculator = new Calculator();
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

}
