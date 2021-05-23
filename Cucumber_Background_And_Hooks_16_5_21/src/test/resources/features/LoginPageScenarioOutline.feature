Feature: Login page feature-scenario Outline

Scenario Outline: Login with  multiple  credentials
Given user is on login page
When user enters username "<UserName>"
And user enters password "<Password>"
And user clicks on Login button
And page title should be "My account - My Store"

  Examples: 
      | UserName          | Password          |
      |balagopalqa@gmail.com|Test@123 |
      |balagopaltest@gmail.com|Test@123 |