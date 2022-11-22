package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_LoginPage extends BaseClass {
	
	//Verifying elements on Login page
    @Test
    public void tc1()
    {
    	WebElement inVCLogo = driver.findElement(By.xpath("//div[@class='flexInline']"));
    	inVCLogo.isDisplayed();
    	
    	WebElement logInTitle = driver.findElement(By.xpath("//h1[@class='hmTitleTxt txtCenter']"));
    	logInTitle.isDisplayed();
    	
    	
    	
    	WebElement loginLinkText = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
    	loginLinkText.isDisplayed();
    	
    	WebElement signUpLink = driver.findElement(By.xpath("//a[@class='hmBtnAnchor']"));
    	signUpLink.isDisplayed();
    	
    }

	//Verifying LoginPage with valid details.
	@Test
	public void tc2() throws InterruptedException {
		
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		username.sendKeys("sohel@peoplelinkvc.com");
		password.sendKeys("Hyderabad@123");
		login.click();
//		Thread.sleep(2000);
		
		String expectedErrorMsg = "Today Meetings";
		 WebElement exp = driver.findElement(By.xpath("//span[@class='cardhdngTxt']"));
	        String actualErrorMsg = exp.getText();
	        		
	        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	        
		}
	
	//Verifying LoginPage with invalid details.
	
	@Test
	public void tc3() throws InterruptedException {
		
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		username.sendKeys("sohel@vc.com");
		password.sendKeys("Hyderabad12");
		login.click();
//		Thread.sleep(3000);
		String expectedErrorMsg = "Incorrect username or password.";
		 WebElement exp = driver.findElement(By.xpath("//span[@class='errorTxt']"));
	        String actualErrorMsg = exp.getText();
	        		
	        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
		}
	
	//Verifying LoginPage with invalid mailId & valid Password.
	//becouse of exceeding the limit of passwod it diplays Password attempts exceeded
	
		@Test
		public void tc4() throws InterruptedException {
			
			WebElement username=driver.findElement(By.id("email"));
			WebElement password=driver.findElement(By.id("password"));
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			username.sendKeys("sohel@vc.com");
			password.sendKeys("Hyderabad@123");
			login.click();
//			Thread.sleep(3000);
//			String expectedErrorMsg = "Password attempts exceeded";
			String expectedErrorMsg = "Incorrect username or password.";
			 WebElement exp = driver.findElement(By.xpath("//span[@class='errorTxt']"));
		        String actualErrorMsg = exp.getText();
		        		
		        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
			}
		
		//Verifying LoginPage with valid mail & invalid Password.
		
		@Test
		public void tc5() throws InterruptedException {
			
			WebElement username=driver.findElement(By.id("email"));
			WebElement password=driver.findElement(By.id("password"));
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			username.sendKeys("sohel@peoplelinkvc.com");
			password.sendKeys("868123");
			login.click();
//			Thread.sleep(3000);
			String expectedErrorMsg = "Incorrect username or password.";
			 WebElement exp = driver.findElement(By.xpath("//span[@class='errorTxt']"));
		        String actualErrorMsg = exp.getText();
		        		
		        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
			}
		
	
}

