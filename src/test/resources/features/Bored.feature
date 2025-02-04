Feature: Bored API CRUD operations

  Scenario: Read operation on Bored API
    When I send a GET request to the Bored API
    And the response status should be 200