package scripts;

import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_OLD_SignUpPage extends BaseClass {
	
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
			  
			  WebElement firstnametb = driver.findElement(By.id("firstname"));
			  firstnametb.sendKeys("Sohel");
			  
			  WebElement lastnametb = driver.findElement(By.id("lastname"));
			  lastnametb.sendKeys("Hakeem");
			  
			  WebElement emailtb = driver.findElement(By.id("email"));
			  emailtb.sendKeys("sohel@peoplelinkvcgmail.com");
			  
			  WebElement country= driver.findElement(By.id("country"));
			   country.click();
			   Robot r = new Robot();
			   r.keyPress(KeyEvent.VK_I);
			   r.keyPress(KeyEvent.VK_DOWN);
			   r.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(2000);
			   
			   WebElement phonetb= driver.findElement(By.id("phone"));
			   phonetb.sendKeys("8088229102");
				//Thread.sleep(3000);
				
			   WebElement passwordtb= driver.findElement(By.id("password"));
			   passwordtb.sendKeys("Hyderabad@123");
				//Thread.sleep(3000);
				
			   WebElement confirmPasswordtb= driver.findElement(By.id("confirmPassword"));
			   confirmPasswordtb.sendKeys("Hyderabad@123");
				//Thread.sleep(3000);
			   
			   WebElement signUpbtn = driver.findElement(By.xpath("//div[@class='flexCol hmBtnBox']"));
				signUpbtn.click();
				//Thread.sleep(3000);
				//for first time SignUp with valid details
/*				String actualUrl="https://staging.invc.vc/sign-up";
				String expectedUrl= driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl,actualUrl);*/
				
				//When entering all valid details but account already exists.
//				String expectedErrorMsg = "An account with the given email already exists.";
//				 WebElement exp = driver.findElement(By.xpath("//div[@class='errorMsgBlock']"));
//			        String actualErrorMsg = exp.getText();
			        		
		}
		
//Verifying signUp Page with invalid FirstName-only Numbers(676)
		@Test
		public void tc3() throws InterruptedException, AWTException {
			 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
			  signup.click();
			  
			  WebElement firstnametb = driver.findElement(By.id("firstname"));
			  firstnametb.sendKeys("676");
			  
			  WebElement lastnametb = driver.findElement(By.id("lastname"));
			  lastnametb.sendKeys("Hakeem");
			  
			  WebElement emailtb = driver.findElement(By.id("email"));
			  emailtb.sendKeys("sohel@peoplelinkvc.com");
			  
			  WebElement country= driver.findElement(By.id("country"));
			   country.click();
			   Robot r = new Robot();
			   r.keyPress(KeyEvent.VK_I);
			   r.keyPress(KeyEvent.VK_DOWN);
			   r.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(2000);
			   
			   WebElement phonetb= driver.findElement(By.id("phone"));
			   phonetb.sendKeys("8088229102");
				
			   WebElement passwordtb= driver.findElement(By.id("password"));
			   passwordtb.sendKeys("Hyderabad@123");
				
			   WebElement confirmPasswordtb= driver.findElement(By.id("confirmPassword"));
			   confirmPasswordtb.sendKeys("Hyderabad@123");
			   
//				String expectedErrorMsg = "First name should be the alphabets only";
//				 WebElement exp = driver.findElement(By.id("txtFirstName-error"));
//			        String actualErrorMsg = exp.getText();
//			        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
			        		
		}
//Verifying signUp Page with invalid Email-(sohel@peoplelinkvc)
				@Test
				public void tc4() throws InterruptedException, AWTException {
					 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
					  signup.click();
					  
					  WebElement firstnametb = driver.findElement(By.id("firstname"));
					  firstnametb.sendKeys("sohel");
					  
					  WebElement lastnametb = driver.findElement(By.id("lastname"));
					  lastnametb.sendKeys("Hakeem");
					  
					  WebElement emailtb = driver.findElement(By.id("email"));
					  emailtb.sendKeys("sohel@peoplelinkvc");
					  
//					  String expectedErrorMsg = "Email should be in a proper format";
//						 WebElement exp = driver.findElement(By.id("txtEmail-error"));
//					        String actualErrorMsg = exp.getText();
		
				}
				
