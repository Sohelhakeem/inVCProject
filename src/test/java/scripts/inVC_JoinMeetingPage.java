package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_JoinMeetingPage extends BaseClass {
	//Verifying the functionality of joinmeeting
	@Test
	public void tc1() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
//		Thread.sleep(5000);
		
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		
		String Exp_Text="Provide Meeting ID in the below input box.";
		String actual_Text= driver.findElement(By.xpath("//span[@class='mrgnBtmSM infoTXTSM']")).getText();
		Assert.assertEquals(Exp_Text,actual_Text);
		
		}
	//Verifying the functionality of joinmeeting - my Meeting TF
	@Test
	public void tc2() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(1000);
		
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		Thread.sleep(500);
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		String Exp_Text="Provide Meeting ID in the below input box.";
		String actual_Text= driver.findElement(By.xpath("//span[@class='mrgnBtmSM infoTXTSM']")).getText();
		Assert.assertEquals(Exp_Text,actual_Text);
		
	}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon
	@Test
	public void tc3() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(1000);
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		Thread.sleep(500);
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();

		String Exp_Text="Ready to Join ?";
		String actual_Text= driver.findElement(By.xpath("//span[@class='jss58 jss38']")).getText();
		Assert.assertEquals(Exp_Text,actual_Text);
		
		
		}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon-EnterName.
	@Test
	public void tc4() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(1000);
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		Thread.sleep(500);
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		
		WebElement yournameTf = driver.findElement(By.id("displayname"));
		yournameTf.sendKeys("SOHAIL");
		
		//URL changes with meeting Id
		Thread.sleep(2000);
		String Exp_Text="Ready to Join ?";
		String actual_Text= driver.findElement(By.xpath("//span[@class='jss58 jss38']")).getText();
		Assert.assertEquals(Exp_Text,actual_Text);
		}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon - enterName- join
	@Test
	public void tc5() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(1000);
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		Thread.sleep(500);
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		
		WebElement yournameTf = driver.findElement(By.id("displayname"));
		yournameTf.sendKeys("SOHAIL");
		
		WebElement joinButton = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		joinButton.click();
		//URL changes with meeting Id
//		Thread.sleep(2000);
		String Exp_Text="SOHAIL";
		String actual_Text= driver.findElement(By.xpath("//span[@class='jss130']")).getText();
		Assert.assertEquals(Exp_Text,actual_Text);
		
		}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon - enterName- join-Leave-No
	@Test
	public void tc6() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(1000);
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		Thread.sleep(500);
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		
		WebElement yournameTf = driver.findElement(By.id("displayname"));
		yournameTf.sendKeys("SOHAIL");
		Thread.sleep(3000);
		WebElement joinButton = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		joinButton.click();
		
		Thread.sleep(3000);
		WebElement leaveButton = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		leaveButton.click();

//		Thread.sleep(2000);
		WebElement NoButton = driver.findElement(By.xpath("//div[@role='none presentation']//button[1]"));
		NoButton.click();
		
		//URL changes with meeting Id
		String Exp_Text="SOHAIL";
		String actual_Text= driver.findElement(By.xpath("//span[@class='jss130']")).getText();
		Assert.assertEquals(Exp_Text,actual_Text);
		
		}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon - enterName- join-Leave-YES
	@Test
	public void tc7() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(1000);
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		Thread.sleep(500);
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		
		WebElement yournameTf = driver.findElement(By.id("displayname"));
		yournameTf.sendKeys("SOHAIL");
		Thread.sleep(1000);
		WebElement joinButton = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		joinButton.click();
		
		Thread.sleep(2000);
		WebElement leaveButton = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		leaveButton.click();

//		Thread.sleep(2000);
		WebElement YesButton = driver.findElement(By.xpath("//div[@role='none presentation']//button[2]"));
		YesButton.click();
//		Thread.sleep(5000);
		String exp_Text="Login";
		String actaul_Text= driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
		Assert.assertEquals(exp_Text,actaul_Text);
		
		}
	
}
