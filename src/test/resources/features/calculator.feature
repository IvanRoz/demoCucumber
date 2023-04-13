Feature: Calculator
  
  Scenario: Add two numbers
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5
    
  Scenario: Subtract two numbers
    Then I have a calculator
    When I subtract 5 and 3
    Then the result should be 2  
    
  Scenario: Multiply two numbers   
  	Given I have a calculator
  	When I multiply 7 and 4
  	Then the result should be 28 
  	
  Scenario: Divide two numbers	
  	Given I have a calculator
  	When I divide 8 and 2
  	Then the result should be 4
  	
  Scenario: Power two numbers
  	Given I have a calculator
  	When the number is 2 and the exponent is 5
  	Then the result should be 32
  	  
  	@test
  Scenario: Appium integration Test
   Given I test the app 
  	 	
  	
   	
    


  
 
   

