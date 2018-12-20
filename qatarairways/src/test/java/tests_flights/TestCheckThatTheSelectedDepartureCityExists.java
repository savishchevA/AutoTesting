package tests_flights;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.PageFlights;

public class TestCheckThatTheSelectedDepartureCityExists {
    private PageFlights pageFlights = new PageFlights();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.qatarairways.com/en-us/homepage.html");
    }
    @Test
    public void checkThatTheSelectedDepartureCityExists() {
        pageFlights.scrollToBookingTabViewContainer();
        pageFlights.clearInputFrom();
        pageFlights.setInputFrom("zero");
    }
    @AfterClass
    public static void closeDriver() {
       Driver.closeDriver();
    }
}
