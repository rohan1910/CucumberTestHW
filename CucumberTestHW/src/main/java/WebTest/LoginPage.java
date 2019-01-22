package WebTest;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _email = By.id("Email");
    By _password = By.id("Password");
    By _loginButton = By.xpath("//input[@class=\"button-1 login-button\"]");

    public void user_enters_login_details(){

        enter_text(_email,"rohanp"+a+"@gmail.com");
        enter_text(_password,loadProp.getProperty("Password"));
        click_on_element(_loginButton);
    }
}