//Verifying signUp Page without selecting country dropdown
				@Test
				public void tc5() throws InterruptedException, AWTException {
					 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
					  signup.click();
					  
					  WebElement firstnametb = driver.findElement(By.id("firstname"));
					  firstnametb.sendKeys("sohel");
					  
					  WebElement lastnametb = driver.findElement(By.id("lastname"));
					  lastnametb.sendKeys("Hakeem");
					  
					  WebElement emailtb = driver.findElement(By.id("email"));
					  emailtb.sendKeys("sohel@peoplelinkvc.com");
					  
					  WebElement phonetb= driver.findElement(By.id("phone"));
					   phonetb.sendKeys("8088229102");
					  
					  String expectedErrorMsg = "Please enter proper country code ";
						 WebElement exp = driver.findElement(By.id("txtCountry-error"));
					        String actualErrorMsg = exp.getText();
					        Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
		
				}
				
//Verifying signUp Page with invalid PHONE NUMBER-(80)
				@Test
				public void tc6() throws InterruptedException, AWTException {
					 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
					  signup.click();
					  
					  WebElement firstnametb = driver.findElement(By.id("firstname"));
					  firstnametb.sendKeys("sohel");
					  
					  WebElement lastnametb = driver.findElement(By.id("lastname"));
					  lastnametb.sendKeys("Hakeem");
					  
					  WebElement emailtb = driver.findElement(By.id("email"));
					  emailtb.sendKeys("sohel@peoplelinkvc.com");
					  
					  WebElement country= driver.findElement(By.id("country"));
					   country.click();
					   Robot r = new Robot();
					   r.keyPress(KeyEvent.VK_I);
					   r.keyPress(KeyEvent.VK_DOWN);
					   r.keyPress(KeyEvent.VK_ENTER);
						Thread.sleep(2000);
					   
					   WebElement phonetb= driver.findElement(By.id("phone"));
					   phonetb.sendKeys("80");
						
					   WebElement passwordtb= driver.findElement(By.id("password"));
					   passwordtb.sendKeys("Hyderabad@123");
					  
//					  String expectedErrorMsg = "Please enter the valid phone number";
//						 WebElement exp = driver.findElement(By.id("txtPhone-error"));
//					        String actualErrorMsg = exp.getText();

				}
				
//Verifying signUp Page with invalid PHONE NUMBER with special characters-(+918088229102)
				@Test
				public void tc7() throws InterruptedException, AWTException {
					 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
					  signup.click();
					  
					  WebElement firstnametb = driver.findElement(By.id("firstname"));
					  firstnametb.sendKeys("sohel");
					  
					  WebElement lastnametb = driver.findElement(By.id("lastname"));
					  lastnametb.sendKeys("Hakeem");
					  
					  WebElement emailtb = driver.findElement(By.id("email"));
					  emailtb.sendKeys("sohel@peoplelinkvc.com");
					  
					  WebElement country= driver.findElement(By.id("country"));
					   country.click();
					   Robot r = new Robot();
					   r.keyPress(KeyEvent.VK_I);
					   r.keyPress(KeyEvent.VK_DOWN);
					   r.keyPress(KeyEvent.VK_ENTER);
						Thread.sleep(2000);
					   
					   WebElement phonetb= driver.findElement(By.id("phone"));
					   phonetb.sendKeys("+918088229102");
						
					   WebElement passwordtb= driver.findElement(By.id("password"));
					   passwordtb.sendKeys("Hyderabad@123");
					  
//					  String expectedErrorMsg = "Please enter the valid phone number";
//						 WebElement exp = driver.findElement(By.id("txtPhone-error"));
//					        String actualErrorMsg = exp.getText();

				}
				
//Verifying signUp Page with invalid password with special less than 8 characters(Hyderabad)
				@Test
				public void tc8() throws InterruptedException, AWTException {
					 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
					  signup.click();
					  
					  WebElement firstnametb = driver.findElement(By.id("firstname"));
					  firstnametb.sendKeys("sohel");
					  
					  WebElement lastnametb = driver.findElement(By.id("lastname"));
					  lastnametb.sendKeys("Hakeem");
					  
					  WebElement emailtb = driver.findElement(By.id("email"));
					  emailtb.sendKeys("sohel@peoplelinkvc.com");
					  
					  WebElement country= driver.findElement(By.id("country"));
					   country.click();
					   Robot r = new Robot();
					   r.keyPress(KeyEvent.VK_I);
					   r.keyPress(KeyEvent.VK_DOWN);
					   r.keyPress(KeyEvent.VK_ENTER);
						Thread.sleep(2000);
					   
					   WebElement phonetb= driver.findElement(By.id("phone"));
					   phonetb.sendKeys("+918088229102");
						
					   WebElement passwordtb= driver.findElement(By.id("password"));
					   passwordtb.sendKeys("Hyderabad");
					   
					   WebElement confirmPasswordtb= driver.findElement(By.id("confirmPassword"));
					   confirmPasswordtb.sendKeys("Hyderabad");
					  
//					  String expectedErrorMsg = "Password should be eight characters long and combination one uppercase, one lowercase, one digit and one special character";
//						 WebElement exp = driver.findElement(By.id("txtPassword-error"));
//					        String actualErrorMsg = exp.getText();

				}
				
