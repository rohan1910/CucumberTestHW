package WebTest;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _gender = By.id("gender-male");
    By _firstName = By.id("FirstName");
    By _lastName = By.id("LastName");
    By _email = By.id("Email");
    By _companyName = By.name("Company");
    By _password = By.id("Password");
    By _confirmPassword = By.id("ConfirmPassword");
    By _registerButton = By.id("register-button");
    By _birthDay = By.name("DateOfBirthDay");
    By _birthMonth = By.name("DateOfBirthMonth");
    By _birthYear = By.name("DateOfBirthYear");


    public void user_fills_in_Registration_page(){
        click_on_element(_gender);
        enter_text(_firstName,loadProp.getProperty("FirstName"));
        enter_text(_lastName, loadProp.getProperty("LastName"));
        select_from_dropdown(_birthDay,("19"));
        select_from_dropdown(_birthMonth,("October"));
        select_from_dropdown(_birthYear,("1995"));
        enter_text(_email,"rohanp"+date2+"@gmail.com");
        enter_text(_companyName,loadProp.getProperty("CompanyName"));
        enter_text(_password,loadProp.getProperty("Password"));
        enter_text(_confirmPassword, loadProp.getProperty("ConfirmPassword"));
        click_on_element(_registerButton);


    }
}
