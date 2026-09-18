package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputsTest extends TestBase {

    @Test
    public void numberInputTest() {

        InputsPage page =
                new InputsPage(driver);

        page.open();

        page.enterValue("10");

        Assert.assertEquals(
                page.getValue(),
                "10"
        );

        page.pressArrowUp();

        Assert.assertEquals(
                page.getValue(),
                "11"
        );

        page.pressArrowDown();

        Assert.assertEquals(
                page.getValue(),
                "10"
        );
    }

    @Test
    public void textInputTest() {

        InputsPage page =
                new InputsPage(driver);

        page.open();

        page.enterValue("abc");

        Assert.assertEquals(
                page.getValue(),
                ""
        );
    }
}