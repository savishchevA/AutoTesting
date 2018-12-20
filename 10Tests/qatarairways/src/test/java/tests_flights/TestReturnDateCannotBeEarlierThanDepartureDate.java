package tests_flights;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.PageFlights;

public class TestReturnDateCannotBeEarlierThanDepartureDate {
    private PageFlights pageFlights = new PageFlights();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.qatarairways.com/en-us/homepage.html");
    }
    @Test
    public void returnDateCannotBeEarlierThanDepartureDate() {
        pageFlights.scrollToBookingTabViewContainer();
        pageFlights.clearInputFrom();
        pageFlights.setInputFrom("Warsaw (WAW)");
        pageFlights.clearInputTo();
        pageFlights.setInputTo("Beijing (PEK)");
        pageFlights.clearInputReturnDate();
        pageFlights.setInputReturnDate("28 Dec 2018");
        pageFlights.clearInputDepartDate();
        pageFlights.setInputDepartDate("30 Dec 2018");
        pageFlights.clearInputPassenger();
        pageFlights.setInputPassenger("1 Passenger");
        pageFlights.clickToShowFlights();
        String expectedError = "Departure date should not be greater than the return date";
        Assert.assertEquals(pageFlights.getError(), expectedError);
    }
   @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
    }
}
