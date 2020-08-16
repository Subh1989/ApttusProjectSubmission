$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Successful Login",
  "description": "",
  "id": "successful-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Perform login functionality",
  "description": "",
  "id": "successful-login;perform-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user has invoked the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user opens the required url",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user clicks on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e and click login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should log in successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user selects the category as TShirts",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user validates the required product is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the product",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on ADD to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user validates that the product is successfully added to the cart",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "successful-login;perform-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "successful-login;perform-login-functionality;;1"
    },
    {
      "cells": [
        "jetblue@grr.la",
        "jetblue"
      ],
      "line": 17,
      "id": "successful-login;perform-login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Perform login functionality",
  "description": "",
  "id": "successful-login;perform-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user has invoked the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user opens the required url",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user clicks on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters jetblue@grr.la and jetblue and click login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should log in successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user selects the category as TShirts",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user validates the required product is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the product",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on ADD to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user validates that the product is successfully added to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_has_invoked_the_browser()"
});
formatter.result({
  "duration": 6564979200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_opens_the_required_url()"
});
formatter.result({
  "duration": 5804451000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_clicks_on_sign_in()"
});
formatter.result({
  "duration": 1571144600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jetblue@grr.la",
      "offset": 12
    },
    {
      "val": "jetblue",
      "offset": 31
    }
  ],
  "location": "StepDefination.user_enters_and_and_click_login_button(String,String)"
});
formatter.result({
  "duration": 3181374300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_should_log_in_successfully()"
});
formatter.result({
  "duration": 68781700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_selects_the_category_as_tshirts()"
});
formatter.result({
  "duration": 2676528900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_validates_the_required_product_is_displayed()"
});
formatter.result({
  "duration": 74230400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_clicks_on_the_product()"
});
formatter.result({
  "duration": 2610077200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_clicks_on_add_to_cart()"
});
formatter.result({
  "duration": 64759800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_validates_that_the_product_is_successfully_added_to_the_cart()"
});
formatter.result({
  "duration": 1813424700,
  "status": "passed"
});
formatter.after({
  "duration": 645099300,
  "status": "passed"
});
});