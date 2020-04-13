package blue.tests;
import blue.webpages.ContactUsPage;
import blue.webpages.HomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class askQuestionTest {

    ChromeDriver driver;
    HomePage home;
    ContactUsPage contactUsObj;

    @Before
    public void setup(){
        //use Chrome Driver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Create object of HomePage Class
        home = new HomePage(driver);
        //Create object of contactUsPage
        contactUsObj = new ContactUsPage(driver);
    }

    @Test
    public void fillInQuestionForm() {

        // navigate to contact us page and "contact us" button
        home.scrollDownForContactUsButtonAvailable();
        home.clickOnContactUsButton();
        //Check if page is opened
        Assert.assertTrue(contactUsObj.isPageOpened());

        String keyString = "Simple Automated Test";
        contactUsObj.setQuestionTextBox(keyString);
//        String actualQuestionText = contactUsObj.getQuestionText();
//        Assert.assertTrue(keyString.contentEquals(actualQuestionText));
        contactUsObj.setFirstName("Blue");
        contactUsObj.setLastName("SoftWare");
        contactUsObj.setEmail("BlueSoftware@bluesoftware.com");
        contactUsObj.setPhone("09848393");
    }


    @After
    public void close(){
        driver.close();
    }

}
