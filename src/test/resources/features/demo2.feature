Feature: Title of your feature
  I want to use this template for my feature file

  @chrome @demo2
  Scenario Outline: Validate i can select different colour cards
    Given I am a new user applying for a <colour> card
    When My details are <first name> <surname> <home phone number> <email> <postcode>
    Then I have applied for a card
    
	Examples: 
    | colour | first name | surname | home phone number | email 			     | postcode |
    | pink   | paul       | toouli  | 01201230123       | example@example.com    | sw6 2ne  |
    | blue   | bob        | geldof  | 01234567890       | example1@example.com   | sw6 2ne  |
    | black  | frank      | lampard | 01876543210       | example2@example.com   | sw6 2ne  |
    | pink   | firstname  | surname | 09898989898       | example3@example.com   | sw6 2ne  |

