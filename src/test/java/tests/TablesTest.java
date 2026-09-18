package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TablesPage;

public class TablesTest extends TestBase {

    @Test
    public void tableDataTest() {

        TablesPage page =
                new TablesPage(driver);

        page.open();

        Assert.assertEquals(
                page.getCellText(1, 1),
                "Smith"
        );

        Assert.assertEquals(
                page.getCellText(1, 2),
                "John"
        );

        Assert.assertEquals(
                page.getCellText(1, 3),
                "jsmith@gmail.com"
        );

        Assert.assertEquals(
                page.getCellText(1, 4),
                "$50.00"
        );

        Assert.assertEquals(
                page.getCellText(2, 1),
                "Bach"
        );
    }
}