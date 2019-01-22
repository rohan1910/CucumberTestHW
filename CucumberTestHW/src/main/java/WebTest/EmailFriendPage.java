package WebTest;

import org.openqa.selenium.By;

public class EmailFriendPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _friendsEmail = By.id("FriendEmail");
    By _yourEmail = By.id("YourEmailAddress");
    By _personalMessage = By.id("PersonalMessage");
    By _sendEmailButton = By.name("send-email");


    public void user_fills_in_email_friend_page() {

        enter_text(_friendsEmail, "jay" + a + "@gmail.com");
        enter_text(_personalMessage, loadProp.getProperty("PersonalMessage"));
        click_on_element(_sendEmailButton);
    }
    public void unregistered_user_enters_email(){
        enter_text(_yourEmail,"Raj19"+date2+"@gmail.com");
    }
}
