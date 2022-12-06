package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_ForgtPasswordPage extends BaseClass {
	
	//Verifying the elements on forgot Password Page
	
	@Test(priority=1)
	public void tc1(){
		
		WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[@class='hmBtnAnchor txtCenter']"));
    	forgotPasswordLink.click();
		
		WebElement invclogo = driver.findElement(By.xpath("//div[@class='flexInline']"));
		invclogo.isDisplayed();
		
		WebElement languagedd = driver.findElement(By.xpath("(//div[@class='flexInline'])[2]"));
		languagedd.isDisplayed();
		
		WebElement forgotpasswordtext = driver.findElement(By.xpath("//h1[@class='hmTitleTxt txtCenter']"));
		forgotpasswordtext.isDisplayed();
		
		WebElement  entermailtb = driver.findElement(By.id("standard-with-placeholder"));
		entermailtb.isDisplayed();
		
		WebElement sendotpbtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		sendotpbtn.isDisplayed();
		
		WebElement loginbtn = driver.findElement(By.xpath("//a[@class='hmBtnAnchor txtCenter']"));
		loginbtn.isDisplayed();
		
		WebElement termsandconditionlink = driver.findElement(By.xpath("//a[@target='_blank']"));
		termsandconditionlink.isDisplayed();
		
	}
	
	@Test(priority=0)
	public void tc2() throws InterruptedException {
		//testing functionality of forgotPassword with valid mail
		WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[@class='hmBtnAnchor txtCenter']"));
    	forgotPasswordLink.click();
    	
		WebElement entermailtf = driver.findElement(By.id("standard-with-placeholder"));
		entermailtf.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement sendotpbtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		sendotpbtn.click();
		
		Thread.sleep(3000);
		
		String actualUrl ="https://staging.invc.vc/confirm-password?username=sohel@peoplelinkvc.com";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
				
	}
	
	@Test(priority=2)
	public void tc3() throws InterruptedException {
		
		//testing functionality of forgotPassword with Invalid mail
		
		WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[@class='hmBtnAnchor txtCenter']"));
    	forgotPasswordLink.click();
    	
		WebElement entermailtf = driver.findElement(By.id("standard-with-placeholder"));
		entermailtf.sendKeys("Acc350@n.com");
		
		WebElement sendotpbtn = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		sendotpbtn.click();
		
		Thread.sleep(3000);
		
		String expectedErrorMsg = "Please Enter Valid Email";
		WebElement exp = driver.findElement(By.xpath("//div[@class='errorMsgBlock']"));
		String actualErrorMsg = exp.getText();
		
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}
	
}
