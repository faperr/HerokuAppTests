package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage {

    private WebDriver driver;

    private By paragraphs = By.tagName("p");

    public TyposPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/typos");
    }

    public String getFirstParagraph() {
        return driver.findElements(paragraphs)
                .get(0)
                .getText();
    }

    public String getSecondParagraph() {
        return driver.findElements(paragraphs)
                .get(1)
                .getText();
    }
}