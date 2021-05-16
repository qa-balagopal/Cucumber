Feature: Account Page Feature

Background:
Given user has already logged in to application
|username|password|
|balagopalqa@gmail.com|Test@123|

Scenario: Accounts page title
Given user is on Accounts page
When user gets the title of the page
Then page title should be "My account - My Store"

Scenario: Order History page title
Given user is on Order History page
When user gets the title of the page
Then page title should be "Order history - My Store"

Scenario: Address page title
Given user is on Address page
When user gets the title of the page
Then page title should be "Addresses - My Store"