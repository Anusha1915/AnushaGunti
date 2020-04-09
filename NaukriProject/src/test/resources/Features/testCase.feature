Feature: Naukri page
This feature verifies the functionality on naukri page

@tc01_Naukripage_Login
Scenario Outline: Validate the login functionality
Given user launches chrome browser
When user opens the Login Naukri page
Then enters username and password
Then user clicks on login button 

Examples:
               |username                       |password    |
               |Mushamnihasvi@gmail.com        |Nihachinna@12|
               
@tc02_Naukripage_Search               
Scenario: Search Page
Given search Launches the google browser
Then user enters the details for searching jobs
Then Search Takes a screenshot

@tc03_Naukripage_Mobile
Scenario: Download link
Given Download launches the chrome browser
Then user enters the mobile number
And User clicks the download link button

@tc04_Naukripage_Employee
Scenario: For Employee
Given Open the Naukri page
And Go to For Employees section
And Add the required product to cart