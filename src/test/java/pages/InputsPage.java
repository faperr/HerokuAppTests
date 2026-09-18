package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputsPage {

    private WebDriver driver;

    private By input = By.tagName("input");

    public InputsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/inputs");
    }

    public void enterValue(String value) {
        WebElement field = driver.findElement(input);

        field.clear();
        field.sendKeys(value);
    }

    public String getValue() {
        return driver.findElement(input)
                .getAttribute("value");
    }

    public void pressArrowUp() {
        driver.findElement(input)
                .sendKeys(Keys.ARROW_UP);
    }

    public void pressArrowDown() {
        driver.findElement(input)
                .sendKeys(Keys.ARROW_DOWN);
    }
}