Feature: Card Web Applications
	As a product owner
	I want the web application to work on all browsers
	So that there is less customer frustration

  @chrome @demo3
  Scenario Outline: Validate i can select different colour cards
    Given I am a new user applying for a <colour> card
    When My details are <home phone number> <email>
    Then I have applied for a card
    
	Examples: 
    | colour | home phone number | email				          |
    | black  | 01201230123       | example@example.com    | 
    
  @firefox @demo3
  Scenario Outline: Validate i can select different colour cards
    Given I am a new user applying for a <colour> card
    When My details are <home phone number> <email>
    Then I have applied for a card
    
	Examples: 
    | colour | home phone number | email				    		  | 
    | black  | 01201230123       | example@example.com    | 
   
  @edge @demo3
  Scenario Outline: Validate i can select different colour cards
    Given I am a new user applying for a <colour> card
    When My details are <home phone number> <email>
    Then I have applied for a card
    
	Examples: 
    | colour | home phone number | email				          | 
    | black  | 01201230123       | example@example.com    | 