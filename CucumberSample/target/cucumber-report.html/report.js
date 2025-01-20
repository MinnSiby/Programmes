$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Demoblaze.feature");
formatter.feature({
  "name": "Demoblaze Website checking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Adding to cart after search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on demoblaze website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.DemoblazeSteps.User_is_on_demoblaze_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Mointors category",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.DemoblazeSteps.user_clicks_on_Mointors_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the product \"Apple monitor 24\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.DemoblazeSteps.user_clicks_on_the_product(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user cliks on Add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.DemoblazeSteps.user_cliks_on_Addtocart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product should be present in the cart option",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.DemoblazeSteps.product_should_be_present_in_the_cart_option()"
});
formatter.result({
  "status": "passed"
});
});