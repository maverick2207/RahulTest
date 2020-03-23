$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Selenium-Java/automationpractice/src/main/java/com/automationpractice/features/Test.feature");
formatter.feature({
  "line": 1,
  "name": "validation of automation practice page",
  "description": "",
  "id": "validation-of-automation-practice-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10292200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "launch application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify page title is \"My Store\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.launch_application()"
});
formatter.result({
  "duration": 15036762200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Store",
      "offset": 22
    }
  ],
  "location": "stepdefination.verify_page_title_is(String)"
});
formatter.result({
  "duration": 58940900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "01_Order T-Shirt and Verify in Order History",
  "description": "",
  "id": "validation-of-automation-practice-page;01-order-t-shirt-and-verify-in-order-history",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "login to the application using valid \"userName\" and \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "verify page title is \"My account - My Store\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "add tshirt to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "complete the order process",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify in Order History",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "userName",
      "offset": 38
    },
    {
      "val": "password",
      "offset": 53
    }
  ],
  "location": "stepdefination.login_to_the_application_using_valid_and(String,String)"
});
formatter.result({
  "duration": 6183809500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My account - My Store",
      "offset": 22
    }
  ],
  "location": "stepdefination.verify_page_title_is(String)"
});
formatter.result({
  "duration": 27793700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.add_tshirt_to_the_cart()"
});
formatter.result({
  "duration": 6078341200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.complete_the_order_process()"
});
formatter.result({
  "duration": 20467811400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.verify_in_Order_History()"
});
formatter.result({
  "duration": 3848683400,
  "status": "passed"
});
formatter.after({
  "duration": 182498500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "02_Update Personal Information Last Name in My Account",
  "description": "",
  "id": "validation-of-automation-practice-page;02-update-personal-information-last-name-in-my-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "login to the application using valid \"userName\" and \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "verify page title is \"My account - My Store\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "navigate to my personal information page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "verify page title is \"Identity - My Store\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "update \"\u003clast name\u003e\" in the details section",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "enter old \"password\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "verify \"\u003clast name\u003e\" got update successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "validation-of-automation-practice-page;02-update-personal-information-last-name-in-my-account;",
  "rows": [
    {
      "cells": [
        "last name"
      ],
      "line": 27,
      "id": "validation-of-automation-practice-page;02-update-personal-information-last-name-in-my-account;;1"
    },
    {
      "cells": [
        "testlastA"
      ],
      "line": 28,
      "id": "validation-of-automation-practice-page;02-update-personal-information-last-name-in-my-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 66800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "launch application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify page title is \"My Store\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.launch_application()"
});
formatter.result({
  "duration": 13882871800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Store",
      "offset": 22
    }
  ],
  "location": "stepdefination.verify_page_title_is(String)"
});
formatter.result({
  "duration": 16954200,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "02_Update Personal Information Last Name in My Account",
  "description": "",
  "id": "validation-of-automation-practice-page;02-update-personal-information-last-name-in-my-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "login to the application using valid \"userName\" and \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "verify page title is \"My account - My Store\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "navigate to my personal information page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "verify page title is \"Identity - My Store\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "update \"testlastA\" in the details section",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "enter old \"password\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "verify \"testlastA\" got update successfully",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "userName",
      "offset": 38
    },
    {
      "val": "password",
      "offset": 53
    }
  ],
  "location": "stepdefination.login_to_the_application_using_valid_and(String,String)"
});
formatter.result({
  "duration": 6040412200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My account - My Store",
      "offset": 22
    }
  ],
  "location": "stepdefination.verify_page_title_is(String)"
});
formatter.result({
  "duration": 18309100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.navigate_to_my_personal_information_page()"
});
formatter.result({
  "duration": 2690997300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Identity - My Store",
      "offset": 22
    }
  ],
  "location": "stepdefination.verify_page_title_is(String)"
});
formatter.result({
  "duration": 18915100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testlastA",
      "offset": 8
    }
  ],
  "location": "stepdefination.update_first_name_in_the_details_section(String)"
});
formatter.result({
  "duration": 1698312500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 11
    }
  ],
  "location": "stepdefination.enter_old_password(String)"
});
formatter.result({
  "duration": 559038000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.Click_on_save_button()"
});
formatter.result({
  "duration": 1778283700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testlastA",
      "offset": 8
    }
  ],
  "location": "stepdefination.verify_got_update_successfully(String)"
});
formatter.result({
  "duration": 160551500,
  "status": "passed"
});
formatter.after({
  "duration": 260683400,
  "status": "passed"
});
});