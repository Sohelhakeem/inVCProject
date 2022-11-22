package scripts;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_ContactInfo extends BaseClass {
	//Verifying the Functionality inVC ContactInfo - ContactInformation Edit Button . 
	@Test
	public void tc1() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		//Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
		//Thread.sleep(1000);
		
		WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
		myProfile.click();
		Thread.sleep(500);
		WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
		contactInfo.click();
		Thread.sleep(500);
		
		WebElement contactInfoEditBtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		contactInfoEditBtn.click();
		
		WebElement addressTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		addressTf.click();
		
	//Thread.sleep(3000);
		String expectedTextMsg = "Contact Information";
		 WebElement exp = driver.findElement(By.xpath("//div[@class='dialogHeaderText']"));
	        String actualTextMsg = exp.getText();
	        Assert.assertEquals(actualTextMsg,expectedTextMsg);
		}
	
	//Verifying the Functionality inVC ContactInfo - ContactInformation By empty TextFields. 
	@Test
	public void tc2() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		//Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
		//Thread.sleep(1000);
		
		WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
		myProfile.click();
		Thread.sleep(500);
		WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
		contactInfo.click();
		Thread.sleep(500);
		
		WebElement contactInfoEditBtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		contactInfoEditBtn.click();
		
		WebElement addressTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
				addressTf.clear();
				
				WebElement citytownTf = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
				citytownTf.clear();
				
				WebElement zipTf = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[3]"));
				zipTf.sendKeys("590016");
				
				WebElement landmarkTf = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[4]"));
				landmarkTf.sendKeys("RamteerthNagar International Cricket Stadium");
				
				WebElement savebtn = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
				savebtn.click();
	
				String actualUrl ="https://staging.invc.vc/myprofile";
				
				String expectedUrl = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl, expectedUrl);
		}
	
	//Verifying the Functionality inVC ContactInfo - ContactInformation By entering all possible Inputs. 
	@Test
	public void tc3() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		//Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
		//Thread.sleep(1000);
		
		WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
		myProfile.click();
		Thread.sleep(500);
		WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
		contactInfo.click();
		Thread.sleep(500);
		
		WebElement contactInfoEditBtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		contactInfoEditBtn.click();
		
		WebElement addressTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
				addressTf.sendKeys("RamteerthNagar");
				
				WebElement citytownTf = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
				citytownTf.sendKeys("Belagavi");
				
				WebElement zipTf = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[3]"));
				zipTf.sendKeys("590016");
				
				WebElement landmarkTf = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[4]"));
				landmarkTf.sendKeys("RamteerthNagar International Cricket Stadium");
				
				WebElement savebtn = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
				savebtn.click();
	
				String actualUrl ="https://staging.invc.vc/myprofile";
				
				String expectedUrl = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl, expectedUrl);
		}
	
	//Verifying the Functionality inVC ContactInfo -WebsiteLink Add Btn. 
	@Test
	public void tc4() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		//Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
		//Thread.sleep(1000);
		
		WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
		myProfile.click();
		Thread.sleep(500);
		WebElement contactInfo =driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
		contactInfo.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement websiteLinkAddBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		js.executeScript("arguments[0].scrollIntoView();",websiteLinkAddBtn);
		Thread.sleep(500);
		websiteLinkAddBtn.click();
		
		WebElement websiteTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		websiteTf.click();
		
		String actualTextMsg = "Website";
		WebElement exp = driver.findElement(By.xpath("//div[@class='dialogHeaderText']"));
		String expextedTextMsg = exp.getText();
		Assert.assertEquals(actualTextMsg, expextedTextMsg);
		}
	
	//Verifying the Functionality inVC ContactInfo -WebsiteLink with entering validDetails TextField and click on Save Button.  
	@Test
	public void tc5() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
		Thread.sleep(1000);
		
		WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
		myProfile.click();
		Thread.sleep(500);
		WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
		contactInfo.click();
		Thread.sleep(500);
		
		WebElement websiteLinkAddBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		websiteLinkAddBtn.click();

		WebElement websiteTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		websiteTf.sendKeys("https//:SohelHakeem.com");
		
		WebElement websiteSaveBtn = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
		websiteSaveBtn.click();
		
		String actualUrl ="https://staging.invc.vc/myprofile";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
		}
	//Verifying the Functionality inVC ContactInfo -WebsiteLink with Empty TextField. 
		@Test
		public void tc6() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			Thread.sleep(1000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			
			WebElement contactInfo =driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
			contactInfo.click();
			
			WebElement websiteLinkAddBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
			websiteLinkAddBtn.click();

			WebElement websiteTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			websiteTf.clear();
			
			//Thread.sleep(3000);
			WebElement websiteSaveBtn = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
			websiteSaveBtn.click();
			
			Thread.sleep(3000);
			String ExpectedErrorMsg = "Please Enter the Website name";
			WebElement exp = driver.findElement(By.xpath("//p[@class='MuiFormHelperText-root Mui-error Mui-required MuiFormHelperText-marginDense']"));
			String actualErrorMsg =  exp.getText();
			Assert.assertEquals(actualErrorMsg, ExpectedErrorMsg);
			
			}

	//Verifying the Functionality inVC ContactInfo -WebsiteLink with entering validDetails TextField and click on Cancel Button.  
		@Test
		public void tc7() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			Thread.sleep(1000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			Thread.sleep(500);
			WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
			contactInfo.click();
			Thread.sleep(500);
			
			//Thread.sleep(3000);
			
			WebElement websiteLinkAddBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
			websiteLinkAddBtn.click();

			WebElement websiteTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			websiteTf.sendKeys("https//:SohelHakeem.com");
			
			WebElement websiteCancelBtn = driver.findElement(By.xpath("//span[normalize-space()='CANCEL']"));
			websiteCancelBtn.click();
			
			String actualUrl ="https://staging.invc.vc/myprofile";
			String expectedUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			
			}

	//Verifying the Functionality inVC ContactInfo -WebsiteLink with Add Button. 
		@Test
		public void tc8() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			Thread.sleep(1000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			Thread.sleep(500);
			WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
			contactInfo.click();
			Thread.sleep(500);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			
			//Thread.sleep(5000);
			
			WebElement websiteLinkAddBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
			websiteLinkAddBtn.click();		
			
			//Thread.sleep(3000);
			WebElement websiteTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			websiteTf.clear();
			websiteTf.sendKeys("https//:SohelHakeem.com");
			
			WebElement websiteSaveBtn = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
			websiteSaveBtn.click();
			String actualUrl ="https://staging.invc.vc/myprofile";
			String expectedUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			
			}
		
		//Verifying the Functionality inVC ContactInfo -SocialLink with Empty TextField. 
		@Test
		public void tc9() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			Thread.sleep(1000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			Thread.sleep(500);
			WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
			contactInfo.click();
			Thread.sleep(500);
			
			WebElement socialLinkAddBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[3]"));
			socialLinkAddBtn.click();

			WebElement socialLinkTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			socialLinkTf.clear();
			
			Thread.sleep(3000);
			WebElement socialSaveBtn = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
			socialSaveBtn.click();
			
			Thread.sleep(3000);
			String ExpectedErrorMsg = "Please Enter the Website name";
			WebElement exp = driver.findElement(By.xpath("//p[@class='MuiFormHelperText-root Mui-error Mui-required MuiFormHelperText-marginDense']"));
			String actualErrorMsg =  exp.getText();
			Assert.assertEquals(actualErrorMsg, ExpectedErrorMsg);
			
			}

	//Verifying the Functionality inVC ContactInfo -SocialLink with entering validDetails TextField and click on Cancel Button.  
		@Test
		public void tc10() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			Thread.sleep(1000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			Thread.sleep(500);
			WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
			contactInfo.click();
			Thread.sleep(500);
			
			//Thread.sleep(3000);
			
			WebElement socialLinkAddBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[3]"));
			socialLinkAddBtn.click();
			
			WebElement socialLinkTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			socialLinkTf.sendKeys("https//:SohelHakeem.com");
			
			
			WebElement socialLinkCancelBtn = driver.findElement(By.xpath("//span[normalize-space()='CANCEL']"));
			socialLinkCancelBtn.click();
			
			String actualUrl ="https://staging.invc.vc/myprofile";
			String expectedUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			
			}

	//Verifying the Functionality inVC ContactInfo -Social Link with Add Button. 
		@Test
		public void tc11() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			Thread.sleep(1000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			Thread.sleep(500);
			WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
			contactInfo.click();
			Thread.sleep(500);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			
			//Thread.sleep(5000);
			
			WebElement socialLinkAddBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[3]"));
			socialLinkAddBtn.click();
			
			//Thread.sleep(3000);
			WebElement socialLinkTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			socialLinkTf.sendKeys("https//:SohelHakeem.com");
			
			WebElement socialSaveBtn = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
			socialSaveBtn.click();
			
			String actualUrl ="https://staging.invc.vc/myprofile";
			String expectedUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			
			}
		
		//Verifying the Functionality inVC ContactInfo -SocialLink Delete Button. 
			@Test
			public void tc12() throws InterruptedException, AWTException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				//Thread.sleep(2000);
				
				WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
				avatarDroDwn.click();
