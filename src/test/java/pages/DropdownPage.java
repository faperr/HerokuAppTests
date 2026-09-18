package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    private WebDriver driver;

    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    public Select getDropdown() {
        return new Select(driver.findElement(dropdown));
    }

    public int getOptionsCount() {
        return getDropdown().getOptions().size();
    }

    public void selectOption1() {
        getDropdown().selectByVisibleText("Option 1");
    }

    public void selectOption2() {
        getDropdown().selectByVisibleText("Option 2");
    }

    public String getSelectedOption() {
        return getDropdown()
                .getFirstSelectedOption()
                .getText();
    }
}