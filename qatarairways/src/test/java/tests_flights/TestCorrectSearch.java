package tests_flights;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.PageFlights;

public class TestCorrectSearch {
    private PageFlights pageFlights = new PageFlights();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.qatarairways.com/en-us/homepage.html");
    }
    @Test
    public void correctSearch() {
        pageFlights.scrollToBookingTabViewContainer();
        pageFlights.clearInputFrom();
        pageFlights.setInputFrom("Warsaw (WAW)");
        pageFlights.clearInputTo();
        pageFlights.setInputTo("Beijing (PEK)");
        pageFlights.clearInputDepartDate();
        pageFlights.setInputDepartDate("28 Dec 2018");
        pageFlights.clearInputReturnDate();
        pageFlights.setInputReturnDate("31 Dec 2018");
        pageFlights.setInputPassenger("1 Passenger");
        pageFlights.clickToShowflights();
    }
    @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
    }
}
