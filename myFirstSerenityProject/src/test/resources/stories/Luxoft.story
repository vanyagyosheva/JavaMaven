Lookup a definition
Narrative:
In order to bye something
As an online customer
I want to search for online products

Scenario: Search for 'dress'
Given the user is on the ScoreTwice home page
When user login userEmail = 'vania_gyeo6eva@abv.bg', userPassword = 'VanyaGyosheva12'
Then the user search for  'dress'
Then they should see all the results 'ЦЕНА'
Then user should add product




