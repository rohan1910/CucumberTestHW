package WebTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Utils extends BasePage {
    public static void click_on_element(By by) {
        driver.findElement(by).click();
    }

    public static void enter_text(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void select_from_dropdown(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }
    public static void select_from_dropdown_by_int(By by,int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public static String get_text_from_Web_element(By by) {
        String text = driver.findElement(by).getText();
        return text;
    }

    public static int get_size(By by) {
        int size = driver.findElements(by).size();
        return size;
    }

    public static String get_atributte(By by, String tex) {
        String text = driver.findElement(by).getAttribute(tex);
        return text;
    }

    DateFormat dateFormat = new SimpleDateFormat("MMddHHmmss");
    Date date = new Date();
    String date2 = dateFormat.format(date);
    String a = date2;


    public static void clear_element(By by) {
        driver.findElement(by).clear();
    }

    public static List driver_findElements(By by) {
        List elements = driver.findElements(by);
        return elements;
    }

    public static void assert_equals(String expected_message, String actual_message, String message_text) {
        //Assert.assertEquals(expected_message, actual_message, message_text);
        Assert.assertEquals(message_text,expected_message,actual_message);

    }

    public static void explicit_wait(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void print(String text) {
        System.out.println(text);
    }

    public static void close_Browser() {
        driver.quit();

    }
}