//				Thread.sleep(1000);
				
				WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
				myProfile.click();
				Thread.sleep(500);
				WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
				contactInfo.click();
				Thread.sleep(500);
				
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,450)", "");
//				Thread.sleep(3000);
				/*
				 * WebElement socialLinkDeleteBtn =
				 * driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[3]"));
				 * socialLinkDeleteBtn.click(); Thread.sleep(3000); WebElement
				 * socialLinkDeletecnfmBtn =
				 * driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[5]"));
				 * socialLinkDeletecnfmBtn.click(); Thread.sleep(3000); Robot r = new Robot();
				 * r.keyPress(KeyEvent.VK_ENTER);
				 */
				Thread.sleep(200);
				String actualUrl ="https://staging.invc.vc/myprofile";
				String expectedUrl = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl, expectedUrl);
				
			}
			
			//Verifying the Functionality inVC ContactInfo -BasicInformation EditButton. 
			@Test
			public void tc13() throws InterruptedException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				//Thread.sleep(2000);
				
				WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
				avatarDroDwn.click();
				//Thread.sleep(1000);
				
				WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
				myProfile.click();
				Thread.sleep(500);
				WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
				contactInfo.click();
				Thread.sleep(500);
				JavascriptExecutor js=(JavascriptExecutor)driver;
								
				WebElement basicInfoEditBtn = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-outlinedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
				js.executeScript("arguments[0].scrollIntoView();", basicInfoEditBtn);
				Thread.sleep(500);
				basicInfoEditBtn.click();

