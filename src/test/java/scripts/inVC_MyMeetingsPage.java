package scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_MyMeetingsPage  extends BaseClass{
	//Verifying the functionality of MyMeetig 
			@Test
			public void tc1() throws InterruptedException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				Thread.sleep(2000);
				
				WebElement  MyMeetig= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
				MyMeetig.click();
			
				
				String actualUrl="https://staging.invc.vc/new-meetings";
				String expectedUrl= driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl,actualUrl);
				
				}
			
	//Verifying inVC MyMeetings Page Elements.
			@Test
			public void tc2() throws InterruptedException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				Thread.sleep(1000);
				
				WebElement  MyMeetig= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
				MyMeetig.click();
				
				WebElement inVclogo = driver.findElement(By.xpath("(//a[@href='/meeting'])[2]"));
				inVclogo.isDisplayed();
			
				WebElement  MyMeetigtxt= driver.findElement(By.xpath("//h1[@class='mainHdngTxt']"));
				MyMeetigtxt.isDisplayed();
				
				WebElement  upcomingtxt= driver.findElement(By.xpath("//span[@class='MuiTab-wrapper']"));
				upcomingtxt.isDisplayed();
				
				WebElement  calendertxt= driver.findElement(By.xpath("//span[@class='MuiTab-wrapper']"));
				calendertxt.isDisplayed();
				
				WebElement  pastMeetingtxt= driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
				pastMeetingtxt.isDisplayed();
				
				WebElement  scheduleMeeetingBtn= driver.findElement(By.xpath("(//span[@class='MuiTouchRipple-root'])[3]"));
				scheduleMeeetingBtn.isDisplayed();
				
				WebElement  clearSelection = driver.findElement(By.xpath("(//span[@class='MuiTouchRipple-root'])[4]"));
				clearSelection.isDisplayed();
				
			}
			
	//Verifying functionality of inVC Calendar.
			@Test
			public void tc3() throws InterruptedException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				Thread.sleep(1000);
				

				WebElement  Calender= driver.findElement(By.xpath("//a[contains(text(),'Calendar')]"));
				Calender.click();
				
					Thread.sleep(500);	
				String exp_Txt="Calendar View";
				String act_Txt= driver.findElement(By.xpath("//h1[normalize-space()='Calendar View']")).getText();
				Assert.assertEquals(exp_Txt,act_Txt);
				
			}
			
	//Verifying functionality of inVC My meetings- (past meeting).
			@Test
			public void tc4() throws InterruptedException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				Thread.sleep(1000);
				

				WebElement  MyMeetig= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
				MyMeetig.click();
				
				WebElement  pastMeetingLink= driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
				pastMeetingLink.click();
				
					Thread.sleep(500);	
				String actualUrl="https://staging.invc.vc/new-meetings";
				String expectedUrl= driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl,actualUrl);
				
			}

			/*
			 * //Verifying functionality of inVC My meetings- (past meeting) - view Button.
			 * 
			 * @Test public void tc9() throws InterruptedException { WebElement
			 * username=driver.findElement(By.id("email"));
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
			 * 
			 * WebElement myMeetingLink=
			 * driver.findElement(By.xpath("(//a[@class='anchorTxt'])[3]"));
			 * myMeetingLink.click();
			 * 
			 * WebElement pastMeetingLink=
			 * driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
			 * pastMeetingLink.click();
			 * 
			 * WebElement viewbutton=
			 * driver.findElement(By.xpath("//SPAN[@CLASS='btnIconTxt mrgnLSm']"));
			 * viewbutton.click();
			 * 
			 * 
			 * 
			 * Thread.sleep(2000); String
			 * actualUrl="https://staging.invc.vc/new-meetings/6308a6bfe3b9854b914699a4";
			 * String expectedUrl= driver.getCurrentUrl();
			 * Assert.assertEquals(expectedUrl,actualUrl);
			 * 
			 * } //Verifying functionality of inVC My meetings- (past meeting) - view
			 * Button-chatHistory Button.
			 * 
			 * @Test public void tc10() throws InterruptedException { WebElement
			 * username=driver.findElement(By.id("email"));
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
			 * 
			 * WebElement myMeetingLink=
			 * driver.findElement(By.xpath("(//a[@class='anchorTxt'])[3]"));
			 * myMeetingLink.click();
			 * 
			 * WebElement pastMeetingLink=
			 * driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
			 * pastMeetingLink.click();
			 * 
			 * WebElement viewbutton=
			 * driver.findElement(By.xpath("//SPAN[@CLASS='btnIconTxt mrgnLSm']"));
			 * viewbutton.click();
			 * 
			 * WebElement chatHistorybutton=
			 * driver.findElement(By.xpath("//button[@class='resTabItemBtn']"));
			 * chatHistorybutton.click();
			 * 
			 * 
			 * Thread.sleep(2000); String
			 * actualUrl="https://staging.invc.vc/new-meetings/6308a6bfe3b9854b914699a4";
			 * String expectedUrl= driver.getCurrentUrl();
			 * Assert.assertEquals(expectedUrl,actualUrl);
			 * 
			 * } //Verifying functionality of inVC My meetings- (past meeting) - view
			 * Button- Recording Button.
			 * 
			 * @Test public void tc11() throws InterruptedException { WebElement
			 * username=driver.findElement(By.id("email"));
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
			 * 
			 * WebElement myMeetingLink=
			 * driver.findElement(By.xpath("(//a[@class='anchorTxt'])[3]"));
			 * myMeetingLink.click();
			 * 
			 * WebElement pastMeetingLink=
			 * driver.findElement(By.xpath("(//span[@class='MuiTab-wrapper'])[2]"));
			 * pastMeetingLink.click();
			 * 
			 * WebElement viewbutton=
			 * driver.findElement(By.xpath("//SPAN[@CLASS='btnIconTxt mrgnLSm']"));
			 * viewbutton.click();
			 * 
			 * WebElement recordingsButton=
			 * driver.findElement(By.xpath("(//button[@class='resTabItemBtn'])[2]"));
			 * recordingsButton.click();
			 * 
			 * 
			 * 
			 * Thread.sleep(3000); String
			 * actualUrl="https://staging.invc.vc/new-meetings/6308a6bfe3b9854b914699a4";
			 * String expectedUrl= driver.getCurrentUrl();
			 * Assert.assertEquals(expectedUrl,actualUrl);
			 * 
			 * }
			 */
			//Verifying functionality of inVC My meetings- (past meeting) - schedule Meeting.
			@Test
			public void tc5() throws InterruptedException, AWTException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				Thread.sleep(1000);
				
				WebElement  MyMeetig= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
				MyMeetig.click();
				
				Thread.sleep(500);
				
				WebElement  scheduleMeeting= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[1]/div/div[2]/div[3]/button"));
				scheduleMeeting.click();
				
					//Thread.sleep(3000);	
				String actualUrl="https://staging.invc.vc/schedule-meeting";
				String expectedUrl= driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl,actualUrl);
				
			}
			//Verifying functionality of inVC My meetings- (past meeting) - schedule Meeting- MEeting Title.
			@Test
			public void tc6() throws InterruptedException, AWTException, IOException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys(p.getPropertyFiledata("mail_id"));
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys(p.getPropertyFiledata("password"));
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				Thread.sleep(1000);
				
				WebElement  MyMeetig= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
				MyMeetig.click();
				
				Thread.sleep(500);
				
				WebElement  scheduleMeeting= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[1]/div/div[2]/div[3]/button"));
				scheduleMeeting.click();
				Thread.sleep(500);
				
				WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
				MeetingTitleTF.sendKeys("SCRUM MEETING");
				
					//Thread.sleep(3000);	
				String actualUrl="https://staging.invc.vc/schedule-meeting";
				String expectedUrl= driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl,actualUrl);
				
			}
			//Verifying functionality of inVC My meetings- schedule Meeting - inVCPRo
			@Test
			public void tc7() throws InterruptedException, AWTException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				Thread.sleep(1000);
				
				WebElement  MyMeetig= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
				MyMeetig.click();
				
				Thread.sleep(500);
				
				WebElement  scheduleMeeting= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[1]/div/div[2]/div[3]/button"));
				scheduleMeeting.click();
				
				WebElement  invcPRO= driver.findElement(By.xpath("//div[@class='hrztlTabItem ']"));
				invcPRO.click();
				
					//Thread.sleep(3000);	
				String actualUrl="https://staging.invc.vc/schedule-meeting";
				String expectedUrl= driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl,actualUrl);
				
			}
			//Verifying functionality of inVC My meetings- clear Selection.
			@Test
			public void tc8() throws InterruptedException, AWTException {
				WebElement username=driver.findElement(By.id("email"));
				username.sendKeys("sohel@peoplelinkvc.com");
				
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("Hyderabad@123");
				
				WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				login.click();
				
				Thread.sleep(1000);
				
				WebElement  MyMeetig= driver.findElement(By.xpath("//a[contains(text(),'My Meetings')]"));
				MyMeetig.click();
				
				Thread.sleep(500);
				
				WebElement  clearSelection= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div[2]/div/div[1]/button"));
				clearSelection.click();
				
				
					///Thread.sleep(3000);	
				String actualUrl="https://staging.invc.vc/new-meetings";
				String expectedUrl= driver.getCurrentUrl();
				Assert.assertEquals(expectedUrl,actualUrl);
				
			}
			
			
			
}
