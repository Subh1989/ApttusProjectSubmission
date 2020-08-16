Feature: Product details validation

Scenario Outline: Login to the application and perform product details validation after adding to cart
Given user has invoked the browser
And user opens the required url
When user clicks on sign in
And user enters <username> and <password> and click login button
Then user should log in successfully
And user selects the category as TShirts
And user validates the required product is displayed
And user clicks on the product
And user clicks on ADD to Cart
And user validates that the product is successfully added to the cart

Examples:
|username				|password	|
|jetblue@grr.la			|jetblue	|