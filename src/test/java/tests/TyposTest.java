package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;

public class TyposTest extends TestBase {

    @Test
    public void typosTest() {

        TyposPage page =
                new TyposPage(driver);

        page.open();

        Assert.assertEquals(
                page.getFirstParagraph(),
                "This example demonstrates a typo being introduced. It does it randomly on each page load."
        );

        String secondParagraph =
                page.getSecondParagraph();

        boolean textIsValid =
                secondParagraph.equals(
                        "Sometimes you'll see a typo, other times you won't."
                )
                        ||
                        secondParagraph.equals(
                                "Sometimes you'll see a typo, other times you won,t."
                        );

        Assert.assertTrue(textIsValid);
    }
}