Feature: Card Web Applications 3


  @chrome @demo3
  Scenario Outline: Validate i can select different colour cards
    Given I am a new user applying for a <colour> card
    When My details are <first name> <surname> <home phone number> <email> <postcode>
    Then I have applied for a card
    
	Examples: 
    | colour | first name | surname | home phone number | email				           | postcode |
    | black  | paul       | toouli  | 01201230123       | example@example.com    | sw6 2ne  |
    
  @firefox @demo3
  Scenario Outline: Validate i can select different colour cards
    Given I am a new user applying for a <colour> card
    When My details are <first name> <surname> <home phone number> <email> <postcode>
    Then I have applied for a card
    
	Examples: 
    | colour | first name | surname | home phone number | email				    		   | postcode |
    | black  | paul       | toouli  | 01201230123       | example@example.com    | sw6 2ne  |
   
  @edge @demo3
  Scenario Outline: Validate i can select different colour cards
    Given I am a new user applying for a <colour> card
    When My details are <first name> <surname> <home phone number> <email> <postcode>
    Then I have applied for a card
    
	Examples: 
    | colour | first name | surname | home phone number | email				           | postcode |
    | black  | paul       | toouli  | 01201230123       | example@example.com    | sw6 2ne  |