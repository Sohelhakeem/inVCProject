package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_Edit_Schedule extends BaseClass{
	
	//ALL FEATURES OF SCHEDULE_MEETING INCLUDING RECURRING SCHEDULE.
	@Test
	public void tc1() throws InterruptedException, AWTException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		Thread.sleep(500);
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//div[@class='webAutoWidth']//button[@type='button']"));
		scheduleMeeting.click();
		
		WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		MeetingTitleTF.sendKeys("SCRUM MEETING");
		
		WebElement  Password_Enable_Button= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]/span[1]/span[1]/input[1]"));
		Password_Enable_Button.click();
		
		WebElement  Password_Enable_Button_TF= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		Password_Enable_Button_TF.sendKeys("Sohel@123");
		
		String year = "2023";
		String month = "January";
		String date = "10";
				
		WebElement date_Picker = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']"));//date picker opens
//		JavascriptExecutor js=  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", date_Picker);
		Thread.sleep(500);
		date_Picker.click();
		
		
		while(true) {
			String monthyear = driver.findElement(By.xpath("")).getText();
			String  arr[] = monthyear.split("");
			String mon = arr[0];
			String yr = arr[1];
			if(mon.equalsIgnoreCase(month)&&yr.equals(year))
				break;
			else {
				driver.findElement(By.xpath("")).click();
			}
		}
		List<WebElement> alldate = driver.findElements(By.xpath(""));
		for(WebElement ele:alldate ) {
			String dt = ele.getText();
			if(dt.equals(date)) 
			{
				ele.click();
				break;
			}
		}
		
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
		
		 Thread.sleep(500);
		WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
		Recuring_Schedule.click();
