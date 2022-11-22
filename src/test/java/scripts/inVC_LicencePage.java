package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_LicencePage extends BaseClass {
	@Test
	public void  tc1() throws InterruptedException {
		//Verifying the functionality of inVC AvatarDD - License feature.
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohelhakeem@gmail.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
//		Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
		
		WebElement licenceDD=driver.findElement(By.xpath("//a[text()='Licenses']"));
		licenceDD.click();
//		Thread.sleep(2000);
		
		String expectedurl = "https://staging.invc.vc/manage-licenses";
		String currenturl = driver.getCurrentUrl();
		Assert.assertEquals(expectedurl, currenturl);
		
	}
	@Test
	public void  tc2() throws InterruptedException {
		//Verifying the functionality of inVC AvatarDD - License feature-logout.
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohelhakeem@gmail.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
//		Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
		
		WebElement licenceDD=driver.findElement(By.xpath("//a[text()='Licenses']"));
		licenceDD.click();
//		Thread.sleep(2000);
		
		WebElement avatarDropDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDropDwn.click();
		//Thread.sleep(2000);
		
		WebElement logout=driver.findElement(By.xpath("//a[text()='Log Out']"));
		logout.click();
//		Thread.sleep(2000);
		
		String actaul_Text = "Login";
		String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
		Assert.assertEquals(actaul_Text, exp_Text);
		
	}

}
