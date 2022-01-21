   
Feature: Landing into GreenKart website

	Scenario: Search operation
    Given user is on homepage
    When user enters "Brocolli" 
    Then entered item should be displayed
    
  Scenario: Add to Cart
  	When user clicks on add to cart
  	Then item should be added to cart 
