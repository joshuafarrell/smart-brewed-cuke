Feature:
  In order to bring awareness about a food or entertainment service / product
  As a campaign manager
  I want to get recommendations on the best way to inform an audience about my service / product

  Background:
    Given I am a campaign manager
    And I provide my contact information
  Scenario Outline: 150,000+ Campaign Budget
    Given my budget is "More than 150K"
    And my target KPI is "<kpi>"
    And my vertical category is "<vertical>"
    When I request campaign recommendations
    Then I receive a recommendation for "Brand Builder" program with options:
      | option          |
      | Spotlight Video |
    And I receive a recommendation for "Experts Among Us Recipe" program
    And I receive a recommendation for "Pinterest Board" program

    Examples:
      | kpi                        | vertical     |
      | Product Trial / Evaluation | Food         |
      | Purchase                   | Entertaining |
      | Product Trial / Evaluation | Entertaining |
      | Purchase                   | Food         |