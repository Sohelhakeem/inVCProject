package scripts;




import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class checkfirst extends BaseClass{
	@Test
	public void tc2() throws InterruptedException, IOException {
		
		
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys(p.getPropertyFiledata("mail_id"));
		
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys(p.getPropertyFiledata("password"));
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement  MyMeetig= driver.findElement(By.xpath("(//a[@class='anchorTxt'])[3]"));
			MyMeetig.click();
			
			Thread.sleep(2000);
			WebElement  clear_selection= driver.findElement(By.xpath("//div[@class='topActnBox']//button[@type='button']"));
			clear_selection.click();
					
			Select Month_drp = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/span[1]/span[1]/select[1]")));		
			Month_drp.selectByVisibleText("August");
			
			Thread.sleep(2000);

			Select Year_drp = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/span[1]/span[3]/select[1]")));		
			Year_drp.selectByVisibleText("2022");
			
			String date= "15";
			List<WebElement> alldates = driver.findElements(By.xpath("//div[@class='rdrDays']//button"));
			
			for(WebElement ele:alldates) {
				String dt = ele.getText();
				if (dt.equals(date))
				{
					ele.click();
					break;
				}
				
			}
			Thread.sleep(3000);
			
			}
			
	
	
	
	
	//verifying the meetings by selecting the past month in Calendar.
	@Test
	public void tc4() throws InterruptedException, IOException {
		
		
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys(p.getPropertyFiledata("mail_id"));
		
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys(p.getPropertyFiledata("password"));
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement  MyMeetig= driver.findElement(By.xpath("(//a[@class='anchorTxt'])[3]"));
			MyMeetig.click();
			
			Thread.sleep(2000);
			WebElement  clear_selection= driver.findElement(By.xpath("//div[@class='topActnBox']//button[@type='button']"));
			clear_selection.click();
					
			Select Month_drp = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/span[1]/span[1]/select[1]")));		
			Month_drp.selectByVisibleText("August");
			
			Thread.sleep(2000);

			Select Year_drp = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/span[1]/span[3]/select[1]")));		
			Year_drp.selectByVisibleText("2022");
			
			String date= "15";
			List<WebElement> alldates = driver.findElements(By.xpath("//div[@class='rdrDays']//button"));
			
			for(WebElement ele:alldates) {
				String dt = ele.getText();
				if (dt.equals(date))
				{
					ele.click();
					break;
				}
				
			}
			Thread.sleep(3000);
			
	}

}
	
	
   

		
		
		
		
		
	
		

