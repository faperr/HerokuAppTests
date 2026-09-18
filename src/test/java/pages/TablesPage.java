package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TablesPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public TablesPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/tables");

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("table1")
                )
        );
    }

    public String getCellText(int row, int column) {

        By cell = By.xpath(
                "//table[@id='table1']//tbody//tr[" +
                        row +
                        "]//td[" +
                        column +
                        "]"
        );

        return driver.findElement(cell).getText();
    }
}