package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_ShareScreenPage extends BaseClass {
	//Verifying the functionality of shareScreen
			@Test
			public void tc1() throws InterruptedException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				Thread.sleep(3000);
				
				WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
				shareScreenIcon.click();
				Thread.sleep(500);
				String actualUrl="https://staging.invc.vc/join-screenshare";
				String expectedUrl= driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl,actualUrl);
				
				}
			//Verifying the functionality of shareScreen - with Valid meetingId TextField.
			@Test
			public void tc2() throws InterruptedException, IOException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				Thread.sleep(3000);
				
				WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
				shareScreenIcon.click();
				Thread.sleep(500);
				WebElement meetingId = driver.findElement(By.id("outlined-basic"));
				meetingId.sendKeys(p.getPropertyFiledata("Meeting_Id"));
				
				String actualUrl="https://staging.invc.vc/join-screenshare";
				String expectedUrl= driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl,actualUrl);
				
				}
			//Verifying the functionality of shareScreen - meetingId- join&Share Button.
			@Test
			public void tc3() throws InterruptedException, IOException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				Thread.sleep(3000);
				
				WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
				shareScreenIcon.click();
				Thread.sleep(500);
				WebElement meetingId = driver.findElement(By.id("outlined-basic"));
				meetingId.sendKeys(p.getPropertyFiledata("Meeting_Id"));
				Thread.sleep(500);
				WebElement joinAndShareButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/div[4]/button/span[1]"));
				joinAndShareButton.click();
				
				Thread.sleep(1000);
				//URL get changes with every new meeting ID
				String exp_err = "Invalid Meeting Code";
				String act_err = driver.findElement(By.xpath("//div[@role='alert']")).getText();
				Assert.assertEquals(exp_err, act_err);
				
				}
			//Verifying the functionality of shareScreen - meetingId- join&Share Button -your Name.
//			@Test
//			public void tc4() throws InterruptedException, IOException {
//				WebElement username=driver.findElement(By.id("email"));
//				username.sendKeys("sohel@peoplelinkvc.com");
//				
//				WebElement password=driver.findElement(By.id("password"));
//				password.sendKeys("Hyderabad@123");
//				
//				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//				login.click();
//				
//				Thread.sleep(5000);
//				
//				WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
//				shareScreenIcon.click();
//				
//				WebElement meetingId = driver.findElement(By.id("outlined-basic"));
//				meetingId.sendKeys(p.getPropertyFiledata("Screen_share_Id"));
//				
//				WebElement joinAndShareButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/div[4]/button/span[1]"));
//				joinAndShareButton.click();
//				
//				WebElement yourNameTf = driver.findElement(By.id("displayname"));
//				yourNameTf.sendKeys("SOHAIL");
//				
//				Thread.sleep(3000);
//				//URL get changes with every new meeting ID
////				String actualUrl="https://share.invc.vc/6315cb7a9713525ee7396458";
////				String expectedUrl= driver.getCurrentUrl();	
////				Assert.assertEquals(expectedUrl,actualUrl);
//				
//				}
//			//Verifying the functionality of shareScreen - meetingId- join&Share Button -your Name -click on Share&Screen Button.
//			@Test
//			public void tc5() throws InterruptedException, IOException {
//				WebElement username=driver.findElement(By.id("email"));
//				username.sendKeys("sohel@peoplelinkvc.com");
//				
//				WebElement password=driver.findElement(By.id("password"));
//				password.sendKeys("Hyderabad@123");
//				
//				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//				login.click();
//				
//				Thread.sleep(5000);
//				
//				WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
//				shareScreenIcon.click();
//				
//				WebElement meetingId = driver.findElement(By.id("outlined-basic"));
//				meetingId.sendKeys(p.getPropertyFiledata("Screen_share_Id"));
//				
//				WebElement joinAndShareButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/div[4]/button/span[1]"));
//				joinAndShareButton.click();
//				
//				WebElement yourNameTf = driver.findElement(By.id("displayname"));
//				yourNameTf.sendKeys("SOHAIL");
//				
//				WebElement joinAndShareButton2 = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
//				joinAndShareButton2.click();
//				
//				WebElement iUnderstandButton = driver.findElement(By.xpath("//*[@id=\"_invc\"]/div/div[1]/button"));
//				iUnderstandButton.click();
//				
//				
//				Thread.sleep(3000);
//				//URL get changes with every new meeting ID
////				String actualUrl="https://share.invc.vc/6315cb7a9713525ee7396458";
////				String expectedUrl= driver.getCurrentUrl();	
////				Assert.assertEquals(expectedUrl,actualUrl);
//				
//				}	
			
			}
