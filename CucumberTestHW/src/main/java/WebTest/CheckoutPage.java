package WebTest;

import org.openqa.selenium.By;

public class CheckoutPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _selectCountry = By.xpath("//select[@id=\"BillingNewAddress_CountryId\"] / option[@value=\"233\"]");
    By _city = By.id("BillingNewAddress_City");
    By _billingAddress = By.id("BillingNewAddress_Address1");
    By _postCode = By.id("BillingNewAddress_ZipPostalCode");
    By _phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By _continueBillingSave = By.xpath("//input[@onclick=\"Billing.save()\"]");
    By _continueShipping = By.xpath("//div[@class=\"buttons\"]/input[@class=\"button-1 shipping-method-next-step-button\"]");
    By _payCardOption = By.id("paymentmethod_1");
    By _paymentMethod = By.xpath("//input[@onclick=\"PaymentMethod.save()\"]");
    By _cardholderName = By.id("CardholderName");
    By _CardNumber = By.id("CardNumber");
    By _expiryMonth = By.xpath("// select[@id=\"ExpireMonth\"] / option[@value=\"2\"]");
    By _expiryYear = By.xpath("// select [@id=\"ExpireYear\"] / option[@value=\"2021\"]");
    By _enterCVV = By.id("CardCode");
    By _continuePaymentInfo = By.xpath("//input[@onclick=\"PaymentInfo.save()\"]");
    By _confirmOrder = By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]");



    public void user_fills_out_checkout_page() {
        click_on_element(_selectCountry);
        enter_text(_city,loadProp.getProperty("City"));
        enter_text(_billingAddress,loadProp.getProperty("Address"));
        enter_text(_postCode,loadProp.getProperty("PostCode"));
        enter_text(_phoneNumber,loadProp.getProperty("PhoneNumber"));
        click_on_element(_continueBillingSave);
        click_on_element(_continueShipping);
        click_on_element(_payCardOption);
        click_on_element(_paymentMethod);
        enter_text(_cardholderName,loadProp.getProperty("CardName"));
        enter_text(_CardNumber,loadProp.getProperty("CardNumber"));
        click_on_element(_expiryMonth);
        click_on_element(_expiryYear);
        enter_text(_enterCVV,loadProp.getProperty("CVV"));
        click_on_element(_continuePaymentInfo);
        click_on_element(_confirmOrder);
    }
}
