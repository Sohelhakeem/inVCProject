package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_ProfilePage extends BaseClass {
	
	//Verifying the elements of inVCProfile Page
	@Test
	public void tc1() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
//		Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
//		Thread.sleep(2000);
		
		WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
		myProfile.click();
//		Thread.sleep(2000);
		
		WebElement inVclogo = driver.findElement(By.xpath("(//a[@href='/meeting'])[2]"));
		inVclogo.isDisplayed();
		
		WebElement uploadBtn = driver.findElement(By.id("contained-button-file"));
		uploadBtn.isDisplayed();
		
		WebElement nameText = driver.findElement(By.xpath("//span[@class='pfTxtLG']"));
		nameText.isDisplayed();
		 
		WebElement emailText = driver.findElement(By.xpath("//span[@class='pfTxtSM txtPrimary']"));
		emailText.isDisplayed();
		
		WebElement personalDetailsEditBtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		personalDetailsEditBtn.isDisplayed();
		
		WebElement proffessionalDetailsEditBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		proffessionalDetailsEditBtn.isDisplayed();
		
		WebElement settingBtn = driver.findElement(By.xpath("(//span[@class='txtLink'])[2]"));
		settingBtn.isDisplayed();
		
		
		
	}
	
	//Verifying the Functionality inVC Personal Details Edit button. 
		@Test
		public void tc2() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
//			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
//			Thread.sleep(2000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			
			
			WebElement personalDetailsEditBtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			personalDetailsEditBtn.click();
			
//			Thread.sleep(2000);
			String exp_Txt = "My Profile";
			String act_Txt = driver.findElement(By.xpath("//h2[normalize-space()='My Profile']")).getText();
			Assert.assertEquals(exp_Txt, act_Txt);
			
			
		}		
		
		//Verifying the Functionality inVC Personal Details Edit button with valid FirstName and LastName and cancel. 
		@Test
		public void tc3() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
//			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			//Thread.sleep(2000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			
			
			WebElement personalDetailsEditBtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			personalDetailsEditBtn.click();
			
			//Thread.sleep(2000);
			
			driver.switchTo().activeElement();
			
			WebElement editFirstName = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			//editFirstName.clear();
			editFirstName.sendKeys("Sohel");
			
			//Thread.sleep(3000);
			
			WebElement editLastName = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
			editLastName.sendKeys("Hakeem");
			//Thread.sleep(3000);
			
			WebElement cancelBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[3]"));
			cancelBtn.click();
			
			String exp_Txt = "My Profile";
			String act_Txt = driver.findElement(By.xpath("//h2[normalize-space()='My Profile']")).getText();
			Assert.assertEquals(exp_Txt, act_Txt);
				
			}
		
		//Verifying the Functionality inVC Personal Details Edit button with valid FirstName and LastName and SAVE. 
		@Test
		public void tc4() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
//			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			//Thread.sleep(2000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			
			
			WebElement personalDetailsEditBtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			personalDetailsEditBtn.click();
			
			//Thread.sleep(2000);
			
			driver.switchTo().activeElement();
			
			WebElement editFirstName = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			//editFirstName.clear();
			editFirstName.sendKeys("Sohail");
			
			//Thread.sleep(3000);
			
			WebElement editLastName = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
			editLastName.sendKeys("Hakim");
			//Thread.sleep(3000);
			
			WebElement saveBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[4]"));
			saveBtn.click();
				
			String exp_Txt = "My Profile";
			String act_Txt = driver.findElement(By.xpath("//h2[normalize-space()='My Profile']")).getText();
			Assert.assertEquals(exp_Txt, act_Txt);
			}
		
		//Verifying the Functionality inVC Personal Details Edit button with Empty FirstName and Valid LastName and SAVE. 
		@Test
		public void tc5() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
//			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			//Thread.sleep(2000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			
			
			WebElement personalDetailsEditBtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			personalDetailsEditBtn.click();
			
			//Thread.sleep(2000);
			
			driver.switchTo().activeElement();
			
			WebElement editFirstName = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			//editFirstName.clear();
			editFirstName.clear();
			
			//Thread.sleep(3000);
			
			WebElement editLastName = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
			editLastName.sendKeys("Hakim");
			//Thread.sleep(3000);
			
			WebElement saveBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[4]"));
			saveBtn.click();