//		Thread.sleep(2000);
		
		 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
		 Thread.sleep(500);
		 
		//participant_Seats_drp_Down
			WebElement FREQUENCY_DD = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
			FREQUENCY_DD.click();
			js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
			Thread.sleep(500);
			
			//to SELECT yesrly FROM DROP DOWN
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(500);
			WebElement Repeat_Every = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]"));
			Repeat_Every.click();
			js.executeScript("arguments[0].scrollIntoView();", Repeat_Every);
			Thread.sleep(500);
			
			//to SELECT  3 YEAR FROM DROP DOWN
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(500);
			
			WebElement Occurance_Ends = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/input[1]"));
			Occurance_Ends.clear();
			Occurance_Ends.sendKeys("20");
		
			//selectslot 15 min
		 	WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 	js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
		 	Thread.sleep(500);
		 	selectslot_15.click();
			
			//select Custom Seats 
			WebElement  selectseats_Custom= driver.findElement(By.xpath("(//button[normalize-space()='Custom'])[2]"));
			selectseats_Custom.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
			
			//participant_Seats_drp_Down
			Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
			participant_drp.selectByVisibleText("6 Participant Seats");
			js.executeScript("arguments[0].scrollIntoView();", participant_drp);
			  
			  //Save_Button 
			  
			  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
			  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();", Save_Button);
			  
			  WebElement Advance_Btn=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]"));
			  Advance_Btn.click(); 
			  Thread.sleep(500);
			  Advance_Btn.click();
			  js.executeScript("arguments[0].scrollIntoView();",Advance_Btn);
			  Thread.sleep(500);
			  
			  Thread.sleep(500);
				WebElement Schedule_Meeting_Button = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
				Schedule_Meeting_Button.click();
				Thread.sleep(500);
				String actual_Text = "Meeting Details";
				String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Details']")).getText();
				Assert.assertEquals(actual_Text, exp_Text);
	}
	
	//Upcoming View Button
	@Test
	public void tc2() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		Thread.sleep(500);
		
		WebElement  View_Btn= driver.findElement(By.xpath("//div[@class='mtngActn']//div[2]//button[1]"));
		View_Btn.click();
		
		String actual_Text = "Meeting Details";
		String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Details']")).getText();
		Assert.assertEquals(actual_Text, exp_Text);
		
		
	}
	@Test
	public void tc3() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		Thread.sleep(500);
		
		WebElement  View_Btn= driver.findElement(By.xpath("//div[@class='mtngActn']//div[2]//button[1]"));
		View_Btn.click();
		
		WebElement  Edit_Btn= driver.findElement(By.xpath("//button[@class='textIconBtn']"));
		Edit_Btn.click();
		
		String actual_Text = "Meeting Title";
		String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Title']")).getText();
		Assert.assertEquals(actual_Text, exp_Text);
	}
	
	//Update_Meeting_Btn
	@Test
	public void tc4() throws InterruptedException, IOException {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
 		WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
		myMeetingLink.click();
		Thread.sleep(500);
		
		WebElement  View_Btn= driver.findElement(By.xpath("//div[@class='mtngActn']//div[2]//button[1]"));
		View_Btn.click();
		
		WebElement  Edit_Btn= driver.findElement(By.xpath("//button[@class='textIconBtn']"));
		Edit_Btn.click();
		Thread.sleep(500);
		 WebElement Update_Schedule =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
		 js.executeScript("arguments[0].scrollIntoView();",Update_Schedule);
		  Thread.sleep(500);
		  Update_Schedule.click(); 
//		  Thread.sleep(1000);
		  String actual_Text = "Meeting Details";
			String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Details']")).getText();
			Assert.assertEquals(actual_Text, exp_Text);
		
	}
		//Advance_Btn
		@Test
		public void tc5() throws InterruptedException, IOException {
			
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys(p.getPropertyFiledata("mail_id"));
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys(p.getPropertyFiledata("password"));
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
			myMeetingLink.click();
			Thread.sleep(500);
			
			WebElement  View_Btn= driver.findElement(By.xpath("//div[@class='mtngActn']//div[2]//button[1]"));
			View_Btn.click();
			
			WebElement  Edit_Btn= driver.findElement(By.xpath("//button[@class='textIconBtn']"));
			Edit_Btn.click();
			Thread.sleep(500);
			
			 WebElement Advance_Btn=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]"));
			 js.executeScript("arguments[0].scrollIntoView();",Advance_Btn);
			  Thread.sleep(500);
			  Advance_Btn.click(); 
		}
		//Time_Slot 15Min
		@Test
		public void tc6() throws InterruptedException, IOException {
			
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys(p.getPropertyFiledata("mail_id"));
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys(p.getPropertyFiledata("password"));
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
			myMeetingLink.click();
			Thread.sleep(500);
			
			WebElement  View_Btn= driver.findElement(By.xpath("//div[@class='mtngActn']//div[2]//button[1]"));
			View_Btn.click();
			
			WebElement  Edit_Btn= driver.findElement(By.xpath("//button[@class='textIconBtn']"));
			Edit_Btn.click();
			Thread.sleep(500);
			
			//selectslot 15 min
			 WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
			 js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
				Thread.sleep(500);
			 selectslot_15.click();
//				Thread.sleep(3000);
				
			
			 WebElement Advance_Btn=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]"));
			 js.executeScript("arguments[0].scrollIntoView();",Advance_Btn);
			  Thread.sleep(500);
			  Advance_Btn.click(); 
			  		
		
		}
		//Time_Slot 15Min
		@Test
		public void tc7() throws InterruptedException, IOException {
			
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys(p.getPropertyFiledata("mail_id"));
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys(p.getPropertyFiledata("password"));
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
			myMeetingLink.click();
			Thread.sleep(500);
			
			WebElement  View_Btn= driver.findElement(By.xpath("//div[@class='mtngActn']//div[2]//button[1]"));
			View_Btn.click();
			
			WebElement  Edit_Btn= driver.findElement(By.xpath("//button[@class='textIconBtn']"));
			Edit_Btn.click();
			Thread.sleep(500);
			
			//selectslot 15 min
			 WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
			 js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
				Thread.sleep(500);
			 selectslot_15.click();
				
			
			 WebElement Advance_Btn=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]"));
			 js.executeScript("arguments[0].scrollIntoView();",Advance_Btn);
			  Thread.sleep(500);
			  Advance_Btn.click(); 
			  
			//select Custom Seats 
				WebElement  selectseats_Custom= driver.findElement(By.xpath("(//button[normalize-space()='Custom'])[2]"));
				selectseats_Custom.click();
				js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
			  
			//participant_Seats_drp_Down 
			  Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
			  js.executeScript("arguments[0].scrollIntoView();", participant_drp);
			  Thread.sleep(500);
			  participant_drp.selectByVisibleText("6 Participant Seats");
			  
			  //Save_Button 
			  
			  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
			  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();",
			  Save_Button);
			  		
		
		}
		
		
				
		//Full Features
		@Test
		public void tc8() throws InterruptedException, AWTException, IOException {
			
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys(p.getPropertyFiledata("mail_id"));
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys(p.getPropertyFiledata("password"));
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			WebElement  myMeetingLink= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
			myMeetingLink.click();
			Thread.sleep(500);
			
			WebElement  View_Btn= driver.findElement(By.xpath("//div[@class='mtngActn']//div[2]//button[1]"));
			View_Btn.click();
			
			WebElement  Edit_Btn= driver.findElement(By.xpath("//button[@class='textIconBtn']"));
			Edit_Btn.click();
			Thread.sleep(500);
			
			  WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			  MeetingTitleTF.clear();
				MeetingTitleTF.sendKeys("SCRUM MEETING");
				
				WebElement  Password_Enable_Button= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]/span[1]/span[1]/input[1]"));
				Password_Enable_Button.click();
				Password_Enable_Button.click();
				WebElement  Password_Enable_Button_TF= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]"));
				Password_Enable_Button_TF.sendKeys("Sohel@123");				
				
				String year = "2024";
				String month = "January";
				String date = "10";
						
				WebElement date_Picker = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']"));//date picker opens
