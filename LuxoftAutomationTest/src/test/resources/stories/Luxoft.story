Login 
Narrative:
In order to login in luxoft.com
As an employee 
I want to update my profile

Scenario: Login to  https://sentinel2.luxoft.com/sen/login.html
Meta:
@tag component:UI

Given the employee is on the Luxoft login page
When the employee login with userEmail = 'vgyosheva', userPassword = 'Eminem188'
Then the employee should search for <leaderboard> 
Then the employee should click on <leaderboard>
Examples:
|leaderboard|
|Kokonov|
|Gyosheva|
|Todorov|


Scenario: 
Given the employee is on the Luxoft Profile page ' LUXproject - Gyosheva Vanya’s Home - Gyosheva Vanya - Confluence'
When the employee  select from Spaces and check 'HR Department Page' page
Then write to excel Basic HR practices