//			Thread.sleep(3000);
			
			String expectedErrorMsg = "This Field is Required";
			 WebElement exp = driver.findElement(By.xpath("//p[@class='MuiFormHelperText-root Mui-error Mui-required MuiFormHelperText-marginDense']"));
		        String actualErrorMsg = exp.getText();
		        Assert.assertEquals(actualErrorMsg,expectedErrorMsg);
			}
		
		//Verifying the Functionality inVC Personal Details Edit button with Valid FirstName and Empty LatName and click on SAVE. 
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
			//Thread.sleep(2000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			
			
			WebElement personalDetailsEditBtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			personalDetailsEditBtn.click();
			
			//Thread.sleep(2000);
			
			driver.switchTo().activeElement();
			
			WebElement editFirstName = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			//editFirstName.clear();
			editFirstName.sendKeys("Sohail");
			
			//Thread.sleep(3000);
			
			WebElement editLastName = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
			editLastName.clear();
			//Thread.sleep(3000);
			
			WebElement saveBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[4]"));
			saveBtn.click();
//			Thread.sleep(3000);
			
//			String expectedErrorMsg = "This Field is Required";
//			 WebElement exp = driver.findElement(By.xpath("//p[@class='MuiFormHelperText-root Mui-error Mui-required MuiFormHelperText-marginDense']"));
//		        String actualErrorMsg = exp.getText();
//		        Assert.assertEquals(actualErrorMsg,expectedErrorMsg);
		        
		        String exp_Txt = "My Profile";
				String act_Txt = driver.findElement(By.xpath("//h2[normalize-space()='My Profile']")).getText();
				Assert.assertEquals(exp_Txt, act_Txt);
			}
		//Verifying the Functionality inVC Professiojnal Details Edit button. 
		@Test
		public void tc7() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
//			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
//			Thread.sleep(2000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			

			WebElement profEditBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
			profEditBtn.click();
			Thread.sleep(500);
//			Thread.sleep(2000);
			WebElement position=driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			position.click();
			
			String exp_Txt = "Official Details";
			String act_Txt = driver.findElement(By.xpath("//h3[normalize-space()='Official Details']")).getText();
			Assert.assertEquals(exp_Txt, act_Txt);
			
			
		}
		
		//Verifying the Functionality inVC Professional Details with Valid Details. 
		@Test
		public void tc8() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
//			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
//			Thread.sleep(2000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			

			WebElement profEditBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
			profEditBtn.click();
//			Thread.sleep(2000);
			
			WebElement position=driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			position.sendKeys("Test Engineer");
			
			WebElement Email=driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
			Email.sendKeys("sohel@peoplelinkvc.com");
			
			
			WebElement Branch=driver.findElement(By.xpath("(//input[@aria-invalid='false'])[3]"));
			Branch.sendKeys("HM");
			
			WebElement Address=driver.findElement(By.xpath("(//input[@aria-invalid='false'])[4]"));
			Address.sendKeys("Hyderabad");
			
			WebElement saveBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[4]"));
			saveBtn.click();
			
			String exp_Txt = "My Profile";
			String act_Txt = driver.findElement(By.xpath("//h2[normalize-space()='My Profile']")).getText();
			Assert.assertEquals(exp_Txt, act_Txt);
			

		}	
		//Verifying the Functionality inVC ContactInfo. 
		@Test
		public void tc9() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
//			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
//			Thread.sleep(2000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			
			WebElement contactInfo =driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
			contactInfo.click();
			
			String exp_Txt = "My Profile";
			String act_Txt = driver.findElement(By.xpath("//h2[normalize-space()='My Profile']")).getText();
			Assert.assertEquals(exp_Txt, act_Txt);

		}	
		
		//Verifying the Functionality inVC Locale. 
		@Test
		public void tc10() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
//			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
//			Thread.sleep(2000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			
			WebElement Locale =driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
			Locale.click();
			
			String exp_Txt = "My Profile";
			String act_Txt = driver.findElement(By.xpath("//h2[normalize-space()='My Profile']")).getText();
			Assert.assertEquals(exp_Txt, act_Txt);

		}	
		
		//Verifying the Functionality inVC Professional Details with EmptyFields Details. 
		@Test
		public void tc11() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
//			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
//			Thread.sleep(2000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			

			WebElement profEditBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
			profEditBtn.click();
//			Thread.sleep(2000);
			
			WebElement position=driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			position.clear();
			
			WebElement Email=driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
			Email.sendKeys("sohel@peoplelinkvc.com");
			
			
			WebElement Branch=driver.findElement(By.xpath("(//input[@aria-invalid='false'])[3]"));
			Branch.click();
			
			WebElement Address=driver.findElement(By.xpath("(//input[@aria-invalid='false'])[4]"));
			Address.sendKeys("Hyderabad");
			
			WebElement saveBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[4]"));
			saveBtn.click();
			
			String exp_Txt = "My Profile";
			String act_Txt = driver.findElement(By.xpath("//h2[normalize-space()='My Profile']")).getText();
			Assert.assertEquals(exp_Txt, act_Txt);
			
			}
		
		}	
		
		