package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class CheckboxesTest extends TestBase {

    @Test
    public void checkboxesTest() {

        CheckboxesPage page =
                new CheckboxesPage(driver);

        page.open();

        Assert.assertFalse(
                page.getFirstCheckbox().isSelected()
        );

        page.clickFirstCheckbox();

        Assert.assertTrue(
                page.getFirstCheckbox().isSelected()
        );

        Assert.assertTrue(
                page.getSecondCheckbox().isSelected()
        );

        page.clickSecondCheckbox();

        Assert.assertFalse(
                page.getSecondCheckbox().isSelected()
        );
    }
}