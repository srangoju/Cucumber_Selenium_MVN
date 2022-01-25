
Feature: Landing into GreenKart website

	Scenario: Search operation
    Given user is on homepage
    When user enters "<itemname>"
    Then entered item should be displayed
    
    Examples:
    	| itemname  |
			| brocolli | 
			| Beans | 
    
  Scenario: Add to Cart
  	When user clicks on add to cart
  	Then item should be added to cart 

Feature: Landing into GreenKart website

	Scenario: Search operation
    Given user is on homepage
    When user enters "<itemname>" 
    Then entered item should be displayed
  
  Scenario: Add to Cart
  	When user clicks on add to cart
  	Then item should be added to cart 

