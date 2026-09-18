package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownTest extends TestBase {

    @Test
    public void dropdownTest() {

        DropdownPage page =
                new DropdownPage(driver);

        page.open();

        Assert.assertEquals(
                page.getOptionsCount(),
                3
        );

        page.selectOption1();

        Assert.assertEquals(
                page.getSelectedOption(),
                "Option 1"
        );

        page.selectOption2();

        Assert.assertEquals(
                page.getSelectedOption(),
                "Option 2"
        );
    }
}