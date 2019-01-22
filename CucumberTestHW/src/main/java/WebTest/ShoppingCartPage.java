package WebTest;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils {
    By _termsOfServiceButton = By.id("termsofservice");
    By _checkoutButton = By.id("checkout");

    public void user_clicks_on_terms_and_service_button(){
        click_on_element(_termsOfServiceButton);
        click_on_element(_checkoutButton);

    }

}
