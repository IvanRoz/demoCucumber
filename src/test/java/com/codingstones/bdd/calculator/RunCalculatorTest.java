package com.codingstones.bdd.calculator;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/calculator/calculator.feature"
)
public class RunCalculatorTest {
}