package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;
import pages.Trendlifepages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TrendlifeStepdefinitions {
    Trendlifepages page= new Trendlifepages();

    Actions actions= new Actions(Driver.getDriver());
    //US12 Test Case 1
    @Given("user goes to home page")
    public void userGoesToHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("tlUrl"));
    }

    @And("user clicks on the contact button")
    public void userClicksOnTheContactButton() {
        //Driver.getDriver().findElement(By.xpath("(//a[text()='Contact'])[1]"));
        ReusableMethods.pleaseWait(2);
        page.contactButton.click();
        actions.scrollToElement(page.headOfficeText);
    }

    @Then("user sees the text of Call WhatsApp, Get in touch and Head office")
    public void userSeesTheTextOfCallWhatsAppGetInTouchAndHeadOffice() {
        //asssert  the texts of Call WhatsApp, Get in touch and Head office
        ReusableMethods.pleaseWait(1);
        // call and whatsapp
        Assert.assertTrue(page.callText.isDisplayed());
        Assert.assertTrue(page.headOfficeText.isDisplayed());
        Assert.assertTrue(page.getInTouchText.isDisplayed());
    }
    //US 12 Test Case 2

    @And("user enters name, mail and his message box")
    public void userEntersNameMailAndHisMessageBox() {
        ReusableMethods.pleaseWait(2);
        page.nameTextbox.sendKeys(ConfigReader.getProperty("name"));
        page.emailTextbox.sendKeys(ConfigReader.getProperty("contactSendMessageEmail"));
        ReusableMethods.pleaseWait(2);
        //actions.keyDown(Keys.ARROW_DOWN).perform();
        ReusableMethods.pleaseWait(2);
        //actions.keyUp(Keys.ARROW_DOWN).perform();
        Select select= new Select(page.dropBoxClick);
        ReusableMethods.pleaseWait(2);
       // page.dropBoxC.click();
        ReusableMethods.pleaseWait(2);
        //select.selectByVisibleText("Customer");
        //page.dropBoxCustomer.click();
        page.textArea.sendKeys(ConfigReader.getProperty("messageText"));
        ReusableMethods.pleaseWait(4);
        page.dropBoxC.click();
        ReusableMethods.pleaseWait(4);
        page.optionCustomer.click();
       // select.selectByValue("2");

        //select.selectByVisibleText("Customer");
        actions.moveToElement(page.optionCustomer).click().perform();

    }
     @Then("user sees that the message was sent successfully")
    public void userSeesThatTheMessageWasSentSuccessfully() throws IOException {
        ReusableMethods.pleaseWait(2);
        page.contactSendMessageButton.click();
        ReusableMethods.pleaseWait(1);
        ReusableMethods.getScreenshot("MessageIsSentSuccessfully");
    }

    // US 12 Test Case 3
    @Then("user sees he social media icons on the contact page")
    public void userSeesHeSocialMediaIconsOnTheContactPage() {
        ReusableMethods.pleaseWait(2);
        Assert.assertTrue(page.faceIcon.isDisplayed());
        Assert.assertTrue(page.twitterIcon.isDisplayed());
        Assert.assertTrue(page.linkedinIcon.isDisplayed());
        Assert.assertTrue(page.instagramIcon.isDisplayed());
    }
    //US_18

    @And("user clicks to the login button")
    public void userClicksToTheLoginButton() {
        page.userLoginButton.click();
        ReusableMethods.pleaseWait(2);

    }

    @And("user  enters her {string} and {string}  and clicks sign in button")
    public void userEntersHerAndAndClicksSignInButton(String userMail, String userPassword) {
        page.userMailTextbox.click();
        ReusableMethods.pleaseWait(1);
        page.userMailTextbox.sendKeys(userMail);
        ReusableMethods.pleaseWait(2);
        page.userMailTextbox.click();
        ReusableMethods.pleaseWait(1);
        page.userPasswordTextbox.sendKeys(userPassword);
        ReusableMethods.pleaseWait(2);
        page.signInButton.click();
        ReusableMethods.pleaseWait(2);
    }

    @And("user selects the DASHBOARD button")
    public void userSelectsTheDASHBOARDButton() {
        page.userDashboardButton.click();
        ReusableMethods.pleaseWait(2);
    }

    @Then("user clicks the my order button")
    public void userClicksTheMyOrderButton() {
        ReusableMethods.pleaseWait(2);
        actions.keyDown(Keys.ARROW_DOWN).perform();
        actions.keyDown(Keys.ARROW_DOWN).perform();
        actions.keyDown(Keys.ARROW_DOWN).perform();
    ReusableMethods.pleaseWait(2);
    page.myOrderButton.click();
       // actions.moveToElement(page.myOrderButton).click().perform();
    }
}

