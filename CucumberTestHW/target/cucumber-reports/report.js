$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "User registration",
  "description": "",
  "id": "user-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 23233116840,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to register successfully",
  "description": "",
  "id": "user-registration;user-should-be-able-to-register-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@registration"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on homepage and clicks on the register link",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User fills out registration form and clicks register",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be registered successfully and be able to see successful message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.user_is_on_homepage_and_clicks_on_the_register_link()"
});
formatter.result({
  "duration": 2169371655,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.user_fills_out_registration_form_and_clicks_register()"
});
formatter.result({
  "duration": 4069960296,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.user_should_be_registered_successfully_and_be_able_to_see_successful_message()"
});
formatter.result({
  "duration": 2121481482,
  "status": "passed"
});
formatter.after({
  "duration": 4962905679,
  "status": "passed"
});
});