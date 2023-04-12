package com.codingstones.bdd.calculator;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/calculator/calculator.feature",
		tags =  "@test",
		monochrome=true
)

public class RunCalculatorTest {
	
}