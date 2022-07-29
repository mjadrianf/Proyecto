package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContactUs_PO extends Base_PO{

    private @FindBy(css = "input[name='first_name']" ) WebElement firstName_TextField;

    private @FindBy(css = "input[name='last_name']") WebElement lastName_TextField;

    private @FindBy(css = "input[name='email']") WebElement emailAddress_TextField;

    private @FindBy(css = "textarea[name='message']") WebElement comment_TextField;

    private @FindBy(xpath = "//input[@value='SUBMIT']") WebElement submit_Button;

    private @FindBy(xpath = "//div[@id='contact_reply']") WebElement successfulSubmission_Message_text;

    private @FindBy(xpath = "/html/body") WebElement notSuccessfulSubmission_Message_text;


    public void setFirstName(String firstName){ sendKeys(firstName_TextField, firstName);}

    public void setLastName(String lastName){sendKeys(lastName_TextField, lastName);}

    public void setEmailAddress(String emailAddress){sendKeys(emailAddress_TextField, emailAddress);}

    public void setComment(String comment){sendKeys(comment_TextField,comment);}

    public void clickOn_Submit_Button(){waitForWebElementAndClick(submit_Button);}

    public void validate_Successful_SubmissionMessage(){
        waitFor(successfulSubmission_Message_text);
        Assert.assertEquals(successfulSubmission_Message_text.getText(),"Thank You for your Message!");
    }

    public void validate_NotSuccessful_SubmissionMessage(){
        waitFor(notSuccessfulSubmission_Message_text);
        Assert.assertEquals(notSuccessfulSubmission_Message_text.getText(),"Error: Invalid email address");
    }
}
