package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_SettingPage extends BaseClass {

	
	//Verifying the functionality of headerAvatarDrpDwn Setting Feature
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
		//Thread.sleep(2000);
		
		WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
		setting.click();
//		Thread.sleep(2000);
		
		avatarDroDwn.click();
		
		WebElement logout=driver.findElement(By.xpath("//a[text()='Log Out']"));
		logout.click();
//		Thread.sleep(2000);
		
		String exp_Text="Login";
		String actaul_Text= driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
		Assert.assertEquals(exp_Text,actaul_Text);
		
		}
	//Verifying the functionality of headerAvatarDrpDwn Setting Current Password by entering All same Passwords
	@Test
	public void tc2() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
//		Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
		//Thread.sleep(2000);
		
		WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
		setting.click();
		//Thread.sleep(2000);
		
		WebElement currentPassTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		currentPassTf.sendKeys("Hyderabad@123");
		
		WebElement newPassTf = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
		newPassTf.sendKeys("Hyderabad@123");
		
		WebElement confirmPassTf = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[3]"));
		confirmPassTf.sendKeys("Hyderabad@123");
		
		WebElement saveBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		saveBtn.click();
//		
		String expectedErrorMsg = "Current Password and New Password should not be same";
		 WebElement exp = driver.findElement(By.xpath("//p[@class='MuiFormHelperText-root Mui-error MuiFormHelperText-filled MuiFormHelperText-marginDense']"));
	        String actualErrorMsg = exp.getText();
	        Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
	        
	}
	
	//Verifying the functionality of headerAvatarDrpDwn Setting Current Password by entering Wrong Confirm Password.
	@Test
	public void tc3() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
//		Thread.sleep(2000);
		
		WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
		avatarDroDwn.click();
		//Thread.sleep(2000);
		
		WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
		setting.click();
