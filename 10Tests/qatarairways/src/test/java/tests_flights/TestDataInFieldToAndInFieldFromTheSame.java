package tests_flights;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.PageFlights;

public class TestDataInFieldToAndInFieldFromTheSame {
    private PageFlights pageFlights = new PageFlights();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.qatarairways.com/en-us/homepage.html");
    }
    @Test
    public void dataInFieldToAndInFieldFromIsTheSame() {
        pageFlights.scrollToBookingTabViewContainer();
        pageFlights.clearInputFrom();
        pageFlights.setInputFrom("Madrid");
        pageFlights.clearInputTo();
        pageFlights.setInputTo("Madrid");
        String expectedError = "No city matching for your request";
        Assert.assertEquals(pageFlights.getPopupError(), expectedError);
    }
    @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
    }
}