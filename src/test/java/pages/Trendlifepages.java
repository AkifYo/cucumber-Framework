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
    @FindBy (xpath = "//span//a[@href='https://qa.trendlifebuy.com/login']")
    public WebElement userLoginButton;
    //mail textbox
    @FindBy (xpath = "//input[@name='login']")
    public WebElement userMailTextbox;
    //password textbox
    @FindBy (xpath = "//input[@id='password']")
    public WebElement userPasswordTextbox;
    //sign in  button
    @FindBy (id = "sign_in_btn")
    public WebElement signInButton;
    @FindBy (xpath = "//a[text()='Dashboard']")
    public WebElement userDashboardButton;

    @FindBy (xpath = "//div[@class='dashboard_sidebar_menuList']//ul//li[4]//a")
    public WebElement myOrderButton;
    //a[@href='https://qa.trendlifebuy.com/my-purchase-orders'])[2]
    //div[@class='dashboard_sidebar_menuList']//ul//li[4]//a

    @FindBy (xpath = "(//a[text()='Order Details'])[1]")
    public WebElement orderDetailsButton;

    // order id text
    @FindBy (xpath = "//h4[text()='Order ID:  ']")
    public WebElement orderIdText;
    // order date text
    @FindBy (xpath = "//h4[text()='Order date :  ']")
    public WebElement orderDateText;
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

    @FindBy (xpath = "//h5[text()='Ordered']")
    public WebElement orderedProcess;
    @FindBy (xpath = "(//div[@class='icon position-relative order_process_icon')[2]]")
    public WebElement orderProcessing;
    @FindBy (xpath = "(//div[@class='icon position-relative order_process_icon')[3]]")
    public WebElement orderShipped;
    @FindBy (xpath = "(//div[@class='icon position-relative order_process_icon')[4]]")
    public WebElement orderReceived;
    @FindBy (xpath = "(//div[@class='icon position-relative order_process_icon')[5]]")
    public WebElement orderDelivered;
    // Meaning of the processing

    @FindBy (xpath = "//h4[text()='Ordered']")
    public WebElement orderedMeans;
    @FindBy (xpath = "//h4[text()='Processing']")
    public WebElement processingMeans;
    @FindBy (xpath = "//h4[text()='Recieved']")
    public WebElement receivedMeans;
    @FindBy (xpath = "//h4[text()='Delivered']")
    public WebElement deliveredMeans;
    @FindBy (xpath = "//h4[text()='Shipped']")
    public WebElement shippedMeans;

    //cancel order button Cancel Order
    @FindBy (xpath = "(//a[@class='amaz_primary_btn gray_bg_btn min_200 radius_3px ml_10 order_cancel_by_id'])[1]")
    public WebElement cancelOrderButton;


    @FindBy (xpath = "//div[@class='nice-select primary_input3 radius_3px style6']")
    public WebElement cancelReasonDropbox;

    //Select cancel reason
    @FindBy (xpath = "//li[text()='Reason one']")
    public WebElement cancelReason;

    @FindBy(xpath = "//button[text()='Send']")
    public WebElement sendButton;

    //Notification page
    // notification button
    @FindBy(xpath = "//a[@class='position-relative d-flex align-items-center'][normalize-space()='Notification']")
    public WebElement notificationButton;
    @FindBy(xpath = "//h4[text()='Notifications ']")
    public WebElement notificationdText;
    @FindBy(xpath = "//th[text()='Title']")
    public WebElement notificationdTitle;
    @FindBy(xpath = "//th[text()='Date']")
    public WebElement notificationdDate;

    @FindBy (xpath = "(//a[@class='amaz_badge_btn4 text-nowrap text-capitalize text-center'][normalize-space()='View'])[1]")
    public WebElement notificationViewButon;
    @FindBy (xpath = "//a[normalize-space()='Setting']")
    public WebElement notificationSettingButton;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[1]")
    public WebElement notificationSettingsCheckbox;
    @FindBy (xpath = "(//input[@id='status'])[1]")
    public WebElement notificationSettingsCheckboxChecked;

    @FindBy (xpath = "(//img[@class='lazyload'])[8]")
    public WebElement produtcSdCart;

    @FindBy (xpath = "(//img[@data-src=\"https://qa.trendlifebuy.com/public/uploads/images/21-12-2022/63a402d28afb4.jpeg\"])[1]")
    public WebElement productCouch;


    @FindBy (xpath = "(//i[@class='ti-close'])[2]")
    public WebElement screenCloseButton;

    @FindBy (xpath = "(//a[@href='https://trendlifebuy.com/checkout'])[2]")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "(//img[@data-src=\"https://qa.trendlifebuy.com/public/uploads/images/14-12-2022/6398e411d8ef7.png\"])[1]")
    public WebElement productComputerImage;
    @FindBy(xpath = "//a[@href='https://qa.trendlifebuy.com/product/transcend-ssd220s-2-5-ssd-sata-iii-6gb-s-internal-120gb-ssd']")
    public WebElement productSDCartImage;


    @FindBy(xpath = "(//*[text()=\"Add to Cart\"])[8]")
    public WebElement discountProductaddToCart;
    @FindBy(xpath = "//*[text()=\"Proceed to checkout\"]")
    public WebElement proceedOrderToCheckoutButton;

    @FindBy (xpath = "//h3[text()='Contact Information']")
    public WebElement contactInformation;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement mailShippingInfo;

    @FindBy (xpath = "//span[@class='checkmark mr_15']")
    public  WebElement newsAndOffersCheckbox;
    @FindBy (xpath = "//input[@type='checkbox']")
    public  WebElement newsAndOffersCheckboxCheck;

    @FindBy (xpath = "(//span[@class='checkmark'])[1]")
    public  WebElement shippingOptionsCheckboxCheckHomedelivery;
    @FindBy (xpath = "(//span[@class='checkmark'])[2]")
    public  WebElement shippingOptionsCheckboxCheckPickupLocation;


    @FindBy (xpath = "(//input[@type='radio'])[1]")
   public  WebElement shippingOptionsCheck;
    //customer shipping details
    @FindBy (xpath = "//input[@id='name']")
    public  WebElement customerNameTextbox;
    @FindBy (xpath = "//input[@id='address']")
    public  WebElement customerAdressTextbox;
    @FindBy (xpath = "//input[@id='phone']")
    public  WebElement customerPhoneTextbox;
    @FindBy (xpath = "//input[@id='postal_code']")
    public  WebElement customePostalCodeTextbox;
    @FindBy (xpath = "//textarea[@id='note']")
    public  WebElement customerNoteText;
    @FindBy (xpath = "//select[@id='country']")
    public  WebElement customerCountryDropbox;
    @FindBy (xpath = "//li[@data-value='231']")
    public  WebElement customerCountryDropboxLocate;
    @FindBy (xpath = "(//div[@class='nice-select theme_select style2 wide'])[2]")
    public  WebElement customerCountryDropboxLocateby;


    @FindBy (xpath = "//select[@id='state']")
    public  WebElement customerStateDropbox;
    @FindBy (xpath = "//li[@data-value='3970']")
    public  WebElement CustomerStateDropboxLocate;
    @FindBy (xpath = "(//div[@class='nice-select theme_select style2 wide'])[3]")
    public  WebElement customerStateDropboxLocateby;
    @FindBy (xpath = "//input[@id='address']")
    public  WebElement customerCityDropbox;
    @FindBy (xpath = "//li[@data-value='46384']")
    public  WebElement customerCityDropboxLocate;
    @FindBy (xpath = "(//div[@class='nice-select theme_select style2 wide'])[4]")
    public  WebElement customerCityDropboxLocateby;

    @FindBy (xpath = "(//span[@class='checkmark mr_15'])[2]")
    public  WebElement agreeTermCheckbox;

    @FindBy (xpath = "//input[@id='term_check']")
    public  WebElement agreeTermCheckboxCheck;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public  WebElement continueToShopping;
    @FindBy (xpath = "//button[text()='Continue To Payment']")
    public  WebElement continueToPayment;

    @FindBy (xpath = "//*[text()=\"Pay Now\"]")
    public  WebElement payNowButton;

    // a[@data-type='CashOnDelivery']
    @FindBy (xpath = "//h3[text()='Thank you for your purchase!']")
    public  WebElement orderThanksMessage;

    @FindBy (xpath = "//a[text()='Continue Shopping']")
    public  WebElement customerContinueToShopping;

    //@FindBy (xpath = "//input[@name='payment_method']")

    @FindBy(xpath = "(//span[@class='checkmark mr_10'])[2]")
    public  WebElement paymentMethodCheckbox;









    //****************************************************************
    @FindBy(xpath ="(//span[text()=\"Cart (\"])[1]")
    public WebElement cartButton;

    @FindBy(xpath = "(//*[text()=\"Add to Cart\"])[5]")
    public WebElement addToCart;



    @FindBy(xpath = "(//img[@data-src=\"https://qa.trendlifebuy.com/public/uploads/images/21-12-2022/63a402d28afb4.jpeg\"])[1]")
    public WebElement productImage;

    @FindBy(xpath = "(//i[@class=\"ti-close\"])[2]")
    public WebElement closeButton;

    @FindBy(id = "add_to_cart_btn_modal")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[text()=\"View cart\"]")
    public WebElement viewCartButton;


    @FindBy(xpath ="(//h3)[1]")
    public WebElement orderSummaryText;
    @FindBy(xpath = "(//h4[text()=\"Subtotal\"])[2]")
    public WebElement subtotalText;

    @FindBy(xpath = "//h4[text()=\"Shipping Charge\"]")
    public WebElement shippingChargeText;

    @FindBy(xpath = "//h4[text()=\"Discount\"]\n")
    public WebElement discountText;


    @FindBy(xpath = "//h4[text()=\"VAT/TAX/GST\"]\n")
    public WebElement vat_tax_gst_Text;


    @FindBy(xpath = "(//*[text()=\"Total\"])[2]")
    public WebElement totalText;
    //****************************************************************

}
