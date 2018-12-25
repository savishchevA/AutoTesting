package tests_ManageBooking;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.PageManageBooking;

public class TestBookingReferenceNeedToEnterLatinLettersOrNumbers {
    private PageManageBooking pageManageBooking = new PageManageBooking();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.qatarairways.com/en-us/homepage.html");
    }
    @Test
    public void bookingReferenceNeedToEnterLatinLettersOrNumbers() {
        pageManageBooking.scrollToManageBooking();
        pageManageBooking.clickToManageBooking();
        pageManageBooking.clearInputName();
        pageManageBooking.setInputName("Savischev");
        pageManageBooking.clearInputBookingReference();
        pageManageBooking.setInputBookingReference("бронирование");
        pageManageBooking.clickToRetrieveBooking();
        String expectedError = "Booking reference should be 6(alphanumeric), 10(numeric), 13(numeric)";
        Assert.assertEquals(pageManageBooking.getError(), expectedError);
    }
    @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
    }
}
