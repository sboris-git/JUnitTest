package blue.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

    private WebDriver driver;

    @FindBy(tagName = "h1")
    WebElement heading;

    @FindBy(id="fxb_7cc217b6-d2bb-4992-90a9-d2552824f9a0_Fields_bb06787e-8242-4709-83b2-6820851c8a49__Value")
    WebElement questionTextbox;

    @FindBy(id = "fxb_7cc217b6-d2bb-4992-90a9-d2552824f9a0_Fields_5e1d884d-5332-4244-9c82-b47fd6c748f8__Value")
    WebElement firstNameInput;

    @FindBy(id = "fxb_7cc217b6-d2bb-4992-90a9-d2552824f9a0_Fields_4c2e8b4a-e36d-4202-9f35-18b31665fe6e__Value")
    WebElement lastNameInput;

    @FindBy(id = "fxb_7cc217b6-d2bb-4992-90a9-d2552824f9a0_Fields_33b0a7d2-65bc-4687-add4-1d85e446be7e__Value")
    WebElement emailInput;

    @FindBy(id = "fxb_7cc217b6-d2bb-4992-90a9-d2552824f9a0_Fields_6d40ba2f-5081-47e2-9f25-753f672f1dd0__Value")
    WebElement phoneInput;

    @FindBy(id = "fxb_7cc217b6-d2bb-4992-90a9-d2552824f9a0_Fields_673aa4ae-a4cc-48b1-801d-ef803a7f9480__Value")
    WebElement mainActivitiesDropdownList;

    @FindBy(id = "fxb_7cc217b6-d2bb-4992-90a9-d2552824f9a0_Fields_1f9d3fe5-1ebf-4189-afa4-985bd9f2c94f__Value")
    WebElement companyNameInput;

    @FindBy(id = "fxb_7cc217b6-d2bb-4992-90a9-d2552824f9a0_Fields_a8bf4c52-ee65-4872-b09e-0633c55a6355__Value")
    WebElement cityInput;

    @FindBy(id = "fxb_7cc217b6-d2bb-4992-90a9-d2552824f9a0_Fields_2b38effc-33b2-488e-ac43-fa1225a72c3e__Value")
    WebElement countryDropdownList;

    @FindBy(id = "fxb_7cc217b6-d2bb-4992-90a9-d2552824f9a0_Fields_f1e418bf-a7e8-4c95-9767-f6bf778a76da__Value")
    WebElement keepInTouchCheckbox;

    @FindBy(css = "input[value='Submit']")
    WebElement submitButton;


    //Constructor
    public ContactUsPage(WebDriver driver){
        this.driver=driver;
        //Initialize Elements
        PageFactory.initElements(driver, this);
    }

    public void setQuestionTextBox(String questionText) {
        questionTextbox.clear();
        questionTextbox.sendKeys(questionText);
    }
    public String getQuestionText() {
        return questionTextbox.getText();
    }

    public void setFirstName(String nameInput){
        firstNameInput.clear();
        firstNameInput.sendKeys(nameInput);
    }
    public String setFirstName(){
        return firstNameInput.getText();
    }

    public void setLastName(String lastName){
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
    }

    public String getLastName(){
        return lastNameInput.getText();
    }

    public void setEmail (String email){
        // ToDo check e-mail
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public String getEmail (){
        return emailInput.getText();
    }

    public void  setPhone(String phoneNumber){
        // ToDo check phone number
        phoneInput.clear();
        phoneInput.sendKeys(phoneNumber);
    }

    public String  getPhone(){
        return phoneInput.getText();
    }

    public void setMainActivities(){
        Select mainActivitiesDropList = new Select(mainActivitiesDropdownList);
        mainActivitiesDropList.getOptions();
    }

    public boolean isPageOpened(){
        //Assertion
        String paragraphAtPage = "Get in touch with us";
        return heading.getText().toString().contains(paragraphAtPage);
    }
}

