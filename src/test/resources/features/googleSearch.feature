Feature: Google search functionality
  As a user, when I am on the google
  search page, I should able to search whatever
  I want, and see relevant information

  Scenario: User search bugs title verification
    Given User is on Google home page
    When User searches for bugs
    Then User should see bugs in the title