package com.codingstones.bdd.calculator;

public class CalculatorPage {
	
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


    public void mult(Integer aNumber, Integer anotherNumber) {
    	value = aNumber * anotherNumber;
    	System.out.println(value);
	}
    
    public void divide(int aNumber, int anotherNumber) {
    	value = aNumber / anotherNumber;
    	System.out.println(value);
    }
}