//Verifying signUp Page with valid password and invalid confirm Password with special less than 8 characters(Hyderabad)
				@Test
				public void tc9() throws InterruptedException, AWTException {
					 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
					  signup.click();
					  
					  WebElement firstnametb = driver.findElement(By.id("firstname"));
					  firstnametb.sendKeys("sohel");
					  
					  WebElement lastnametb = driver.findElement(By.id("lastname"));
					  lastnametb.sendKeys("Hakeem");
					  
					  WebElement emailtb = driver.findElement(By.id("email"));
					  emailtb.sendKeys("sohel@peoplelinkvc.com");
					  
					  WebElement country= driver.findElement(By.id("country"));
					   country.click();
					   Robot r = new Robot();
					   r.keyPress(KeyEvent.VK_I);
					   r.keyPress(KeyEvent.VK_DOWN);
					   r.keyPress(KeyEvent.VK_ENTER);
						Thread.sleep(2000);
					   
					   WebElement phonetb= driver.findElement(By.id("phone"));
					   phonetb.sendKeys("+918088229102");
						
					   WebElement passwordtb= driver.findElement(By.id("password"));
					   passwordtb.sendKeys("Hyderabad@123");
					   
					   WebElement confirmPasswordtb= driver.findElement(By.id("confirmPassword"));
					   confirmPasswordtb.sendKeys("Hyderabad@13");
					  
//					  String expectedErrorMsg = "Confirm password should match the above password";
//						 WebElement exp = driver.findElement(By.id("txtConfirmPwd-error"));
//					        String actualErrorMsg = exp.getText();

				}
				
//Verifying signUp Page with valid details with different mail(sohelhakeem@gmail.com)
				@Test
				public void tc10() throws InterruptedException, AWTException {
					 WebElement signup =driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
					  signup.click();
					  
					  WebElement firstnametb = driver.findElement(By.id("firstname"));
					  firstnametb.sendKeys("Sohel");
					  
					  WebElement lastnametb = driver.findElement(By.id("lastname"));
					  lastnametb.sendKeys("Hakeem");
					  
					  WebElement emailtb = driver.findElement(By.id("email"));
					  emailtb.sendKeys("sohelhakeem@gmail.com");
					  
					  WebElement country= driver.findElement(By.id("country"));
					   country.click();
					   Robot r = new Robot();
					   r.keyPress(KeyEvent.VK_I);
					   r.keyPress(KeyEvent.VK_DOWN);
					   r.keyPress(KeyEvent.VK_ENTER);
						Thread.sleep(2000);
					   
					   WebElement phonetb= driver.findElement(By.id("phone"));
					   phonetb.sendKeys("8088229102");
						//Thread.sleep(3000);
						
					   WebElement passwordtb= driver.findElement(By.id("password"));
					   passwordtb.sendKeys("Hyderabad@123");
						Thread.sleep(3000);
						
					   WebElement confirmPasswordtb= driver.findElement(By.id("confirmPassword"));
					   confirmPasswordtb.sendKeys("Hyderabad@123");
						//Thread.sleep(3000);
					   
					   WebElement signUpbtn = driver.findElement(By.xpath("//div[@class='flexCol hmBtnBox']"));
						signUpbtn.click();
						//Thread.sleep(3000);
						//for first time SignUp with valid details
		/*				String actualUrl="https://staging.invc.vc/sign-up";
						String expectedUrl= driver.getCurrentUrl();
						Assert.assertEquals(expectedUrl,actualUrl);*/
						
						//When entering all valid details but account already exists.
//						String expectedErrorMsg = "An account with the given email already exists.";
//						 WebElement exp = driver.findElement(By.xpath("//div[@class='errorMsgBlock']"));
//					        String actualErrorMsg = exp.getText();
					        		
				}
				
				
				
				
	}
	



