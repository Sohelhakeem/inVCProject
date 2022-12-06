package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_DashBoardPage extends BaseClass {
	//Verifying elements on DashBoard
		@Test(priority=0)
		public void tc1() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password =driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(5000);
			
			WebElement inVclogo = driver.findElement(By.xpath("(//a[@href='/meeting'])[2]"));
			inVclogo.isDisplayed();
			
			WebElement userNametxt = driver.findElement(By.xpath("//div[@class='userName']"));
			userNametxt.isDisplayed();
			
			WebElement userProfileImage = driver.findElement(By.xpath("//div[@class='userAvatar']"));
			userProfileImage.isDisplayed();
			
			WebElement instaMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noLeftPdng']"));
			instaMeetingIcon.isDisplayed();
			
			WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
			joinMeetingIcon.isDisplayed();
			
			WebElement scheduleMeetingIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noLeftPdng'])[2]"));
			scheduleMeetingIcon.isDisplayed();
			
			WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
			shareScreenIcon.isDisplayed();
			
			String actualUrl="https://staging.invc.vc/meeting";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
		
		//Verifying the functionality of instameeting
		@Test(priority=1)
		public void tc2() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(5000);
			
			WebElement instaMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noLeftPdng']"));
			instaMeetingIcon.click();
			
			String actualUrl="https://staging.invc.vc/insta-meeting";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
		
		//Verifying the functionality of joinmeeting
		@Test(priority=2)
		public void tc3() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(5000);
			
			WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
			joinMeetingIcon.click();
			
			String actualUrl="https://staging.invc.vc/join-meeting";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
			
		//Verifying the functionality of schedulemeeting
		@Test(priority=3)
		public void tc4() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(5000);
			
			WebElement scheduleMeetingIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noLeftPdng'])[2]"));
			scheduleMeetingIcon.click();
			
			String actualUrl="https://staging.invc.vc/schedule-meeting";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
			
		//Verifying the functionality of shareScreen
		@Test(priority=4)
		public void tc5() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(5000);
			
			WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
			shareScreenIcon.click();
			
			String actualUrl="https://staging.invc.vc/join-screenshare";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
		
//Verifying the functionality of MyMeetig 
		@Test(priority=5)
		public void tc6() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement  MyMeetig= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
			MyMeetig.click();
		
			
			String actualUrl="https://staging.invc.vc/new-meetings";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
		
//Verifying the functionality of Calender Feature
		@Test(priority=6)
		public void tc7() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement  Calender= driver.findElement(By.xpath("//a[contains(text(),'Calendar')]"));
			Calender.click();
		
			String expectedText = "Calendar View";
			String Actualtext = driver.findElement(By.xpath("//h1[normalize-space()='Calendar View']")).getText();
			Assert.assertEquals(expectedText, Actualtext);
			
			}

//Verifying the functionality of headerAvatarDrpDwn F
		@Test(priority=7)
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
			Thread.sleep(5000);
		}
		
//Verifying the functionality of headerAvatarDrpDwn MyProfileFeature
		@Test(priority=8)
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
			Thread.sleep(2000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			Thread.sleep(2000);
			
			String actualUrl="https://staging.invc.vc/myprofile";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
			
//Verifying the functionality of headerAvatarDrpDwn SettingFeature
		@Test(priority=9)
		public void tc20() throws InterruptedException {
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
			
			WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
			setting.click();
			//Thread.sleep(2000);
			
			String actualUrl="https://staging.invc.vc/settings";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
			
//Verifying the functionality of headerAvatarDrpDwn LogoutFeature
		@Test(priority=10)
		public void tc21() throws InterruptedException {
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
			
			WebElement logout=driver.findElement(By.xpath("//a[text()='Log Out']"));
			logout.click();
			Thread.sleep(2000);
			
			String actualUrl="https://staging.invc.vc/?redirect=/meeting";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}

		}
