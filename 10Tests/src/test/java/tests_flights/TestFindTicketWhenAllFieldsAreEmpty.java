package tests_flights;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
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
        pageFlights.clearInputPassenger();
        pageFlights.clickToShowFlights();
        String expectedError = "Departure airport is missing\n" +
                "Destination airport is missing\n" +
                "Departure date is missing\n" +
                "Return date is missing.\n" +
                "Please select the number of passengers.";
        Assert.assertEquals(pageFlights.getError(), expectedError);
    }
    @AfterClass
    public static void closeDriver() {
       Driver.closeDriver();
    }
}
