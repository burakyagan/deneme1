Feature: Login Page Check




  #1
  Scenario: User tries to login rahulshettyacademy page with correct credentials

    #Pre-Condition
  Given rahulshettyacademy is opening without any problem
  And   api.... should return 200 OK
  And   Page needs to start with EN language

    #Test Steps

  When User fills Username as "burak"
  And  User fills Password as "rahulshettyacademy"
  And  User clicks the privacy policy box to approve the conditions
  And  User clicks SIGN IN button to land the page
  And  After filling all the parameters correctly, user checks whether the page is opened or not



    #Expected
  Then Username field needs to be filled as "burak" without any problem
  And  Password field needs to be filled as "rahulshettyacademy" without any problem
  And  User should be able to click privacy policy box successfully
  And  SIGN IN button should be clickable
  And  User needs to land the related page without any problem after filling all the parameters correct


      #2
  Scenario: User tries to login rahulshettyacademy page with wrong credentials

  #Pre-Condition
    Given rahulshettyacademy is opening without any problem
    And   api.... should return 200 OK
    And   Page needs to start with EN language

  #Test Steps

    When User fills Username as "burak."
    And  User fills Password as "xyz123."
    And  User clicks the privacy policy box to approve the conditions
    And  User clicks SIGN IN button to land the page
    And  After filling all the field with wrong parameters , user checks whether the page is opened or not



  #Expected
    Then Username field needs to be filled as "burak." without any problem
    And  Password field needs to be filled as "xyz123." without any problem
    And  User should be able to click privacy policy box successfully
    And  SIGN IN button should be clickable
    And  User should not be able to land the related page after filling all the fileds with wrong paramters



    #3
  Scenario: User forgot to password and tries to reset login

  #Pre-Condition
    Given rahulshettyacademy is opening without any problem
    And   api.... should return 200 OK
    And   Page needs to start with EN language

  #Test Steps

    When User clicks the "Forgot your password" phrase to get the password
    And  User tries to fill Name , Email ,and Phone Number areas to get the password
    And  After filling all the three fields, user clicks "RESET LOGIN"
    And  User checks whether the text "Please use temporary password 'rahulshettyacademy' to Login." appears on the screen or not
    And  User clicks "GO TO LOGIN" button and write the correct parameters into Username and Password fields
    And  User tries to sign in to the webpage by clicking "SIGN IN" button



  #Expected
    Then User should click to the "Forgot your password" phrase without any problem, and should see the "Forgot passoword" page
    And  User needs to fill Name , Email ,and Phone Number areas to get the password successfully
    And  After filling all the fileds, user should be able to click "RESET LOGIN" without any problem
    And  "Please use temporary password 'rahulshettyacademy' to Login." phrase should appear at the top of the Name field
    And  User can click to the "GO TO LOGIN" button ,and can fill with the correct parameters into Username and Password fields
    And  User should be able to click to the "SIGN IN" button and page should open







