package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import constants.Constants;
import testbase.TestBase;

public class CommonUtils extends TestBase{

	WebDriver driver;

	
	public static void waitForSpecficTime(int time) {
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the element
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    
    public static void forceClick(WebDriver driver, WebElement element) {
        try {
            waitForSpecficTime(200);
            element.click();
        } catch (Exception e) {
            e.printStackTrace(); // Handle or log the exception as needed

            // Check if the exception is of type ElementClickInterceptedException
            if (e instanceof org.openqa.selenium.ElementClickInterceptedException) {
                try {
                    waitForSpecficTime(200);
                    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
                    jsExecutor.executeScript("arguments[0].click();", element);
                } catch (Exception jsException) {
                    element.click();
                    jsException.printStackTrace(); // Handle or log the JavaScript exception as needed
                }
            }
        }
  
    }
    public static String generateRandomEmail() {
    	
    	
    	
          StringBuilder randomString = new StringBuilder();
          Random random = new Random();

          for (int i = 0; i < 8; i++) {
              int index = random.nextInt(Constants.characters.length());
              randomString.append(Constants.characters.charAt(index));
          }
        String[] domains = {"gmail.com", "yahoo.com", "outlook.com", "example.com"}; // Add more domains if needed
        String randomUsername = randomString.toString(); // Adjust the length of the username as needed
        String randomDomain = domains[new Random().nextInt(domains.length)];
        return randomUsername + "@" + randomDomain;
    }    
    
    public static String generateRandomNumber(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }

       
        Random random = new Random();

        
        StringBuilder randomStringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int digit = random.nextInt(10); 
            randomStringBuilder.append(digit);
        }
        return randomStringBuilder.toString();}
    
    
    public static String generateRandomDate(int varianceInDays, String dateFormat) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Generate a random number within the specified variance
        Random random = new Random();
        int randomDays = random.nextInt(varianceInDays * 2 + 1) - varianceInDays; 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);

        // Calculate the random date
        return   formatter.format(currentDate.plusDays(randomDays)) ;
    }

}
    

