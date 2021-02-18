#Ronald David Lara Hernandez
@scenario
  Feature: Test automation
    As a user, I want to automate the registration of a user on the uTest page
    @scenario1
    Scenario: Registration automation test successful
      Given than Ronald enters the uTest page for and
      When Fill out the following information in the forms
        |firstName   |lastName      |email           |birthMonth|birthDay|year|language|city   |zip   |password   |
        |Ronald David|Lara Hernandez|ronald@gmail.com|December  |4       |1985|Spanish |Pereira|660000|In98212370%|
      Then Verify that registration automation is successful with the Complete Setup message


