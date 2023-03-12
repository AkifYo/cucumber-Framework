package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Trendlifepages {
    public Trendlifepages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //contact butonu
    @FindBy(xpath = "(//a[text()='Contact'])[1]")
    public WebElement contactButton;
    @FindBy (xpath = "//h4[text()='21 White Horse Road East, New Jersey - US']")
    public WebElement headOfficeText;

    @FindBy (xpath = "//h4[text()='+10187595662']")
    public WebElement callText;
    @FindBy (xpath = "//h4[text()='Get in touch']")
    public WebElement getInTouchText;
    @FindBy (xpath = "//input[@id='name']")
    public WebElement nameTextbox;
    @FindBy (xpath = "//input[@id='email']")
    public WebElement emailTextbox;

    @FindBy (xpath = "//select[@id='query_type']")
    public WebElement dropBoxClick;
    @FindBy (xpath = "(//div[@tabindex='0'])[2]")
    public WebElement dropBoxC;
    //li[@data-value='2']
    @FindBy (xpath = "//li[text()='Customer']")
    public WebElement optionCustomer;

    @FindBy (xpath = "//li[text()='Customer']")
    public WebElement dropBoxCustomer;
    //

    @FindBy (xpath = "//textarea[@id='message']")
    public WebElement textArea;
    @FindBy (id = "contactBtn")
    public WebElement contactSendMessageButton;
        // socal media icons on the contact page
    @FindBy (xpath = "//a[@href='https://www.facebook.com']")
    public WebElement faceIcon;
    @FindBy (xpath = "//a[@href='https://twitter.com/']")
    public WebElement twitterIcon;
    @FindBy (xpath = "//a[@href='https://linkedin.com/']")
    public WebElement linkedinIcon;
    @FindBy (xpath = "//a[@href='https://www.instagram.com']")
    public WebElement instagramIcon;
    // user login button
    @FindBy (xpath = "(//a[text()='Login'])[2]")
    public WebElement userLoginButton;
    //mail textbox
    @FindBy (xpath = "//a[text()='Login']")
    public WebElement userMailTextbox;
    //password textbox
    @FindBy (xpath = "//input[@id='password']")
    public WebElement userPasswordTextbox;
    //sign in  button
    @FindBy (id = "sign_in_btn")
    public WebElement signInButton;
    @FindBy (xpath = "//a[text()='Dashboard']")
    public WebElement userDashboardButton;

    @FindBy (xpath = "//a[text()='My Order']")
    public WebElement myOrderButton;

    // order id text
    @FindBy (xpath = "//h4[text()='Order ID:  ']")
    public WebElement orderIdText;
    // order date text
    @FindBy (xpath = "//h4[text()='Order date :  ']")
    public WebElement orderDetailsButton;
    // order status text
    @FindBy (xpath = "//h4[text()='Status: ']")
    public WebElement orderStatusText;
    //order amount text
    @FindBy (xpath = "//h4[text()='Order amount: ']")
    public WebElement orderAmountText;
    //order package text
    @FindBy (xpath = "//h4[text()='Package : 23030801111659']")
    public WebElement orderPackageInformation;
    // order price
    @FindBy (xpath = "//h4[text()='Price: $ 3,197']")
    public WebElement orderPriceText;
    // order shipping information
    @FindBy (xpath = "//h4[text()='Shipping Info ']")
    public WebElement orderShippingInfo;
    // order billing information
    @FindBy (xpath = "//h4[text()='Billing Info ']")
    public WebElement orderBillingInfo;
    @FindBy (xpath = "//h4[text()='Payment Info ']")
    public WebElement orderPaymentInfo;









}
