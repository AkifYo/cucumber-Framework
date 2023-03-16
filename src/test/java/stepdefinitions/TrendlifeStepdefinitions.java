package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;
import pages.Trendlifepages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TrendlifeStepdefinitions {

    Trendlifepages page = new Trendlifepages();

    Actions actions = new Actions(Driver.getDriver());

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
        ReusableMethods.pleaseWait(2);
        //actions.scrollToElement(page.headOfficeText);
        ReusableMethods.jsToEndOfThePage();
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

    @Then("user sees the text of Call WhatsApp, Get in touch and Head office")
    public void userSeesTheTextOfCallWhatsAppGetInTouchAndHeadOffice() {
        //asssert  the texts of Call WhatsApp, Get in touch and Head office
        ReusableMethods.pleaseWait(1);

        // call and whatsapp
        assertTrue(page.callText.isDisplayed());
        assertTrue(page.headOfficeText.isDisplayed());
        assertTrue(page.getInTouchText.isDisplayed());


    }

    //US 12 Test Case 2
    @And("user enters name, mail and his message box")
    public void userEntersNameMailAndHisMessageBox() {
        ReusableMethods.pleaseWait(2);
        page.nameTextbox.sendKeys(ConfigReader.getProperty("name"));
        page.emailTextbox.sendKeys(ConfigReader.getProperty("contactSendMessageEmail"));
        ReusableMethods.pleaseWait(4);
        //actions.keyDown(Keys.ARROW_DOWN).perform();
        ReusableMethods.pleaseWait(4);
        //actions.keyUp(Keys.ARROW_DOWN).perform();
        Select select = new Select(page.dropBoxClick);
        ReusableMethods.pleaseWait(4);
        // page.dropBoxC.click();
        ReusableMethods.pleaseWait(4);
        //select.selectByVisibleText("Customer");
        //page.dropBoxCustomer.click();
        page.textArea.sendKeys(ConfigReader.getProperty("messageText"));
        ReusableMethods.pleaseWait(4);
        page.dropBoxC.click();
        ReusableMethods.pleaseWait(4);
        page.optionCustomer.click();
        // select.selectByValue("2");
        //select.selectByVisibleText("Customer");
        //actions.moveToElement(page.optionCustomer).click().perform();
    }

    @Then("user sees that the message was sent successfully")
    public void userSeesThatTheMessageWasSentSuccessfully() throws IOException {
        ReusableMethods.pleaseWait(4);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 300)");
        page.contactSendMessageButton.click();
        ReusableMethods.pleaseWait(2);
        ReusableMethods.getScreenshot("MessageIsSentSuccessfully");
    }

    // US 12 Test Case 3
    @Then("user sees he social media icons on the contact page")
    public void userSeesHeSocialMediaIconsOnTheContactPage() {
        ReusableMethods.pleaseWait(2);
        assertTrue(page.faceIcon.isDisplayed());
        assertTrue(page.twitterIcon.isDisplayed());
        assertTrue(page.linkedinIcon.isDisplayed());
        assertTrue(page.instagramIcon.isDisplayed());
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
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 500)");
        ReusableMethods.pleaseWait(2);
        //actions.keyDown(Keys.ARROW_DOWN).perform();
        // actions.keyDown(Keys.ARROW_DOWN).perform();
        //actions.keyDown(Keys.ARROW_DOWN).perform();
        ReusableMethods.pleaseWait(2);
        page.myOrderButton.click();
        // actions.moveToElement(page.myOrderButton).click().perform();
        ReusableMethods.pleaseWait(4);
        assertTrue(page.orderAmountText.isDisplayed());
        //System.out.println(page.orderAmountText.isDisplayed());
    }

    @Then("user clicks the order details button")
    public void user_clicks_the_order_details_button() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 400)");
        ReusableMethods.pleaseWait(5);
        page.orderDetailsButton.click();
    }

    //US18 Test Case 2
    @Then("user can see he Order ID, Status, Order date, Order Amount, Package, Price, Shipping Info, Billing Info, Payment Info")
    public void user_can_see_he_order_id_status_order_date_order_amount_package_price_shipping_info_billing_info_payment_info() {
        ReusableMethods.pleaseWait(2);
        page.orderIdText.isDisplayed();
        page.orderAmountText.isDisplayed();
        page.orderStatusText.isDisplayed();
        page.orderBillingInfo.isDisplayed();
        page.orderPaymentInfo.isDisplayed();
        page.orderShippingInfo.isDisplayed();
        assertTrue(page.orderDateText.isDisplayed());
    }

    //US18 Test Case 3
    @Then("user can see Pending, Processing, Shipped, Recieved, Delivered stages related to the relevant order process")
    public void userCanSeePendingProcessingShippedRecievedDeliveredStagesRelatedToTheRelevantOrderProcess() {
//    page.orderedProcess.isDisplayed();
//    page.orderReceived.isDisplayed();
//    page.orderProcessing.isDisplayed();
//    page.orderShipped.isDisplayed();
        assertTrue(page.orderedProcess.isDisplayed());
    }

    //US18 Test Case 4
    @Then("user can see what he meaning of Pending, Processing, Shipped, Recieved, Delivered stages related to the relevant order process")
    public void userCanSeeWhatHeMeaningOfPendingProcessingShippedRecievedDeliveredStagesRelatedToTheRelevantOrderProcess() {
        ReusableMethods.pleaseWait(2);
        assertTrue(page.orderedMeans.isDisplayed());
    }

    //US18 Test Case 5
    @Then("user clicks the cancel order button and cancel screen appears")
    public void userClicksTheCancelOrderButtonAndCancelScreenAppears() {
        ReusableMethods.pleaseWait(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 300)");
        assertTrue(page.cancelOrderButton.isDisplayed());
    }

    // US18 Test Case 6
    @Then("user selects a reason from the list")
    public void userSelectsAReasonFromTheList() {
        ReusableMethods.pleaseWait(3);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 300)");
        ReusableMethods.pleaseWait(3);
        page.cancelOrderButton.click();
    }

    // US18 Test Case 6
    @And("sends it with clicking the send button")
    public void sendsItWithClickingTheSendButton() {
        ReusableMethods.pleaseWait(2);
        page.cancelReasonDropbox.click();
        ReusableMethods.pleaseWait(2);
        page.cancelReason.click();
        ReusableMethods.pleaseWait(2);
        page.sendButton.click();
    }

    // US18 Test Case 7
    @Then("user can access the shipping billing and payment info")
    public void userCanAccessTheShippingBillingAndPaymentInfo() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 500)");
        ReusableMethods.pleaseWait(2);
        page.orderBillingInfo.isDisplayed();
        page.orderShippingInfo.isDisplayed();
        assertTrue(page.orderPaymentInfo.isDisplayed());
        ReusableMethods.pleaseWait(2);
    }

    // US24 Test Case 1
    @Then("User clicks the notification button")
    public void userClicksTheNotificationButton() {
        ReusableMethods.pleaseWait(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 700)");
        ReusableMethods.pleaseWait(2);
        page.notificationButton.click();
    }

    // US24 Test Case 2
    @Then("User sees the notifications in the list")
    public void userSeesTheNotificationsInTheList() {

        ReusableMethods.pleaseWait(2);
        assertTrue(page.notificationdText.isDisplayed());
    }

    // US24 Test Case 3
    @Then("User sees notifications with Title and Date information")
    public void userSeesNotificationsWithTitleAndDateInformation() {
        ReusableMethods.pleaseWait(2);
        assertTrue(page.notificationdTitle.isDisplayed());
        assertTrue(page.notificationdDate.isDisplayed());
    }

    // US24 Test Case 4
    @Then("User clicks on the view button and sees the order details")
    public void userClicksOnTheViewButtonAndSeesTheOrderDetails() {
        ReusableMethods.pleaseWait(2);
        page.notificationViewButon.click();
        ReusableMethods.pleaseWait(2);
        assertTrue(page.orderIdText.isDisplayed());
    }

    // US24 Test Case 5
    @Then("User clicks the setting button and sees the setting list")
    public void userClicksTheSettingButtonAndSeesTheSettingList() {
        page.notificationSettingButton.click();
        ReusableMethods.pleaseWait(2);

        String expectedUrl = "https://qa.trendlifebuy.com/profile/notification_setting";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("User clicks the setting button and sees the Type of setting cre changeable")
    public void userClicksTheSettingButtonAndSeesTheTypeOfSettingCreChangeable() {
        ReusableMethods.pleaseWait(2);
        page.notificationSettingsCheckbox.click();
        ReusableMethods.pleaseWait(2);
        page.notificationSettingsCheckbox.click();
        ReusableMethods.pleaseWait(4);
        assertTrue(page.notificationSettingsCheckboxChecked.isSelected());
    }


    @When("user sees the home page")
    public void userSeesTheHomePage() {
        ReusableMethods.pleaseWait(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 500)");

    }

    @Then("User sees the products")
    public void userSeesTheProducts() {

        ReusableMethods.pleaseWait(2);
        String expectedUrl = "https://qa.trendlifebuy.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("User hover over the product")
    public void userHoverOverTheProduct() {
        ReusableMethods.pleaseWait(4);
        page.screenCloseButton.click();
        ReusableMethods.pleaseWait(2);
        actions.moveToElement(page.productCouch).perform();
        // actions.scrollToElement(page.produtcCouch).perform();
        //actions.moveToElement(page.produtcSdCart).perform();
        //assertTrue(page.productCouch.isDisplayed());
    }

    @Then("User hover over the product end she is able to add product to cart")
    public void userHoverOverTheProductEndSheIsAbleToAddProductToCart() {
        ReusableMethods.pleaseWait(2);
        actions.moveToElement(page.cartButton);

        assertTrue(page.addToCart.isDisplayed());

        ReusableMethods.pleaseWait(2);

        ReusableMethods.pleaseWait(2);
        actions.moveToElement(page.productCouch).perform();
        ReusableMethods.pleaseWait(2);

    }

    @Then("User add to product to cart")
    public void userAddToProductToCart() {
        ReusableMethods.pleaseWait(4);
        page.screenCloseButton.click();
        actions.moveToElement(page.productSDCartImage).perform();
        ReusableMethods.pleaseWait(2);
        page.discountProductaddToCart.click();
    }

    @Then("User can clicks the View Cart Button and navigate to the cart page")
    public void userCanClicksTheViewCartButtonAndNavigateToTheCartPage() {
        ReusableMethods.pleaseWait(2);
        page.viewCartButton.click();
        ReusableMethods.pleaseWait(2);

        String expectedUrl = "https://qa.trendlifebuy.com/cart";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Then("User can see the proceed To checkout button")
    public void userCanSeeTheProceedToCheckoutButton() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200)");
        ReusableMethods.pleaseWait(2);
        assertTrue(page.proceedOrderToCheckoutButton.isDisplayed());
    }

    @Then("User clicks to the Proceed to checkout")
    public void userClicksToTheProceedToCheckout() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200)");
        ReusableMethods.pleaseWait(2);
        page.proceedOrderToCheckoutButton.click();
        ReusableMethods.pleaseWait(2);
        assertTrue(page.contactInformation.isDisplayed());


    }

    @Then("User have to enter her mail")
    public void userHaveToEnterHerMail() {
        page.mailShippingInfo.sendKeys(ConfigReader.getProperty("clientMail"));
    }

    @Then("Users clicks the news and offers checkbox")
    public void usersClicksTheNewsAndOffersCheckbox() {
        ReusableMethods.pleaseWait(2);
        page.newsAndOffersCheckbox.click();
        ReusableMethods.pleaseWait(2);
        page.newsAndOffersCheckbox.click();
        ReusableMethods.pleaseWait(2);
        assertTrue(page.newsAndOffersCheckboxCheck.isSelected());
    }

    @Then("User clicks the Home delivery and Pickup Location")
    public void userClicksTheHomeDeliveryAndPickupLocation() {
        ReusableMethods.pleaseWait(2);
        page.shippingOptionsCheckboxCheckPickupLocation.click();
        ReusableMethods.pleaseWait(2);
        page.shippingOptionsCheckboxCheckHomedelivery.click();
        assertTrue(page.shippingOptionsCheck.isSelected());

    }

    @Then("User fills in all shipping information")
    public void userFillsInAllShippingInformation() {
        // Select select= new Select(page.customerCountryDropbox);
        page.customerNameTextbox.sendKeys(ConfigReader.getProperty("myName"));
        ReusableMethods.pleaseWait(2);
        page.customerAdressTextbox.sendKeys(ConfigReader.getProperty("myAdress"));
        ReusableMethods.pleaseWait(1);
        page.customePostalCodeTextbox.sendKeys(ConfigReader.getProperty("postalCode"));
        ReusableMethods.pleaseWait(1);
        page.customerPhoneTextbox.sendKeys(ConfigReader.getProperty("phoneNumber"));
        ReusableMethods.pleaseWait(1);


        page.customerNoteText.sendKeys(ConfigReader.getProperty("myNote"));


        page.customerCountryDropboxLocateby.click();
        ReusableMethods.pleaseWait(2);
        page.customerCountryDropboxLocate.click();

        ReusableMethods.pleaseWait(2);
        //select.selectByValue("231");

        page.customerStateDropboxLocateby.click();
        ReusableMethods.pleaseWait(3);
        page.CustomerStateDropboxLocate.click();
        ReusableMethods.pleaseWait(2);
        //select= new Select(page.customerStateDropbox);
        ReusableMethods.pleaseWait(2);
        //select.selectByValue("3970");


        page.customerCityDropboxLocateby.click();
        ReusableMethods.pleaseWait(2);

        page.customerCityDropboxLocate.click();
        ReusableMethods.pleaseWait(2);
        ReusableMethods.pleaseWait(2);
        //select = new Select(page.customerCityDropbox);

        //select.selectByValue("46384");

    }

    @Then("User clicks the terms and condition")
    public void userClicksTheTermsAndCondition() {
        ReusableMethods.pleaseWait(4);
        page.agreeTermCheckbox.click();
        ReusableMethods.pleaseWait(4);
        page.agreeTermCheckbox.click();

        assertTrue(page.agreeTermCheckboxCheck.isSelected());
    }

    @Then("User sees the continue to shipping button")
    public void userSeesTheContinueToShippingButton() {
        assertTrue(page.continueToShopping.isDisplayed());
    }

    @Then("User clicks the continue to shipping button")
    public void userClicksTheContinueToShippingButton() {
        ReusableMethods.jsScrollBy(100);
        ReusableMethods.pleaseWait(2);

        page.continueToShopping.click();
        ReusableMethods.pleaseWait(2);
        assertTrue(page.orderSummaryText.isDisplayed());
    }

    @Then("User sees the Continue to Payment")
    public void userSeesTheContinueToPayment() {
        ReusableMethods.pleaseWait(2);
        assertTrue(page.continueToPayment.isDisplayed());
    }

    @Then("User clicks to the Continue to Payment button")
    public void userClicksToTheContinueToPaymentButton() {
        ReusableMethods.jsScrollBy(100);
        ReusableMethods.pleaseWait(2);
        page.continueToPayment.click();
        assertTrue(page.orderSummaryText.isDisplayed());
    }

    @Then("User sees the Pay Now button")
    public void userSeesThePayNowButton() {
        ReusableMethods.jsScrollBy(600);
        ReusableMethods.pleaseWait(2);
        assertTrue(page.payNowButton.isDisplayed());
    }

    @Then("User clicks to the Pay Now button")
    public void userClicksToThePayNowButton() {

        ReusableMethods.pleaseWait(5);




        System.out.println(page.payNowButton.getLocation().x);
        System.out.println(page.payNowButton.getLocation().y);
        ReusableMethods.jsClick(page.payNowButton);
        //actions.moveByOffset(90,1079);
        //page.payNowButton.click();
        //page.payNowButton.submit();



        assertTrue(page.orderThanksMessage.isDisplayed());
    }

    @Then("User sees the Continue Shopping")
    public void userSeesTheContinueShopping() {
        ReusableMethods.jsScrollBy(300);
        ReusableMethods.pleaseWait(2);
        assertTrue(page.customerContinueToShopping.isDisplayed());
    }

    @Then("User clicks to the Continue Shopping")
    public void userClicksToTheContinueShopping() {
        ReusableMethods.jsScrollBy(400);
        ReusableMethods.pleaseWait(4);
        page.customerContinueToShopping.click();
        ReusableMethods.pleaseWait(2);
        String expectedUrl="https://qa.trendlifebuy.com/";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        assertEquals(actualUrl,expectedUrl);
    }
}

