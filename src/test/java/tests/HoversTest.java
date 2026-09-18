package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoversTest extends TestBase {

    @Test
    public void hoversTest() {

        HoversPage page =
                new HoversPage(driver);

        page.open();

        Assert.assertEquals(
                page.getProfilesCount(),
                3
        );

        for (int i = 0; i < 3; i++) {

            page.hoverProfile(i);

            Assert.assertEquals(
                    page.getProfileName(i),
                    "name: user" + (i + 1)
            );

            Assert.assertTrue(
                    page.isProfileLinkVisible(i)
            );

            Assert.assertTrue(
                    page.getProfileLink(i)
                            .contains("/users/" + (i + 1))
            );
        }
    }
}