package WebTest;

import org.openqa.selenium.By;

public class NotebookApplePage extends Utils {
    By _emailFriendLink = By.xpath("//div[@class=\"overview-buttons\"]/div[3]/input[@type=\"button\"]");
    By _addToCartButton = By.id("add-to-cart-button-4");
    By _shoppingCartLink = By.linkText("Shopping cart");

    public void user_clicks_on_email_friend(){
        click_on_element(_emailFriendLink);

    }
    public void user_clicks_add_to_cart(){
        click_on_element(_addToCartButton);
        click_on_element(_shoppingCartLink);

    }

}