//		Thread.sleep(2000);
		
		WebElement currentPassTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		currentPassTf.sendKeys("Hyderabad@123");
		
		WebElement newPassTf = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
		newPassTf.sendKeys("Belgaum@123");
		
		WebElement confirmPassTf = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[3]"));
		confirmPassTf.sendKeys("Hyderabad@123");
		
		WebElement saveBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		saveBtn.click();
		
		String expectedErrorMsg = "New Password and Confirm Password should be same";
		 WebElement exp = driver.findElement(By.xpath("//p[@class='MuiFormHelperText-root Mui-error MuiFormHelperText-filled MuiFormHelperText-marginDense']"));
	        String actualErrorMsg = exp.getText();
	        Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
	        
	}
	//Verifying the functionality of headerAvatarDrpDwn Setting Current Password by entering Wrong Current Password .
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
		
		WebElement currentPassTf = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		currentPassTf.sendKeys("Hyderabad@1");
		
		WebElement newPassTf = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
		newPassTf.sendKeys("Hyderabad@123");
		
		WebElement confirmPassTf = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[3]"));
		confirmPassTf.sendKeys("Hyderabad@123");
		
		WebElement saveBtn = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		saveBtn.click();
		
		String expectedErrorMsg = "Incorrect username or password.";
		 WebElement exp = driver.findElement(By.xpath("//p[@class='MuiFormHelperText-root Mui-error MuiFormHelperText-filled MuiFormHelperText-marginDense']"));
	        String actualErrorMsg = exp.getText();
	        Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
	}
	
	@Test
	public void  tc5() throws InterruptedException {
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
		
		String exp_Text="Manage Licenses";
		String actaul_Text= driver.findElement(By.xpath("//h2[normalize-space()='Manage Licenses']")).getText();
		Assert.assertEquals(exp_Text,actaul_Text);
		
		
	}
	@Test
	public void  tc6() throws InterruptedException {
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
		Thread.sleep(500);
		
		String expectedurl = "https://staging.invc.vc/?redirect=/manage-licenses";
		String currenturl = driver.getCurrentUrl();
		Assert.assertEquals(expectedurl, currenturl);
		
	}

	/*
	 * //Verifying the functionality of headerAvatarDrpDwn Settimg Current Password
	 * by enteringAll possible Inputs.
	 * 
	 * @Test public void tc5() throws InterruptedException, AWTException {
	 * WebElement username=driver.findElement(By.id("email"));
	 * username.sendKeys("sohel@peoplelinkvc.com");
	 * 
	 * WebElement password=driver.findElement(By.id("password"));
	 * password.sendKeys("Hyderabad@123");
	 * 
	 * WebElement
	 * login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
	 * login.click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * WebElement
	 * avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
	 * avatarDroDwn.click(); //Thread.sleep(2000);
	 * 
	 * WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
	 * setting.click(); Thread.sleep(2000);
	 * 
	 * WebElement currentPassTf =
	 * driver.findElement(By.xpath("//input[@aria-invalid='false']"));
	 * currentPassTf.sendKeys("Hyderabad@123");
	 * 
	 * WebElement newPassTf =
	 * driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
	 * newPassTf.sendKeys("Belgaum@123");
	 * 
	 * WebElement confirmPassTf =
	 * driver.findElement(By.xpath("(//input[@aria-invalid='false'])[3]"));
	 * confirmPassTf.sendKeys("Belgaum@123");
	 * 
	 * WebElement saveBtn =
	 * driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
	 * saveBtn.click();
	 * 
	 * Thread.sleep(2000); Robot r = new Robot(); r.keyPress(KeyEvent.VK_ENTER);
	 * 
	 * avatarDroDwn.click();
	 * 
	 * WebElement logout=driver.findElement(By.xpath("//a[text()='Log Out']"));
	 * logout.click(); Thread.sleep(2000);
	 * 
	 * String actualUrl="https://staging.invc.vc/?redirect=/settings"; String
	 * expectedUrl= driver.getCurrentUrl(); Assert.assertEquals(actualUrl,
	 * expectedUrl); }
	 * 
	 * //Verifying the functionality of headerAvatarDrpDwn Settimg Current Password
	 * by enteringAll possible Inputs.
	 * 
	 * @Test public void tc6() throws InterruptedException, AWTException {
	 * WebElement username=driver.findElement(By.id("email"));
	 * username.sendKeys("sohel@peoplelinkvc.com");
	 * 
	 * WebElement password=driver.findElement(By.id("password"));
	 * password.sendKeys("Belgaum@123");
	 * 
	 * WebElement
	 * login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
	 * login.click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * WebElement
	 * avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
	 * avatarDroDwn.click(); //Thread.sleep(2000);
	 * 
	 * WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
	 * setting.click(); Thread.sleep(2000);
	 * 
	 * WebElement currentPassTf =
	 * driver.findElement(By.xpath("//input[@aria-invalid='false']"));
	 * currentPassTf.sendKeys("Belgaum@123");
	 * 
	 * WebElement newPassTf =
	 * driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
	 * newPassTf.sendKeys("Hyderabad@123");
	 * 
	 * WebElement confirmPassTf =
	 * driver.findElement(By.xpath("(//input[@aria-invalid='false'])[3]"));
	 * confirmPassTf.sendKeys("Hyderabad@123");
	 * 
	 * WebElement saveBtn =
	 * driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
	 * saveBtn.click();
	 * 
	 * Thread.sleep(2000); Robot r = new Robot(); r.keyPress(KeyEvent.VK_ENTER);
	 * 
	 * avatarDroDwn.click();
	 * 
	 * WebElement logout=driver.findElement(By.xpath("//a[text()='Log Out']"));
	 * logout.click(); Thread.sleep(2000);
	 * 
	 * String actualUrl="https://staging.invc.vc/?redirect=/settings"; String
	 * expectedUrl= driver.getCurrentUrl(); Assert.assertEquals(actualUrl,
	 * expectedUrl); }
	 */
		
		
		}
		
