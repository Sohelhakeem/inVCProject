package scripts;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_Schedule_Meeting extends BaseClass{
	@Test
	public void tc1() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement scheduleMeetingIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noLeftPdng'])[2]"));
		scheduleMeetingIcon.click();
		
		
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		
		String year = "2023";
		String month = "January";
		String date = "10";
				
		WebElement date_Picker = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));//date picker opens
		js.executeScript("arguments[0].scrollIntoView();", date_Picker);
		Thread.sleep(500);
		date_Picker.click();
		
		while(true) {
			String monthyear = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();
			
			String arr[]=monthyear.split(" ");
			String mon =arr[0];
			String yr = arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else {
				driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();
			}
			
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//div[@class='MuiPickersBasePicker-container']//div"));
		
		for(WebElement ele:alldates) {
			String dt = ele.getText();
			if (dt.equals(date))
			{
				ele.click();
				break;
			}
			
		}
		
		        
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
	@Test
	public void tc2() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//div[@class='webAutoWidth']//button[@type='button']"));
		scheduleMeeting.click();
		
		WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		MeetingTitleTF.sendKeys("SCRUM MEETING");
		
		String actualUrl="https://staging.invc.vc/schedule-meeting";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
	}
	
	@Test
	public void tc3() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//div[@class='webAutoWidth']//button[@type='button']"));
		scheduleMeeting.click();
		Thread.sleep(500);
		WebElement  invcPRO= driver.findElement(By.xpath("//div[@class='hrztlTabItem ']"));
		invcPRO.click();
		
		String actualUrl="https://staging.invc.vc/schedule-meeting";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
		}
	
	@Test
	public void tc4() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//div[@class='webAutoWidth']//button[@type='button']"));
		scheduleMeeting.click();
		
		WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		MeetingTitleTF.sendKeys("SCRUM MEETING");
		driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']")).click();		
	}
	
	@Test
	public void tc5() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//div[@class='webAutoWidth']//button[@type='button']"));
		scheduleMeeting.click();
		
		WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		MeetingTitleTF.sendKeys("SCRUM MEETING");
		
		
		WebElement advanced = driver.findElement(By.xpath("//div[@class='MuiAccordionSummary-content']"));		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", advanced);
		Thread.sleep(400);
		advanced.click();
		
		
		
	}
	@Test
	public void tc6() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//div[@class='webAutoWidth']//button[@type='button']"));
		scheduleMeeting.click();
		
		WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		MeetingTitleTF.sendKeys("SCRUM MEETING");
		
		WebElement Password_Enable = driver.findElement(By.xpath("//div[@class='MuiFormGroup-root']//input[@type='checkbox']"));
		Password_Enable.click();
		
		WebElement Create_meeting_password = driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-formControl MuiInputBase-adornedEnd MuiOutlinedInput-adornedEnd MuiInputBase-marginDense MuiOutlinedInput-marginDense']//input[@id='outlined-basic']"));
		Create_meeting_password.sendKeys("1234");
		
		String year = "2023";
		String month = "January";
		String date = "10";
				
		WebElement date_Picker = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']"));//date picker opens
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", date_Picker);
		Thread.sleep(500);
		date_Picker.click();
		
		while(true) {
			String monthyear = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();
			
			String arr[]=monthyear.split(" ");
			String mon =arr[0];
			String yr = arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else {
				driver.findElement(By.xpath("//div[@class='MuiPickersBasePicker-pickerView']//button[2]//span[1]//*[name()='svg']")).click();
			}
			
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//div[@class='MuiPickersBasePicker-container']//div"));
		
		for(WebElement ele:alldates) {
			String dt = ele.getText();
			if (dt.equals(date))
			{
				ele.click();
				break;
			}
			
		}
		
		        
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
		//30 min
		Thread.sleep(400);
		WebElement min = driver.findElement(By.xpath("//label[normalize-space()='30min']"));
		min.click();
		
		//4 Seats
		WebElement seats = driver.findElement(By.xpath("//label[normalize-space()='4 Seats']"));
		seats.click();
		Thread.sleep(500);
		WebElement Schedule_Meeting_Button = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
		Schedule_Meeting_Button.click();
		
		String actual_Text = "Meeting Details";
		String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Details']")).getText();
		Assert.assertEquals(actual_Text, exp_Text);
		
	}
	
	@Test
	public void tc7() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		
		WebElement  Delete_Meeting= driver.findElement(By.xpath("//div[@class='flexMinWidth jcFE']//div[1]//button[1]"));
		Delete_Meeting.click();
		
		WebElement  Confirm_Delete= driver.findElement(By.xpath("//span[normalize-space()='Yes']"));
		Confirm_Delete.click();
		
		String actual_Text = "My Meetings";
		String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='My Meetings']")).getText();
		Assert.assertEquals(actual_Text, exp_Text);
		
	}
	
}



