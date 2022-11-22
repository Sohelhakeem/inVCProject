package scripts;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_SignUp_Page extends BaseClass {
	//Verifying the elements on forgot SignUpPage
	
		@Test
		public void tc1() throws InterruptedException {
			
			WebElement signUpLink = driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
			signUpLink.click();
			
			WebElement invclogo = driver.findElement(By.xpath("//div[@class='flexInline']"));
			invclogo.isDisplayed();
			
			WebElement languagedd = driver.findElement(By.xpath("(//div[@class='flexInline'])[2]"));
			languagedd.isDisplayed();
			
			WebElement signUpText = driver.findElement(By.xpath("//h1[@class='hmTitleTxt txtCenter']"));
			signUpText.isDisplayed();
			
			WebElement signUpbtn = driver.findElement(By.xpath("//div[@class='flexCol hmBtnBox']"));
			signUpbtn.isDisplayed();
			
			WebElement loginLink = driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
			loginLink.isDisplayed();
			
			WebElement termsandconditionlink = driver.findElement(By.xpath("//a[@target='_blank']"));
			termsandconditionlink.isDisplayed();
			
		}
		
		//Verifying signUp Page with valid details
				@Test
				public void tc2() throws InterruptedException, AWTException {
					 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
					  signup.click();
					  
					  WebElement fullnametb = driver.findElement(By.xpath("//input[@id='fullname']"));
					  fullnametb.sendKeys("Sohel Siraj Hakeem");
					  
					  WebElement emailtb = driver.findElement(By.xpath("//input[@id='email']"));
					  emailtb.sendKeys("sohel@peoplelinkvcgmail.com");
						
					   WebElement passwordtb= driver.findElement(By.id("password"));
					   passwordtb.sendKeys("Hyderabad@123");
						//Thread.sleep(3000);
						
					   WebElement confirmPasswordtb= driver.findElement(By.id("confirmPassword"));
					   confirmPasswordtb.sendKeys("Hyderabad@123");
						//Thread.sleep(3000);
					   
					   WebElement signUpbtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
						signUpbtn.click();
						
						//When entering all valid details but account already exists.
						String expectedErrorMsg = "An account with the given email already exists.";
						 WebElement exp = driver.findElement(By.xpath("//div[@class='errorMsgBlock']"));
					        String actualErrorMsg = exp.getText();
					  Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
					        		
				}
				
				//Verifying signUp Page with invalid FirstName-only Numbers(676HArry)
				@Test
				public void tc3() throws InterruptedException, AWTException {
					 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
					  signup.click();
					  
					  WebElement fullnametb = driver.findElement(By.xpath("//input[@id='fullname']"));
					  fullnametb.sendKeys("676HArry");
					  
					  WebElement emailtb = driver.findElement(By.xpath("//input[@id='email']"));
					  emailtb.sendKeys("sohel@peoplelinkvcgmail.com");
						
					   WebElement passwordtb= driver.findElement(By.id("password"));
					   passwordtb.sendKeys("Hyderabad@123");
						//Thread.sleep(3000);
						
					   WebElement confirmPasswordtb= driver.findElement(By.id("confirmPassword"));
					   confirmPasswordtb.sendKeys("Hyderabad@123");
						//Thread.sleep(3000);
					   
					   WebElement signUpbtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
						signUpbtn.click();
						
						//When entering all valid details but account already exists.
						String expectedErrorMsg = "Full name should be the alphabets only";
						 WebElement exp = driver.findElement(By.xpath("//p[@id='txtFirstName-error']"));
					        String actualErrorMsg = exp.getText();
					  Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
					        		
				}
				//Verifying signUp Page with invalid Email-(sohel@peoplelinkvc)
				@Test
				public void tc4() throws InterruptedException, AWTException {
					 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
					  signup.click();
					  
					  WebElement fullnametb = driver.findElement(By.xpath("//input[@id='fullname']"));
					  fullnametb.sendKeys("Sohel Siraj Hakeem");
					  
					  WebElement emailtb = driver.findElement(By.xpath("//input[@id='email']"));
					  emailtb.sendKeys("sohel@peoplelinkvc");
						
					   WebElement passwordtb= driver.findElement(By.id("password"));
					   passwordtb.sendKeys("Hyderabad@123");
						//Thread.sleep(3000);
						
					   WebElement confirmPasswordtb= driver.findElement(By.id("confirmPassword"));
					   confirmPasswordtb.sendKeys("Hyderabad@123");
						//Thread.sleep(3000);
					   
					   WebElement signUpbtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
						signUpbtn.click();
						
						//When entering all valid details but account already exists.
						String expectedErrorMsg = "Email should be in a proper format";
						 WebElement exp = driver.findElement(By.xpath("//p[@id='txtEmail-error']"));
					        String actualErrorMsg = exp.getText();
					  Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
					        		
				}
				
	//Verifying signUp Page with invalid password with special less than 8 characters(Hyderabad)
				@Test
				public void tc5() throws InterruptedException, AWTException {
					 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
					  signup.click();
					  
					  WebElement fullnametb = driver.findElement(By.xpath("//input[@id='fullname']"));
					  fullnametb.sendKeys("Sohel Siraj Hakeem");
					  
					  WebElement emailtb = driver.findElement(By.xpath("//input[@id='email']"));
					  emailtb.sendKeys("sohel@peoplelinkvc.com");
						
					   WebElement passwordtb= driver.findElement(By.id("password"));
					   passwordtb.sendKeys("Hyderabad");
						//Thread.sleep(3000);
						
					   WebElement confirmPasswordtb= driver.findElement(By.id("confirmPassword"));
					   confirmPasswordtb.sendKeys("Hyderabad");
						//Thread.sleep(3000);
					   
					   WebElement signUpbtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
						signUpbtn.click();
						
						//When entering all valid details but account already exists.
						String expectedErrorMsg = "Password should be eight characters long and combination one uppercase, one lowercase, one digit and one special character";
						 WebElement exp = driver.findElement(By.xpath("//p[@id='txtPassword-error']"));
					        String actualErrorMsg = exp.getText();
					  Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
					        		
				}
	//Verifying signUp Page with valid password and invalid confirm Password with special less than 8 characters(Hyderabad)
				@Test
				public void tc6() throws InterruptedException, AWTException {
					 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
					  signup.click();
					  
					  WebElement fullnametb = driver.findElement(By.xpath("//input[@id='fullname']"));
					  fullnametb.sendKeys("Sohel Siraj Hakeem");
					  
					  WebElement emailtb = driver.findElement(By.xpath("//input[@id='email']"));
					  emailtb.sendKeys("sohel@peoplelinkvc.com");
						
					   WebElement passwordtb= driver.findElement(By.id("password"));
					   passwordtb.sendKeys("Hyderabad@123");
						//Thread.sleep(3000);
						
					   WebElement confirmPasswordtb= driver.findElement(By.id("confirmPassword"));
					   confirmPasswordtb.sendKeys("Hyderabad");
						//Thread.sleep(3000);
					   
					   WebElement signUpbtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
						signUpbtn.click();
						
						//When entering all valid details but account already exists.
						String expectedErrorMsg = "Confirm password should match the above password";
						 WebElement exp = driver.findElement(By.xpath("//p[@id='txtConfirmPwd-error']"));
					        String actualErrorMsg = exp.getText();
					  Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
					        		
				}

}
