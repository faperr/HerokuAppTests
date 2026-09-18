package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationPage;

public class NotificationTest extends TestBase {

    @Test
    public void notificationMessageTest() {

        NotificationPage page =
                new NotificationPage(driver);

        page.open();

        page.clickButton();

        String message =
                page.getMessage();

        boolean correctMessage =
                message.equals("Action successful")
                        ||
                        message.equals(
                                "Action unsuccesful, please try again"
                        )
                        ||
                        message.equals(
                                "Action unsuccessful, please try again"
                        );

        Assert.assertTrue(
                correctMessage,
                "Неожиданный текст: " + message
        );
    }
}