//				Thread.sleep(3000);
				WebElement BasicInformationSaveBtn = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
				BasicInformationSaveBtn.click();
				
						
				
//				Thread.sleep(3000);
				
				String actualUrl ="https://staging.invc.vc/myprofile";
				String expectedUrl = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl, expectedUrl);
			}
			
			
			//Verifying the Functionality inVC ContactInfo -BasicInformation Gender Radio button. 
			@Test
			public void tc14() throws InterruptedException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				//Thread.sleep(2000);
				
				WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
				avatarDroDwn.click();
				//Thread.sleep(1000);
				
				WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
				myProfile.click();
				Thread.sleep(500);
				WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
				contactInfo.click();
				Thread.sleep(500);
				JavascriptExecutor js=(JavascriptExecutor)driver;
								
				WebElement basicInfoEditBtn = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-outlinedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
				js.executeScript("arguments[0].scrollIntoView();", basicInfoEditBtn);
				Thread.sleep(500);
				basicInfoEditBtn.click();
				
				WebElement genderRBtn = driver.findElement(By.name("gender1"));
				genderRBtn.click();
				
				//Thread.sleep(3000);
				WebElement BasicInformationSaveBtn = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
				BasicInformationSaveBtn.click();
				
				//Thread.sleep(3000);
				
				String actualUrl ="https://staging.invc.vc/myprofile";
				String expectedUrl = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl, expectedUrl);
			}
			
			
			//Verifying the Functionality inVC ContactInfo -BasicInformation Calender and Gender Radio button. 
			@Test
			public void tc15() throws InterruptedException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				//Thread.sleep(2000);
				
				WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
				avatarDroDwn.click();
				//Thread.sleep(1000);
				
				WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
				myProfile.click();
				Thread.sleep(500);
				WebElement contactInfo =driver.findElement(By.xpath("//button[2]"));
				contactInfo.click();
				Thread.sleep(500);
				JavascriptExecutor js=(JavascriptExecutor)driver;
								
				WebElement basicInfoEditBtn = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-outlinedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
				js.executeScript("arguments[0].scrollIntoView();", basicInfoEditBtn);
				Thread.sleep(500);
				basicInfoEditBtn.click();
				
				WebElement genderRBtn = driver.findElement(By.xpath("(//input[@class='jss13'])[2]"));
				genderRBtn.click();
				
				//Thread.sleep(3000);
				WebElement BasicInformationSaveBtn = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
				BasicInformationSaveBtn.click();
				
				//Thread.sleep(3000);
				
				String actualUrl ="https://staging.invc.vc/myprofile";
				String expectedUrl = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl, expectedUrl);
			}


	
}
