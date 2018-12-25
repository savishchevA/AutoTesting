package tests_ManageBooking;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.PageManageBooking;

public class TestInAdditionToTheLastNameYouNeedToEnterTheBookingCode {
    private PageManageBooking pageManageBooking = new PageManageBooking();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.qatarairways.com/en-us/homepage.html");
    }
    @Test
    public void inAdditionToTheLastNameYouNeedToEnterTheBookingCode() {
        pageManageBooking.clickToManageBooking();
<<<<<<< HEAD
        pageManageBooking.scrollToManageBookingContainer();
=======
        pageManageBooking.scrollToManageBooking();
>>>>>>> 9c0075ffc283d32a4efb85a39e1898250102fc21
        pageManageBooking.clearInputName();
        pageManageBooking.setInputName("Savischev");
        pageManageBooking.clickToRetrieveBooking();
        String expectedError = "Your booking reference number should not be empty.";
        Assert.assertEquals(pageManageBooking.getError(), expectedError);
    }
    @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
}
}
