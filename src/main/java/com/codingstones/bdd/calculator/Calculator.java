package com.codingstones.bdd.calculator;

public class Calculator {
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
}