//				JavascriptExecutor js=  (JavascriptExecutor)driver;
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
			
				WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
				Recuring_Schedule.click();
				Recuring_Schedule.click();
				 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
				 Thread.sleep(500);
				 
				//participant_Seats_drp_Down
				 WebElement FREQUENCY_DD = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
					FREQUENCY_DD.click();
					js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
					Thread.sleep(500);
					
					//to SELECT yesrly FROM DROP DOWN
					
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
					
					Thread.sleep(1000);
					WebElement Repeat_Every = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]"));
					Repeat_Every.click();
					js.executeScript("arguments[0].scrollIntoView();", Repeat_Every);
					Thread.sleep(2000);
					
					//to SELECT  3 YEAR FROM DROP DOWN
					
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
					
					Thread.sleep(500);
					
					WebElement Occurance_Ends = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/input[1]"));
					Occurance_Ends.clear();
					Occurance_Ends.sendKeys("10");
				
					
					  //selectslot 15 min 
					WebElement selectslot_15=driver.findElement(By.xpath("//div[@class='radioGroup']"));
					  selectslot_15.click(); js.executeScript("arguments[0].scrollIntoView();",
					  selectslot_15); 
					  
					//select Custom Seats 
						WebElement  selectseats_Custom= driver.findElement(By.xpath("(//button[normalize-space()='Custom'])[2]"));
						selectseats_Custom.click();
						js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
					  
					  //participant_Seats_drp_Down 
					  Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
					  participant_drp.selectByVisibleText("100 Participant Seats");
					  js.executeScript("arguments[0].scrollIntoView();", participant_drp);
					  
					  //Save_Button 
					  
					  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
					  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();",Save_Button);
					  
					  WebElement Advance_Btn1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]"));
					  Advance_Btn1.click(); 
					  Thread.sleep(500);
					  Advance_Btn1.click();
					  js.executeScript("arguments[0].scrollIntoView();",Advance_Btn1);

					  WebElement Update_Schedule =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
						 js.executeScript("arguments[0].scrollIntoView();",Update_Schedule);
						  Thread.sleep(500);
						  Update_Schedule.click(); 
//						  Thread.sleep(1000);
						  String actual_Text = "Meeting Details";
							String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='Meeting Details']")).getText();
							Assert.assertEquals(actual_Text, exp_Text);
			  		
		
		}
		
		//Delete all recurring days completely
				@Test
				public void tc9() throws InterruptedException, AWTException, IOException {
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
					
					WebElement  Radio_Btn= driver.findElement(By.xpath("//input[@value='delAll']"));
					Radio_Btn.click();
					
					WebElement  Confirm_Delete= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
					Confirm_Delete.click();
					
					String actual_Text = "My Meetings";
					String exp_Text = driver.findElement(By.xpath("//h1[normalize-space()='My Meetings']")).getText();
					Assert.assertEquals(actual_Text, exp_Text);
					
				}

}
