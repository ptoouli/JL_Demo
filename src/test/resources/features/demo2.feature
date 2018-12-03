Feature: Title of your feature
  I want to use this template for my feature file

  @chrome @demo2
  Scenario Outline: Validate i can select different colour cards
    Given I am a new user applying for a <colour> card
    When My details are <home phone number> <email>
    Then I have applied for a card
    
	Examples: 
    | colour | home phone number | email 			    				| 
    | pink   | 01201230123       | example@example.com    | 
    | blue   | 01234567890       | example1@example.com   | 
    | black  | 01876543210       | example2@example.com   | 
    | pink   | 09898989898       | example3@example.com   | 

