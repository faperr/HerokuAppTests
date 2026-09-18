package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {

    private WebDriver driver;
    private Actions actions;

    private By figures = By.className("figure");
    private By captions = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/hovers");
    }

    public int getProfilesCount() {
        return driver.findElements(figures).size();
    }

    public void hoverProfile(int index) {
        List<WebElement> profiles = driver.findElements(figures);

        actions.moveToElement(
                profiles.get(index)
        ).perform();
    }

    public String getProfileName(int index) {
        List<WebElement> profileCaptions =
                driver.findElements(captions);

        return profileCaptions
                .get(index)
                .findElement(By.tagName("h5"))
                .getText();
    }

    public boolean isProfileLinkVisible(int index) {
        List<WebElement> profileCaptions =
                driver.findElements(captions);

        return profileCaptions
                .get(index)
                .findElement(By.tagName("a"))
                .isDisplayed();
    }

    public String getProfileLink(int index) {
        List<WebElement> profileCaptions =
                driver.findElements(captions);

        return profileCaptions
                .get(index)
                .findElement(By.tagName("a"))
                .getAttribute("href");
    }
}