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


    public void mult(Integer int1, Integer int2) {
    	value = int1 * int2;
    	System.out.println(value);
	}
    public void pot(Integer int1, Integer int2) {
    	value = (int) Math.pow(int1, int2);
    	System.out.println(value);
	}
    
}
