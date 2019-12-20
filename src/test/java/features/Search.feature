Feature: Search and place Order For Vegetables
@SeleniumTest
Scenario: Search for Items and validate results
Given User in on Greencart Landing page
When User searched for Cucumber Vegatable
Then "Cucumber" result are displayed

@SeleniumTest
Scenario Outline: Search for Items and then moved to checkout page
Given User in on Greencart Landing page
When User searched for <Name> Vegatable
And Added items to cart
And User proceeded to Checkout page for parchase
Then verify selected <Name> items are displayed in the Checkout pages for purchase

Examples:
| Name    |
| Brinjal | 
| Cucumber| 
| Beetroot|

