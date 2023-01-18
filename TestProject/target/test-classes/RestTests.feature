
@tag
Feature: Submitting and Retrieving user posts

  Scenario: GET - Retrieve posts - 200 response
    When I attempt to retrieve posts
    Then I should see a successful 200 response
  
  Scenario: GET - Retrieve posts - 200 response
    When I attempt to retrieve posts
    Then I should see a list of posts returned in the response
    
  Scenario: POST - Submit post - 201 response
    When I attempt to submit a post
    Then I should see a successful 201 response

  Scenario: POST - Submit post - Id of newly created post returned in the response
    When I attempt to submit a post
    Then I should see the id of the new post in the response
  