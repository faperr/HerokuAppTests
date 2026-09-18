package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NotificationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By clickHere = By.linkText("Click here");
    private By message = By.id("flash");

    public NotificationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );
    }

    public void open() {
        driver.get(
                "https://the-internet.herokuapp.com/notification_message_rendered"
        );
    }

    public void clickButton() {
        driver.findElement(clickHere).click();
    }

    public String getMessage() {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(message)
        );

        return driver.findElement(message)
                .getText()
                .replace("×", "")
                .trim();
    }
}