package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import testbase.TestBase;

public class AddItemIInCartTest extends TestBase {
	private String quentity ="2";

	
	@Test
	public void addToCartTest() throws IOException {
		Reporter.log("Selecting women dress from the option.");
		
		landingPage.selectWomenDress(quentity);
		
		Reporter.log("Click on continue shoping button.");
		landingPage.clickOnContinuteShoping();
		
		Reporter.log("Click on product option.");
		landingPage.clickOnProductOption();
		
		Reporter.log("Select product babyhug.");
		landingPage.selectBabyHug();
		
		Reporter.log("Click on view cart.");
		landingPage.viewCart();
		
		Reporter.log("Click on checkout.");
		landingPage.checkOut();
		
		Reporter.log("Register a new user with details.");
		landingPage.registerNewUser(landingPage.setUserData());
		
		Reporter.log("Clicked on continue link.");
		landingPage.clickOnContinueLink();
		
		Reporter.log("Click on cart.");
		landingPage.clickOnCart();
		
		Reporter.log("Click on checkout.");
		landingPage.checkOut();
		
		Reporter.log("click on oder place button.");
		landingPage.clickOnPlaceorderButton();
		
		Reporter.log("complete the payment.");
		landingPage.completePayment(landingPage.setUserData());
		
		Reporter.log("Verifing oreder is placed or not.");
		landingPage.verifyOrderPlace();
		
		Reporter.log("Download invoice.");
		landingPage.downloadInvoice();
		
		Reporter.log("Logout from application.");
		landingPage.logoutFormApplication();
		
	}

}
