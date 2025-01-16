package pages;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import constants.Constants;
import pageconstants.HomePageConstants;
import utils.CommonUtils;


public class LandingPage  {
	
	WebDriver driver;
	Actions actions;
	private String orderPlace ="ORDER PLACED!";
	
	SoftAssert softAssert= new SoftAssert();
	
	public LandingPage(WebDriver driver)
	{
		
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getWebElementOptionWomen() {
		return webElementOptionWomen;
	}

	

	public WebElement getWebElementOptionDress() {
		return webElementOptionDress;
	}

	public void setWebElementOptionDress(WebElement webElementOptionDress) {
		this.webElementOptionDress = webElementOptionDress;
	}

	public WebElement getWebElementSelectQuantity() {
		return webElementSelectQuantity;
	}

	public void setWebElementSelectQuantity(WebElement webElementSelectQuantity) {
		this.webElementSelectQuantity = webElementSelectQuantity;
	}

	public WebElement getWebElementViewProduct() {
		return webElementViewProduct;
	}

	public void setWebElementViewProduct(WebElement webElementViewProduct) {
		this.webElementViewProduct = webElementViewProduct;
	}

	public WebElement getWebElementAddTocart() {
		return webElementAddTocart;
	}

	public void setWebElementAddTocart(WebElement webElementAddTocart) {
		this.webElementAddTocart = webElementAddTocart;
	}

	public WebElement getWebElementContinueShopping() {
		return webElementContinueShopping;
	}

	public void setWebElementContinueShopping(WebElement webElementContinueShopping) {
		this.webElementContinueShopping = webElementContinueShopping;
	}

	public WebElement getWebElementOPtionProduct() {
		return webElementOPtionProduct;
	}

	public void setWebElementOPtionProduct(WebElement webElementOPtionProduct) {
		this.webElementOPtionProduct = webElementOPtionProduct;
	}

	public WebElement getWebElementOptionbabyHug() {
		return webElementOptionbabyHug;
	}

	public void setWebElementOptionbabyHug(WebElement webElementOptionbabyHug) {
		this.webElementOptionbabyHug = webElementOptionbabyHug;
	}

	public WebElement getWebElementSelectItemHalf() {
		return webElementSelectItemHalf;
	}

	public void setWebElementSelectItemHalf(WebElement webElementSelectItemHalf) {
		this.webElementSelectItemHalf = webElementSelectItemHalf;
	}

	public WebElement getWebElementAddTocart1() {
		return webElementAddTocart1;
	}

	public void setWebElementAddTocart1(WebElement webElementAddTocart1) {
		this.webElementAddTocart1 = webElementAddTocart1;
	}

	public WebElement getWebElementViewCart() {
		return webElementViewCart;
	}

	public void setWebElementViewCart(WebElement webElementViewCart) {
		this.webElementViewCart = webElementViewCart;
	}

	public WebElement getWebElementCheckout() {
		return webElementCheckout;
	}

	public void setWebElementCheckout(WebElement webElementCheckout) {
		this.webElementCheckout = webElementCheckout;
	}

	public WebElement getWebElementRegesterUserButton() {
		return webElementRegesterUserButton;
	}

	public void setWebElementRegesterUserButton(WebElement webElementRegesterUserButton) {
		this.webElementRegesterUserButton = webElementRegesterUserButton;
	}

	public WebElement getWebElementUserName() {
		return webElementUserName;
	}

	public void setWebElementUserName(WebElement webElementUserName) {
		this.webElementUserName = webElementUserName;
	}

	public WebElement getWebElementUserEmail() {
		return webElementUserEmail;
	}

	public void setWebElementUserEmail(WebElement webElementUserEmail) {
		this.webElementUserEmail = webElementUserEmail;
	}

	public WebElement getWebElementSignupButton() {
		return webElementSignupButton;
	}

	public void setWebElementSignupButton(WebElement webElementSignupButton) {
		this.webElementSignupButton = webElementSignupButton;
	}

	public WebElement getWebElementUserPassword() {
		return webElementUserPassword;
	}

	public void setWebElementUserPassword(WebElement webElementUserPassword) {
		this.webElementUserPassword = webElementUserPassword;
	}

	public WebElement getWebElementUserFirstName() {
		return webElementUserFirstName;
	}

	public void setWebElementUserFirstName(WebElement webElementUserFirstName) {
		this.webElementUserFirstName = webElementUserFirstName;
	}

	public WebElement getWebElementUserLastName() {
		return webElementUserLastName;
	}

	public void setWebElementUserLastName(WebElement webElementUserLastName) {
		this.webElementUserLastName = webElementUserLastName;
	}

	public WebElement getWebElementUserAdress() {
		return webElementUserAdress;
	}

	public void setWebElementUserAdress(WebElement webElementUserAdress) {
		this.webElementUserAdress = webElementUserAdress;
	}

	public WebElement getWebElementUserSate() {
		return webElementUserSate;
	}

	public void setWebElementUserSate(WebElement webElementUserSate) {
		this.webElementUserSate = webElementUserSate;
	}

	public WebElement getWebElementUserCity() {
		return webElementUserCity;
	}

	public void setWebElementUserCity(WebElement webElementUserCity) {
		this.webElementUserCity = webElementUserCity;
	}

	public WebElement getWebElementUserZipCode() {
		return webElementUserZipCode;
	}

	public void setWebElementUserZipCode(WebElement webElementUserZipCode) {
		this.webElementUserZipCode = webElementUserZipCode;
	}

	public WebElement getWebElementUserMobileNumber() {
		return webElementUserMobileNumber;
	}

	public void setWebElementUserMobileNumber(WebElement webElementUserMobileNumber) {
		this.webElementUserMobileNumber = webElementUserMobileNumber;
	}

	public WebElement getWebElementCreateAcount() {
		return webElementCreateAcount;
	}

	public void setWebElementCreateAcount(WebElement webElementCreateAcount) {
		this.webElementCreateAcount = webElementCreateAcount;
	}

	@FindBy(xpath=HomePageConstants.OPTION_WOMEN)
	private WebElement webElementOptionWomen;
	
	@FindBy(xpath=HomePageConstants.OPTION_DRESS)
	 private WebElement webElementOptionDress;
	
	@FindBy(xpath=HomePageConstants.SELECT_QUANTITY)
	 private WebElement webElementSelectQuantity;
	
	@FindBy(xpath=HomePageConstants.VIEW_PRODUCT)
	 private WebElement webElementViewProduct;
	
	@FindBy(xpath=HomePageConstants.ADDTO_CART)
	 private WebElement webElementAddTocart;
	
	@FindBy(xpath=HomePageConstants.CONTINUE_SHOPPING)
	 private WebElement webElementContinueShopping;
	
	@FindBy(xpath=HomePageConstants.OPTION_PRODUCTS)
	 private WebElement webElementOPtionProduct;
	
	@FindBy(xpath=HomePageConstants.OPTION_BABYHUG)
	 private WebElement webElementOptionbabyHug;
	
	@FindBy(xpath=HomePageConstants.SELECT_ITEM_HALF_SLEEVES)
	 private WebElement webElementSelectItemHalf;
	
	@FindBy(xpath=HomePageConstants.ADD)
	 private WebElement webElementAddTocart1;
	
	@FindBy(xpath=HomePageConstants.VIEW_CART)
	 private WebElement webElementViewCart;
	
	@FindBy(xpath=HomePageConstants.CHECK_OUT)
	 private WebElement webElementCheckout;
	
	@FindBy(xpath=HomePageConstants.REGISTER_USER_BUTTON)
	 private WebElement webElementRegesterUserButton;
	
	@FindBy(xpath=HomePageConstants.USER_NAME)
	 private WebElement webElementUserName;
	
	@FindBy(xpath=HomePageConstants.USER_EMAIL)
	 private WebElement webElementUserEmail;
	
	@FindBy(xpath=HomePageConstants.SIGNUP_BUTTON)
	 private WebElement webElementSignupButton;
	
	@FindBy(xpath=HomePageConstants.USER_PASSWORD)
	 private WebElement webElementUserPassword;
	
	@FindBy(xpath=HomePageConstants.USER_FIRST_NAME)
	 private WebElement webElementUserFirstName;
	
	@FindBy(xpath=HomePageConstants.USER_LAST_NAME)
	 private WebElement webElementUserLastName;
	
	@FindBy(xpath=HomePageConstants.USER_ADDRESS)
	 private WebElement webElementUserAdress;
	
	@FindBy(xpath=HomePageConstants.USER_STATE)
	 private WebElement webElementUserSate;
	
	@FindBy(xpath=HomePageConstants.USER_CITY)
	 private WebElement webElementUserCity;
	
	@FindBy(xpath=HomePageConstants.USER_ZIP_CODE)
	 private WebElement webElementUserZipCode;
	
	@FindBy(xpath=HomePageConstants.USER_MOBLIE_NUMBER)
	 private WebElement webElementUserMobileNumber;
	
	public WebElement getWebElementContinue() {
		return webElementContinue;
	}

	public void setWebElementContinue(WebElement webElementContinue) {
		this.webElementContinue = webElementContinue;
	}

	public WebElement getWebElementCart() {
		return webElementCart;
	}

	public void setWebElementCart(WebElement webElementCart) {
		this.webElementCart = webElementCart;
	}

	public WebElement getWebElementPlaceOrder() {
		return webElementPlaceOrder;
	}

	public void setWebElementPlaceOrder(WebElement webElementPlaceOrder) {
		this.webElementPlaceOrder = webElementPlaceOrder;
	}

	public WebElement getWebElementNameOnCard() {
		return webElementNameOnCard;
	}

	public void setWebElementNameOnCard(WebElement webElementNameOnCard) {
		this.webElementNameOnCard = webElementNameOnCard;
	}

	public WebElement getWebElementCardNumber() {
		return webElementCardNumber;
	}

	public void setWebElementCardNumber(WebElement webElementCardNumber) {
		this.webElementCardNumber = webElementCardNumber;
	}

	public WebElement getWebElementCardCvv() {
		return webElementCardCvv;
	}

	public void setWebElementCardCvv(WebElement webElementCardCvv) {
		this.webElementCardCvv = webElementCardCvv;
	}

	public WebElement getWebElementCardExpiryMonth() {
		return webElementCardExpiryMonth;
	}

	public void setWebElementCardExpiryMonth(WebElement webElementCardExpiryMonth) {
		this.webElementCardExpiryMonth = webElementCardExpiryMonth;
	}

	public WebElement getWebElementCardExpiryYear() {
		return webElementCardExpiryYear;
	}

	public void setWebElementCardExpiryYear(WebElement webElementCardExpiryYear) {
		this.webElementCardExpiryYear = webElementCardExpiryYear;
	}

	public WebElement getWebElementPayConfirm() {
		return webElementPayConfirm;
	}

	public void setWebElementPayConfirm(WebElement webElementPayConfirm) {
		this.webElementPayConfirm = webElementPayConfirm;
	}

	public WebElement getWebElementOrderPlacetext() {
		return webElementOrderPlacetext;
	}

	public void setWebElementOrderPlacetext(WebElement webElementOrderPlacetext) {
		this.webElementOrderPlacetext = webElementOrderPlacetext;
	}

	public WebElement getWebElementDownloadInvoice() {
		return webElementDownloadInvoice;
	}

	public void setWebElementDownloadInvoice(WebElement webElementDownloadInvoice) {
		this.webElementDownloadInvoice = webElementDownloadInvoice;
	}

	public WebElement getWebElementLogout() {
		return webElementLogout;
	}

	public void setWebElementLogout(WebElement webElementLogout) {
		this.webElementLogout = webElementLogout;
	}

	public void setWebElementOptionWomen(WebElement webElementOptionWomen) {
		this.webElementOptionWomen = webElementOptionWomen;
	}

	@FindBy(xpath=HomePageConstants.CREATE_ACOUNT_BUTTON)
	 private WebElement webElementCreateAcount;
	
	@FindBy(xpath=HomePageConstants.CONTINUE)
	 private WebElement webElementContinue;
	
	
	@FindBy(xpath=HomePageConstants.CART)
	 private WebElement webElementCart;
	
	@FindBy(xpath=HomePageConstants.PLACE_ORDER)
	 private WebElement webElementPlaceOrder;
	
	@FindBy(xpath=HomePageConstants.NAME_ON_CARD)
	 private WebElement webElementNameOnCard;
	
	@FindBy(xpath=HomePageConstants.CARD_NUMBER)
	 private WebElement webElementCardNumber;
	
	@FindBy(xpath=HomePageConstants.CARD_CVV)
	 private WebElement webElementCardCvv;
	
	@FindBy(xpath=HomePageConstants.CARD_EXPIRY_MONTH)
	 private WebElement webElementCardExpiryMonth;
	
	@FindBy(xpath=HomePageConstants.CARD_EXPIRY_YEAR)
	 private WebElement webElementCardExpiryYear;
	
	@FindBy(xpath=HomePageConstants.PAY_CONFIRM)
	 private WebElement webElementPayConfirm;
	
	@FindBy(xpath=HomePageConstants.ORDER_PLACE_TEXT)
	 private WebElement webElementOrderPlacetext;
	
	@FindBy(xpath=HomePageConstants.DOWNLOAD_INVOICE)
	 private WebElement webElementDownloadInvoice;
	
	@FindBy(xpath=HomePageConstants.LOGOUT)
	 private WebElement webElementLogout;
	
	public void add() {
		
		driver.get("https://automationexercise.com/");
		
	}

	public void selectWomenDress(final String quantity) {
		
		getWebElementOptionWomen().click();
		getWebElementOptionDress().click();
		CommonUtils.forceClick(driver, getWebElementViewProduct());
		//getWebElementViewProduct().click();
		getWebElementSelectQuantity().clear();
		getWebElementSelectQuantity().sendKeys(quantity);
		CommonUtils.waitForSpecficTime(Constants.TWO_SECOND);
		getWebElementAddTocart().click();
		
	}
	
	public void clickOnContinuteShoping() {
		//getWebElementContinueShopping().click();
		CommonUtils.waitForSpecficTime(Constants.TWO_SECOND);
		CommonUtils.forceClick(driver, getWebElementContinueShopping());
		
	}
	
	public void clickOnProductOption() {
		
		getWebElementOPtionProduct().click();
	}
	public void selectBabyHug() {
		actions = new Actions(driver);
		CommonUtils.waitForSpecficTime(Constants.TWO_SECOND);
		CommonUtils.scrollToElement(driver, getWebElementOptionbabyHug());
		getWebElementOptionbabyHug().click();
		CommonUtils.waitForSpecficTime(Constants.TWO_SECOND);
		actions.moveToElement(webElementSelectItemHalf).perform();
		//CommonUtils.waitForSpecficTime(Constants.TWO_SECOND);
CommonUtils.forceClick(driver, webElementAddTocart1);
		//getWebElementAddTocart1().click();
		
	}
	
	public void viewCart() {
		
		CommonUtils.waitForSpecficTime(Constants.TWO_SECOND);

	//	CommonUtils.forceClick(driver, getWebElementViewCart());

	//	CommonUtils.waitForSpecficTime(Constants.TWO_SECOND);

		getWebElementViewCart().click();
	}
	
	public void checkOut() {
		CommonUtils.waitForSpecficTime(Constants.TWO_SECOND);
		CommonUtils.forceClick(driver, getWebElementCheckout());

	//	getWebElementCheckout().click();
	}
	
	public void registerNewUser(HashMap<String ,String> userDetails) {
		//HashMap<String ,String> userDetails
		getWebElementRegesterUserButton().click();
		getWebElementUserName().sendKeys(userDetails.get(Constants.USER_NAME));
		getWebElementUserEmail().sendKeys(CommonUtils.generateRandomEmail());
		//getWebElementUserName().sendKeys(userDetails.get(userDetails));
		getWebElementSignupButton().click();
		getWebElementUserPassword().sendKeys(userDetails.get(Constants.USER_PASSWORD));
		getWebElementUserFirstName().sendKeys(userDetails.get(Constants.USER_FIRST_NAME));
		getWebElementUserLastName().sendKeys(userDetails.get(Constants.USER_LAST_NAME));
		getWebElementUserAdress().sendKeys(userDetails.get(Constants.USER_ADDRESS));
		getWebElementUserSate().sendKeys(userDetails.get(Constants.USER_STATE));
		getWebElementUserCity().sendKeys(userDetails.get(Constants.USER_CITY));
		getWebElementUserZipCode().sendKeys(CommonUtils.generateRandomNumber(4));
		getWebElementUserMobileNumber().sendKeys(CommonUtils.generateRandomNumber(10));
		getWebElementCreateAcount().click();




		
	}
	  public  HashMap<String, String> setUserData() {
		  HashMap<String ,String> setuserDetails= new HashMap<String, String>();
		  setuserDetails.put(Constants.USER_NAME, "rohit");
		  setuserDetails.put(Constants.USER_EMAIL, "test@gmail.com");
		  setuserDetails.put(Constants.USER_PASSWORD, "Nov@1122!0091");
		  setuserDetails.put(Constants.USER_FIRST_NAME, "rohit");
		  setuserDetails.put(Constants.USER_LAST_NAME, "singh");
		  setuserDetails.put(Constants.USER_ADDRESS, "noida");
		  setuserDetails.put(Constants.USER_STATE, "UP");
		  setuserDetails.put(Constants.USER_CITY, "noida");
		  setuserDetails.put(Constants.USER_ZIP_CODE, "541234");
		  setuserDetails.put(Constants.USER_MOBILE, "7643551111");
		  
		  return setuserDetails;

	    	
	    }
	  
		public void clickOnContinueLink() {
			CommonUtils.waitForSpecficTime(Constants.TWO_SECOND);
			CommonUtils.forceClick(driver, getWebElementContinue());

		//	getWebElementCheckout().click();
		}
		
		public void clickOnCart() {
			
			CommonUtils.forceClick(driver, getWebElementCart());

		//	getWebElementCheckout().click();
		}
		
		public void clickOnPlaceorderButton() {
			
			CommonUtils.forceClick(driver, getWebElementPlaceOrder());

		//	getWebElementCheckout().click();
		}
		
		public void completePayment(HashMap<String ,String> userDetails) {
			
			getWebElementNameOnCard().sendKeys(userDetails.get(Constants.USER_FIRST_NAME));
			getWebElementCardNumber().sendKeys(CommonUtils.generateRandomNumber(16));
			getWebElementCardCvv().sendKeys(CommonUtils.generateRandomNumber(3));
			getWebElementCardExpiryMonth().sendKeys(CommonUtils.generateRandomDate(300, "MM"));
			getWebElementCardExpiryYear().sendKeys(CommonUtils.generateRandomDate(300, "yyyy"));
			CommonUtils.forceClick(driver, getWebElementPayConfirm());

		//	getWebElementCheckout().click();
		}
		
		public void verifyOrderPlace() {
			CommonUtils.waitForSpecficTime(Constants.TWO_SECOND);

			 
			softAssert.assertEquals(getWebElementOrderPlacetext().getText(), orderPlace,"somthing went wrong");

		//	getWebElementCheckout().click();
		}
		
		public void downloadInvoice() {
			
			CommonUtils.forceClick(driver, getWebElementDownloadInvoice());

		//	getWebElementCheckout().click();
		}
		
		public void logoutFormApplication() {
			
			CommonUtils.forceClick(driver, getWebElementLogout());

		//	getWebElementCheckout().click();
		}
	
}
