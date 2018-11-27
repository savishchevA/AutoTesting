import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tests {

    @Test
    public void checkManageBooking() {

        System.setProperty("webdriver.chrome.driver", "./src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.qatarairways.com/en-us/homepage.html");
        driver.findElement(By.id("tab2")).click();
        driver.findElement(By.id("T7-name")).sendKeys("Savischev");
        driver.findElement(By.id("T7-retrieve")).click();

        String expectedError = "Your booking reference number should not be empty.";
        WebElement textError = driver.findElement(By.id("checkinErrorBlock"));
        Assert.assertEquals(textError.getText(), expectedError);
        driver.quit();
    }

}
