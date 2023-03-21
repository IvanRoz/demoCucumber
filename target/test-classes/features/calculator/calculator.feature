Feature: Calculadora
  
  Scenario: Add two numbers
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5
    
  Scenario: Subtract two numbers
    Given I have a calculator
    When I subtract 5 and 3
    Then the result should be 2