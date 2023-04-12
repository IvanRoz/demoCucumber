package com.codingstones.bdd.calculator;

import org.openqa.selenium.By;

import com.codingstones.bdd.calculator.BaseClass;

public class CalculatorPage extends BaseClass{
	
    private int value;
	
    
    public void sum(int aNumber, int anotherNumber){
        value = aNumber + anotherNumber;
        System.out.println(value);
    }
    
    
    
    public void subtract(int aNumber, int anotherNumber) {
        value = aNumber - anotherNumber;
        System.out.println(value);
    }
    

    public int currentValue(){
    	 System.out.println(value);
        return value;
    }


    public void mult(Integer int1, Integer int2) {
    	value = int1 * int2;
    	System.out.println(value);
	}
    
    
    public void prueba() {
    	driver.findElement(By.name("Crear")).click();;
    }
    
}
