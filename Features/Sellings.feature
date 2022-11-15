Feature: eBay Selling

Scenario: Check that user is able to navigate to ebay homepage 

Given User launch the browser
When User opens the URL
Then Page title "ebay" should be displayed


Scenario: Check that user is able to sell a product

Given User is in homepage
When User click on sell
And User click on list an item 
When User search to sell for a product with name "shoes" 
Then Product with name "shoes" should be displayed


Scenario: Check that user able to continue to listing

Given the user is on the sell page
When user click on continue without match
And click on New with box
Then Continue to listing should be added


Scenario:  verify that the user is able to marketing tools for selling the products

Given the user is on listing page
When user added basic details and advertising
And list it 
Then user get the listed item of products with details





















