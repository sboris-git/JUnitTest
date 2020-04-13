package blue.webpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
     private WebDriver driver;

    //Page URL
    private static String PAGE_URL="https://bluesoftware.com/";

    //Locators
    @FindBy(css = "a[href=\"https://www.esko.com/en/lp/blue/contact\"]") //a[href="https://www.esko.com/en/lp/blue/contact"] //how = How.LINK_TEXT, using = "Contact Us"
    private WebElement contactUsButton;

    //Constructor
    public HomePage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickOnContactUsButton(){
        contactUsButton.click();
    }

    public boolean isContactUsButtonClickable(){
        return contactUsButton.isDisplayed();
    }

    public void scrollDownForContactUsButtonAvailable(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        while (!isContactUsButtonClickable()){
            //to perform Scroll on application using  Selenium
            js.executeScript("window.scrollBy(0,450)", "");
        }

    }
}
