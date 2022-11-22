package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class AAA extends BaseClass {
	@Test
	public void tc1() throws InterruptedException, AWTException {
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
		
		Thread.sleep(2000);
		
		WebElement upload_file = driver.findElement(By.xpath("//input[@id='contained-button-file']"));
		upload_file.sendKeys("C:\\Users\\Sohel\\Pictures\\profile\\cntry.png");
		//Thread.sleep(3000);
		WebElement save_Button = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
		save_Button.click();
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}
}
