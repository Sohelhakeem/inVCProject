package scripts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_HelpSettingPage extends BaseClass {
	//Verifying the functionality of headerAvatarDrpDwn SettingFeature
		@Test
		public void tc1() throws InterruptedException {
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
			
			WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
			setting.click();
			Thread.sleep(2000);
			
			avatarDroDwn.click();
			
			WebElement logout=driver.findElement(By.xpath("//a[text()='Log Out']"));
			logout.click();
			Thread.sleep(2000);
			
			String actualUrl="https://staging.invc.vc/?redirect=/settings";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			
			}
		//Verifying the functionality of headerAvatarDrpDwn Setting- Help Feature
		@Test
		public void tc2() throws InterruptedException {
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
			
			WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
			setting.click();
			Thread.sleep(2000);
			
			WebElement help=driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
			help.click();
			Thread.sleep(2000);
			
			String expectedTextMsg = "Help";
			WebElement expText = driver.findElement(By.xpath("//h3[@class='pfTxtMD']"));
			String actualText= expText.getText();
			Assert.assertEquals(actualText, expectedTextMsg);
			
		}
		//Verifying the functionality of headerAvatarDrpDwn Setting- Help-Support Center.
		@Test
		public void tc3() throws InterruptedException {
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
			
			WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
			setting.click();
			Thread.sleep(2000);
			
			WebElement help=driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
			help.click();
			
			WebElement helpSupportCenter=driver.findElement(By.xpath("//a[@class='listAnchoTxt']"));
			helpSupportCenter.click();
			
			String parentID = driver.getWindowHandle();
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			if(parentID.equals(tabs2.get(0))) {
			  driver.switchTo().window(tabs2.get(1));
			}else {
			  driver.switchTo().window(tabs2.get(0));
			}
			
			Thread.sleep(3000);

			String actualurl ="https://help.peoplelinkvc.com/portal/en/home";
			String expectedUrl = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl, actualurl);
			
		}
		//Verifying the functionality of headerAvatarDrpDwn Setting- Help-open A new Ticket.
		@Test
		public void tc4() throws InterruptedException {
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
			
			WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
			setting.click();
			Thread.sleep(2000);
			
			WebElement help=driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
			help.click();
			
			WebElement openAnewTicket=driver.findElement(By.xpath("(//a[@class='listAnchoTxt'])[2]"));
			openAnewTicket.click();
			
			String parentID = driver.getWindowHandle();
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			if(parentID.equals(tabs2.get(0))) {
			  driver.switchTo().window(tabs2.get(1));
			}else {
			  driver.switchTo().window(tabs2.get(0));
			}
			
			Thread.sleep(3000);

			String actualurl ="https://help.peoplelinkvc.com/portal/en/newticket?departmentId=33143000000010772&layoutId=33143000000011350";
			String expectedUrl = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl, actualurl);
			
		}
		//Verifying the functionality of headerAvatarDrpDwn Setting- Help- check Ticket Status.
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
			//Thread.sleep(2000);
			
			WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
			setting.click();
			Thread.sleep(2000);
			
			WebElement help=driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
			help.click();
			
			WebElement checkTicketStatus=driver.findElement(By.xpath("(//a[@class='listAnchoTxt'])[3]"));
			checkTicketStatus.click();
			
			String parentID = driver.getWindowHandle();
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			if(parentID.equals(tabs2.get(0))) {
			  driver.switchTo().window(tabs2.get(1));
			}else {
			  driver.switchTo().window(tabs2.get(0));
			}
			
			Thread.sleep(3000);

			String actualurl ="https://help.peoplelinkvc.com/portal/en/newticket";
			String expectedUrl = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl, actualurl);
		}
		//Verifying the functionality of headerAvatarDrpDwn Setting- Help- TroubleShoot.
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
			
			WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
			setting.click();
			Thread.sleep(2000);
			
			WebElement help=driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
			help.click();
			
			WebElement TroubleShoot=driver.findElement(By.xpath("(//a[@class='listAnchoTxt'])[4]"));
			TroubleShoot.click();
			
			String parentID = driver.getWindowHandle();
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			if(parentID.equals(tabs2.get(0))) {
			  driver.switchTo().window(tabs2.get(1));
			}else {
			  driver.switchTo().window(tabs2.get(0));
			}
			
			Thread.sleep(3000);

			String actualurl ="https://test.webrtc.org/";
			String expectedUrl = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl, actualurl);
		}
		
}
