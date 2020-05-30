Feature: Verify DyP login feature.
Given User is on DyP home page
When clicks on Login/Register button
AND Enters Username, Password and clicks on Login button
Then DyP dashboard page gets opened.

@LoginDyp
Scenario: Verify DyP Internal user login with correct credentials
When User clicks Login/Register button on home page
And Enters Username, Password
And Clicks on Login button
Then DyP Internal user dashboard page gets opened

@LoginDyp
Scenario: Verify user can register to DyP portal
When User clicks Login/Register button 
And clicks on Register button
And Enter provider registration details
And submits provider registration form
Then Provider gets registered successfully
