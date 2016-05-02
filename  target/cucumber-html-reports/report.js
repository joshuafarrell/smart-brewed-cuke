$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("KpiCampaignRecommendations.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Created by jfarrell at 4/28/16"
    }
  ],
  "line": 3,
  "name": "",
  "description": "In order to bring awareness about a food or entertainment service / product\nAs a campaign manager\nI want to get recommendations on the best way to inform an audience about my service / product",
  "id": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "150,000+ Campaign Budget",
  "description": "",
  "id": ";150,000+-campaign-budget",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "my budget is \"More than 150K\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "my target KPI is \"\u003ckpi\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "my vertical category is \"\u003cvertical\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I request campaign recommendations",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I receive a recommendation for \"Brand Builder\" program with options:",
  "rows": [
    {
      "cells": [
        "option"
      ],
      "line": 18
    },
    {
      "cells": [
        "Spotlight Video"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I receive a recommendation for \"Experts Among Us Recipe\" program",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I receive a recommendation for \"Pinterest Board\" program",
  "keyword": "And "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": ";150,000+-campaign-budget;",
  "rows": [
    {
      "cells": [
        "kpi",
        "vertical"
      ],
      "line": 24,
      "id": ";150,000+-campaign-budget;;1"
    },
    {
      "cells": [
        "Product Trial / Evaluation",
        "Food"
      ],
      "line": 25,
      "id": ";150,000+-campaign-budget;;2"
    },
    {
      "cells": [
        "Purchase",
        "Entertaining"
      ],
      "line": 26,
      "id": ";150,000+-campaign-budget;;3"
    },
    {
      "cells": [
        "Product Trial / Evaluation",
        "Entertaining"
      ],
      "line": 27,
      "id": ";150,000+-campaign-budget;;4"
    },
    {
      "cells": [
        "Purchase",
        "Food"
      ],
      "line": 28,
      "id": ";150,000+-campaign-budget;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I am a campaign manager",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I provide my contact information",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 25,
  "name": "150,000+ Campaign Budget",
  "description": "",
  "id": ";150,000+-campaign-budget;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "my budget is \"More than 150K\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "my target KPI is \"Product Trial / Evaluation\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "my vertical category is \"Food\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I request campaign recommendations",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I receive a recommendation for \"Brand Builder\" program with options:",
  "rows": [
    {
      "cells": [
        "option"
      ],
      "line": 18
    },
    {
      "cells": [
        "Spotlight Video"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I receive a recommendation for \"Experts Among Us Recipe\" program",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I receive a recommendation for \"Pinterest Board\" program",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I am a campaign manager",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I provide my contact information",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 26,
  "name": "150,000+ Campaign Budget",
  "description": "",
  "id": ";150,000+-campaign-budget;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "my budget is \"More than 150K\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "my target KPI is \"Purchase\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "my vertical category is \"Entertaining\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I request campaign recommendations",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I receive a recommendation for \"Brand Builder\" program with options:",
  "rows": [
    {
      "cells": [
        "option"
      ],
      "line": 18
    },
    {
      "cells": [
        "Spotlight Video"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I receive a recommendation for \"Experts Among Us Recipe\" program",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I receive a recommendation for \"Pinterest Board\" program",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I am a campaign manager",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I provide my contact information",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 27,
  "name": "150,000+ Campaign Budget",
  "description": "",
  "id": ";150,000+-campaign-budget;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "my budget is \"More than 150K\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "my target KPI is \"Product Trial / Evaluation\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "my vertical category is \"Entertaining\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I request campaign recommendations",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I receive a recommendation for \"Brand Builder\" program with options:",
  "rows": [
    {
      "cells": [
        "option"
      ],
      "line": 18
    },
    {
      "cells": [
        "Spotlight Video"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I receive a recommendation for \"Experts Among Us Recipe\" program",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I receive a recommendation for \"Pinterest Board\" program",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I am a campaign manager",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I provide my contact information",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 28,
  "name": "150,000+ Campaign Budget",
  "description": "",
  "id": ";150,000+-campaign-budget;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "my budget is \"More than 150K\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "my target KPI is \"Purchase\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "my vertical category is \"Food\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I request campaign recommendations",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I receive a recommendation for \"Brand Builder\" program with options:",
  "rows": [
    {
      "cells": [
        "option"
      ],
      "line": 18
    },
    {
      "cells": [
        "Spotlight Video"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I receive a recommendation for \"Experts Among Us Recipe\" program",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I receive a recommendation for \"Pinterest Board\" program",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});