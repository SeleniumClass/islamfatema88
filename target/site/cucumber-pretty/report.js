$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free GCR Shop login feature",
  "description": "",
  "id": "free-gcr-shop-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3189109988,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Free GCR Shop login feature",
  "description": "",
  "id": "free-gcr-shop-login-feature;free-gcr-shop-login-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is GCR Shop",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter \"sarowerny@gmail.com\" into username text fields on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enter \"student\" into username password fields on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSD.userIsAlreadyOnLoginPage()"
});
formatter.result({
  "duration": 137212926,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.titleOfLoginPageIsGCRShop()"
});
formatter.result({
  "duration": 5678394,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.userClickOnLoginButton()"
});
formatter.result({
  "duration": 564845214,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sarowerny@gmail.com",
      "offset": 12
    }
  ],
  "location": "LoginSD.userEnterUsername(String)"
});
formatter.result({
  "duration": 41266517,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "student",
      "offset": 12
    }
  ],
  "location": "LoginSD.userEnterPassword(String)"
});
formatter.result({
  "duration": 22138252,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.userClickOnSignInButton()"
});
formatter.result({
  "duration": 511259073,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.userIsOnHomePage()"
});
formatter.result({
  "duration": 3063386,
  "status": "passed"
});
formatter.after({
  "duration": 165761086,
  "status": "passed"
});
formatter.uri("product.feature");
formatter.feature({
  "line": 1,
  "name": "Free GCR product feature",
  "description": "",
  "id": "free-gcr-product-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2969562891,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Free GCR product items",
  "description": "",
  "id": "free-gcr-product-feature;free-gcr-product-items",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on new products",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user able to see all products",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSD.userIsAlreadyOnLoginPage()"
});
formatter.result({
  "duration": 84999,
  "status": "passed"
});
formatter.match({
  "location": "ProductSD.userClickOnNewProducts()"
});
formatter.result({
  "duration": 445076511,
  "status": "passed"
});
formatter.match({
  "location": "ProductSD.allProduct()"
});
formatter.result({
  "duration": 62668667,
  "status": "passed"
});
formatter.after({
  "duration": 157298216,
  "status": "passed"
});
});