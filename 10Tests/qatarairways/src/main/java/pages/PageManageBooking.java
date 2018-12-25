package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageManageBooking extends MainPage{
        @FindBy(id = "tab2")
        private WebElement manageBooking;
        @FindBy(id = "T7-name")
        private WebElement inputName;
        @FindBy(id = "T7-reference")
        private WebElement  inputBookingReference;
        @FindBy(id = "T7-retrieve")
        private WebElement retrieveBooking;
        @FindBy(id = "checkinErrorBlock")
        private WebElement error;


        public  void clearInputName(){
                inputName.clear();
        }
        public  void clearInputBookingReference(){
                inputBookingReference.clear();
        }
        public void setInputName(String name) {
                inputName.sendKeys(name);
        }
        public void setInputBookingReference(String name) {
                inputBookingReference.sendKeys(name);
        }
        public void clickToManageBooking() {
                manageBooking.click();
        }
        public void clickToRetrieveBooking() {
                retrieveBooking.click();
        }
<<<<<<< HEAD
        public void scrollToManageBookingContainer() {
=======
        public void scrollToManageBooking() {
>>>>>>> 9c0075ffc283d32a4efb85a39e1898250102fc21
                ((JavascriptExecutor)driver).executeScript("window.scrollBy(" + 0 + ","
                        + 200 + ");");
        }
        public String getError() {
                return error.getText();
        }
}


