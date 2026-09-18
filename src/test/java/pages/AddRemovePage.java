package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemovePage {

    private WebDriver driver;

    private By addButton =
            By.xpath("//button[text()='Add Element']");

    private By deleteButtons =
            By.xpath("//button[text()='Delete']");

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(
                "https://the-internet.herokuapp.com/add_remove_elements/"
        );
    }

    public void addElement() {
        driver.findElement(addButton).click();
    }

    public void deleteElement() {
        driver.findElement(deleteButtons).click();
    }

    public int getDeleteButtonsCount() {
        List<WebElement> buttons =
                driver.findElements(deleteButtons);

        return buttons.size();
    }
}