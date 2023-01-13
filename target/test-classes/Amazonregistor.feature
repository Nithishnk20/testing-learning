Feature: To validate the account creation of amazon application

Scenario: To create new account
Given To launch the browser and maximize the window
When To launch url of amazon application
And To click sign in button
And To click create new amazon account button
# one dimensional map data
And To pass name in first and last name text
#key   value 
|name1|inmakes|
|name2|infotech|
|name3|java|
|name4|nithish|
And To pass mobileno in mobileno text box
And To pass email in email text box
#two dimensional map data
And To create new password in new password text box
|password1|password2|password3|
|8668177618|nigdhsy@12|Bhsywwi@45|
|sfuddgeibt@56|9952653398|mwhsubwwt@11|
|nugsigBjdy|owhhuwwoctv%|bytvojjet&|
Then To close the chrome browser