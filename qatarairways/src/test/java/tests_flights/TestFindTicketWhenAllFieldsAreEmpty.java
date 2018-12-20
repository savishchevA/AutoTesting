package tests_flights;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.PageFlights;

public class TestFindTicketWhenAllFieldsAreEmpty {
    private PageFlights pageFlights = new PageFlights();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.qatarairways.com/en-us/homepage.html");
    }
    @Test
    public void findTicketWhenAllFieldsAreEmpty() {
        pageFlights.scrollToBookingTabViewContainer();
        pageFlights.clearInputFrom();
        pageFlights.clearInputTo();
        pageFlights.clearInputDepartDate();
        pageFlights.clearInputReturnDate();
        pageFlights.clickToShowflights();
    }
    @AfterClass
    public static void closeDriver() {
       Driver.closeDriver();
    }
}
