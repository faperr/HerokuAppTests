package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesPage {

    private WebDriver driver;

    private By checkboxes =
            By.cssSelector("[type=checkbox]");

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(
                "https://the-internet.herokuapp.com/checkboxes"
        );
    }

    public WebElement getFirstCheckbox() {
        return driver.findElements(checkboxes).get(0);
    }

    public WebElement getSecondCheckbox() {
        return driver.findElements(checkboxes).get(1);
    }

    public void clickFirstCheckbox() {
        getFirstCheckbox().click();
    }

    public void clickSecondCheckbox() {
        getSecondCheckbox().click();
    }
}