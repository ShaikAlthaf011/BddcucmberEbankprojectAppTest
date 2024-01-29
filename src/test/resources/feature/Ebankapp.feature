Feature: Login Banking Application Test different functionalities
Background:
  Given  Navigate the Ebank Application

Scenario: Verify Test  the Ebank Application
  When   Verify Ebank Click on the login button
  Then   Verify the Error Message
  Then   Close the Browser

Scenario: Verify Test the Ebank Application Empty User Id
  When  Verify Enter The  pin number Ebank Funcationalities
  When  Verify Ebank Click on the login button
  Then  Verify Error Text message
  Then   Close the Browser

Scenario: Verify Test the Ebank Application Empty pin Id
  When Verify Enter the User Id Ebank Funcationalities
  When  Verify Ebank Click on the login button
  Then  Verify Invalid Error message
  Then   Close the Browser

Scenario: Verify Test The Ebank Application Login Functionalities Invalid Id
  When  Verify Enter Invalid user id Ebank Application
  Then  Verify Enter Invalid Pin id Ebank Application
  When  Verify Ebank Click on the login button
  Then  Verify Error Message login Funcationalities
  Then   Close the Browser

Scenario: Verify Test The Ebank Application Login Functionalities Valid user  ad pin Id
  When  Verify Enter Valid User id Ebank Application
  Then  Verify Enter Valid Pin id Ebank Application
  When  Verify Ebank Click on the login button
  Then  Verify The Url
  Then   Close the Browser

Scenario: Verify Test The Ebank Application Login Funcationalities
  When  Verify Enter Valid User id Ebank Application
  Then  Verify Enter Valid Pin id Ebank Application
  When  Verify Ebank Click on the login button
  Then  Verify The Url
  Then  Verify The Url Wait previous
  When  Verify The Logout Button
  Then  Verify The Logout Url
  Then   Close the Browser







