Feature: Application Login

Background:
Given validate the browser
When Browser is triggered
Then Check browser is started

@PrtalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "Jerry" and "1234"
Then Home page is populated
And Cards are displayed "true"

@PrtalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and "4321"
Then Home page is populated
And Cards are displayed "false"

@PrtalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User sign up with following details
| jenny | abdc | john@abcd.com | Australia |32569874|
| Jow |bcda | killer@abcd.com | Australia | 3654785|
Then Home page is populated
And Cards are displayed "false"

@PrtalTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with <UserName> and <Password>
Then Home page is populated
And Cards are displayed "true"

Examples:
| UserName | Password |
| User1    | Pass1    |
| User2    | Pass2    |
| User3    | Pass3    |