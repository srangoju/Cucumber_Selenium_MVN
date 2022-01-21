@featureTest 
Feature: Landing into GreenKart website

@Scenario1
	Scenario: Search operation
    Given user is on homepage
    When user enters itemname 
    Then entered item should be displayed

@Scenario2   
  Scenario: Add to Cart
  	When user clicks on add to cart
  	Then item should be added to cart 
