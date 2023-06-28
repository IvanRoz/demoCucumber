package com.codingstones.bdd.calculator;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
		tags =  "@tagValidacionPortal",
		monochrome=true
)

public class RunCalculatorTest {
	
}