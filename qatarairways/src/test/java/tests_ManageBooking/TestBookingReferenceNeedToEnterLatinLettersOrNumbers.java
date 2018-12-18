package tests_ManageBooking;

import driver.Driver;
import org.junit.AfterClass;
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
    public void inAdditionToTheLastNameYouNeedToEnterTheBookingCode() {
        pageManageBooking.clickToManageBooking();
        pageManageBooking.scrollToBookingTabViewContainer();
        pageManageBooking.clearInputName();
        pageManageBooking.setInputName("Savischev");
        pageManageBooking.clearInputBookingReference();
        pageManageBooking.setInputBookingReference("бронирование");
        pageManageBooking.clickToRetrieveBooking();
    }
    @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
    }
}
