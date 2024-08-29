Feature: Positive Testing Coocking Korean food Web-Site

 @azizbek
  Scenario: I'm searching korean dish on google
    Given I'm opening first web site that has Korean dish
    When I click first web site it is showing Jjanmyeon
    And I get Web Title
    And I get korean food's name by using getText
    Then I will end the test and close Web Browser
