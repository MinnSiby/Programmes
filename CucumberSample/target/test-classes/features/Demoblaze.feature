

Feature: Demoblaze Website checking 
 

  Scenario: Adding to cart after search
    Given User is on demoblaze website 
    When user clicks on Mointors category
    And user clicks on the product "Apple monitor 24"
    And user cliks on Add to cart button
    Then product should be present in the cart option
    

  