package WebTest;

import org.openqa.selenium.By;

public class Homepage extends Utils {
    By _registerLink = By.linkText("Register");
    By _logInLink = By.linkText("Log in");
    By _homepageAppleProduct = By.xpath("//div[@class=\"product-item\"]/div[@class=\"picture\"]/a[@href=\"/apple-macbook-pro-13-inch\"]");
    By _computerLinkHomepage = By.linkText("Computers");

    public void click_register_button(){
        click_on_element(_registerLink);
    }
    public void click_log_in_button(){
        click_on_element(_logInLink);
    }

    public void select_product_from_homepage(){
        click_on_element(_homepageAppleProduct);
    }

    public void select_computer_link_from_homepage(){
        click_on_element(_computerLinkHomepage);
    }

}
