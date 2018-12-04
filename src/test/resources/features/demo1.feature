Feature: Card Colour Selection
	As a product owner
	I want new applicants to be able to select the colour of their card
	So that there is more personalisation for the customer

  @chrome @demo1
  Scenario Outline: Validate i can select different colour cards
    Given I am a new user applying for a <colour> card
    When My details are <home phone number> <email>
    Then I have applied for a card
    
	Examples: 
    | colour | home phone number | email				          | 
    | black  | 01201230123       | example@example.com    | 






       