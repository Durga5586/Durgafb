
Feature: Validate the Login feature

 		# Scenario: Validate the Login feature with Valid Username and Password
  	# Given User is on Login Page
   	# When User enters valid username "Sai74547@gmail.com"
    # And User enters valid password "Sai74547"
    # Then clicks on submit
    #
  @smoke
  Scenario Outline: Title of your scenario outline
    Given user is on Login Page
    When user enters valid username"<name>"
    And user enters valid password"<pass>"
    Then clicks on submit
    	Examples: 
      	|name|pass| 
      	|Sai74547@gmail.com|Sai74547| 
      	|Sai555@gmail.com|Durga555| 