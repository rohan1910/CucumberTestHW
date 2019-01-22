package WebTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class MyStepdefs extends Utils {
   private Homepage homepage = new Homepage();
    private RegistrationPage registrationPage = new RegistrationPage();
    private LoginPage loginPage = new LoginPage();
    private NotebookApplePage notebookApplePage = new NotebookApplePage();
    private EmailFriendPage emailFriendPage = new EmailFriendPage();
    private ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    private CheckoutPage checkoutPage = new CheckoutPage();
    SoftAssert softAssert = new SoftAssert();
    int count;


    @Given("^User is on homepage and clicks on the register link$")
    public void user_is_on_homepage_and_clicks_on_the_register_link(){
        homepage.click_register_button();
    }

    @When("^User fills out registration form and clicks register$")
    public void user_fills_out_registration_form_and_clicks_register(){
        registrationPage.user_fills_in_Registration_page();
    }

    @Then("^User should be registered successfully and be able to see successful message$")
    public void user_should_be_registered_successfully_and_be_able_to_see_successful_message(){
        String expected_message = "Your registration completed";
        String actual_message = get_text_from_Web_element(By.xpath("// div[@class=\"page-body\"] / div[@class=\"result\"]"));
        assert_equals(expected_message,actual_message,"Test case failed");
        click_on_element(By.linkText("Log out"));
    }



    @Given("^User has registered successfully$")
    public void user_has_registered_successfully(){
        user_is_on_homepage_and_clicks_on_the_register_link();
        user_fills_out_registration_form_and_clicks_register();
        user_should_be_registered_successfully_and_be_able_to_see_successful_message();
    }

    @When("^User clicks on the log in button and enters log in details$")
    public void user_clicks_on_the_log_in_button_and_enters_log_in_details(){
        homepage.click_log_in_button();
        loginPage.user_enters_login_details();
    }

    @When("^Selects product from homepage and clicks on email a friend option$")
    public void selects_product_from_homepage_and_clicks_on_email_a_friend_option() {
        homepage.select_product_from_homepage();
        notebookApplePage.user_clicks_on_email_friend();
    }

    @When("^User fills out email a friend page$")
    public void user_fills_out_email_a_friend_page() {
        emailFriendPage.user_fills_in_email_friend_page();
    }

    @Then("^User should be able to send email to friend successfully$")
    public void user_should_be_able_to_send_email_to_friend_successfully() {
        String expected_message = "Your message has been sent.";
        String actual_message = get_text_from_Web_element(By.xpath("//div[@class=\"result\"]"));
        assert_equals(expected_message,actual_message,"Test case failed");
    }



    @Given("^User is on homepage and has not registered details$")
    public void user_is_on_homepage_and_has_not_registered_details(){

    }

    @When("^User selects product from homepage and clicks on email friend option$")
    public void user_selects_product_from_homepage_and_clicks_on_email_friend_option(){
        homepage.select_product_from_homepage();
        notebookApplePage.user_clicks_on_email_friend();

    }
    @And("^Fills out email friend details$")
    public void fillsOutEmailFriendDetails(){
        emailFriendPage.unregistered_user_enters_email();
        emailFriendPage.user_fills_in_email_friend_page();
    }

    @Then("^User should not be able to send email to friend successfully$")
    public void user_should_not_be_able_to_send_email_to_friend_successfully(){
        String expected_message = "Only registered customers can use email a friend feature";
        String actual_message = get_text_from_Web_element(By.xpath("//form[@method=\"post\"]/div[@class=\"message-error validation-summary-errors\"]/ul"));
        assert_equals(expected_message,actual_message,"Test case failed");
    }



    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^User selects product and adds product to cart$")
    public void userSelectsProductAndAddsProductToCart() {
        homepage.select_product_from_homepage();
        notebookApplePage.user_clicks_add_to_cart();
    }

    @And("^User clicks on the shopping cart link$")
    public void userClicksOnTheShoppingCartLink() {
        //method for clicking on shopping cart link already
        //implmented in above method

    }
    @When("^User clicks on terms and service and checkout link$")
    public void userClicksOnTermsAndServiceAndCheckoutLink() {
        shoppingCartPage.user_clicks_on_terms_and_service_button();
    }


    @Then("^User will be able to proceed with checkout and see welcome message$")
    public void userWillBeAbleToProceedWithCheckoutAndSeeWelcomeMessage(){
        String expected_message = "Welcome, Please Sign In!";
        String actual_message = get_text_from_Web_element(By.xpath("//div[@class=\"page-title\"]"));
        assert_equals(expected_message,actual_message,"Test case failed");
    }




    @When("^User registers their details and clicks on the log in link$")
    public void userRegistersTheirDetailsAndClicksOnTheLogInLink() {
        user_has_registered_successfully();
        homepage.click_log_in_button();
    }

    @And("^User enters login details and succesffuly logs in$")
    public void userEntersLoginDetailsAndSuccesffulyLogsIn(){
        loginPage.user_enters_login_details();
    }

    @And("^selects product from homepage and adds product to cart$")
    public void selectsProductFromHomepageAndAddsProductToCart(){
        homepage.select_product_from_homepage();
        notebookApplePage.user_clicks_add_to_cart();
    }

    @And("^User clicks on the terms and service button and fills out checkout page$")
    public void userClicksOnTheTermsAndServiceButtonAndFillsOutCheckoutPage(){
        shoppingCartPage.user_clicks_on_terms_and_service_button();
        checkoutPage.user_fills_out_checkout_page();
    }

    @Then("^User should be able to purchase product successfully and see order successful message$")
    public void userShouldBeAbleToPurchaseProductSuccessfullyAndSeeOrderSuccessfulMessage(){
        String expected_message = "Your order has been successfully processed!";
        String actual_message = get_text_from_Web_element(By.xpath("//div[@class=\"section order-completed\"]/div[@class=\"title\"]/strong"));
        assert_equals(expected_message,actual_message,"Test case failed");
        softAssert.assertEquals(expected_message,actual_message,"Test case failed");
        softAssert.assertAll();
    }


    @When("^User inspects the add to cart links that are with the four products$")
    public void userInspectsTheAddToCartLinksThatAreWithTheFourProducts() {
        count = 0;
        List<WebElement> addtocartlist = driver_findElements(By.xpath("// div[@class=\"item-grid\"]  / div / div[@class=\"product-item\"] / div[2] / div[3] / div[2] / input[1]"));
        for (WebElement a:addtocartlist) {
            softAssert.assertEquals("Add to cart",a.getAttribute("value"));
            count++;
        }
        Assert.assertEquals(addtocartlist.size(),count,"Test case failed");
        print(addtocartlist.size()+"");
    }

    @Then("^User should be able to see four add to cart buttons$")
    public void userShouldBeAbleToSeeFourAddToCartButtons() {
        print(count+"");
        softAssert.assertAll();
    }
}
