package org.Adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	
	private static final WebElement DdnSkills = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sundar\\eclipse-workspace\\Amazon\\driver\\chromedriver.exe");
		
       WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys("Sundarsmiley");
		
		WebElement txtpwd = driver.findElement(By.xpath("//input[@id='password']"));
		txtpwd.sendKeys("Sundar@1396");
		
		WebElement btnpress = driver.findElement(By.xpath("//input[@id='login']"));
		btnpress.click();
				
		WebElement dDnlocation = driver.findElement(By.id("location"));
	    Select select = new Select(dDnlocation);
	    select.selectByIndex(8);
	    
	    WebElement dDnhotel = driver.findElement(By.name("hotels"));
	    Select selecthotel = new Select(dDnhotel);
	    selecthotel.selectByIndex(2);
	    
	    WebElement dDnRoomtype = driver.findElement(By.id("room_type"));
	    Select selectroomtype = new Select(dDnRoomtype);
	    selectroomtype.selectByIndex(4);
	    

	    WebElement dDnRoomnos = driver.findElement(By.id("room_nos"));
	    Select selectroomnos = new Select(dDnRoomnos);
	    selectroomnos.selectByIndex(4);
	    
	    WebElement txtdatein = driver.findElement(By.id("datepick_in"));
		txtdatein.sendKeys("09/12/2021");
		
		  WebElement txtdateout = driver.findElement(By.id("datepick_out"));
			txtdateout.sendKeys("10/12/2021");
			
		    WebElement dDnperroom = driver.findElement(By.id("adult_room"));
		    Select selectperroom = new Select(dDnperroom);
		    selectperroom.selectByIndex(2);
		    

		    WebElement dDnperroom1 = driver.findElement(By.id("child_room"));
		    Select selectperroom1 = new Select(dDnperroom1);
		    selectperroom1.selectByIndex(1);
		    
		    
		    WebElement btnsearch = driver.findElement(By.id("Submit"));
		    btnsearch.click();
		    
		    WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		    radiobutton.click();
		    
		    WebElement ctn = driver.findElement(By.id("continue"));
		    ctn.click();
		    
		    WebElement txtfirstname = driver.findElement(By.id("first_name"));
			txtfirstname.sendKeys("Sundar");
			
			  WebElement txtlastname = driver.findElement(By.id("last_name"));
			  txtlastname.sendKeys("Smiley");
				
			  WebElement txtaddress = driver.findElement(By.id("address"));
			  txtaddress.sendKeys("chennai");
			  
			  WebElement txtcrno = driver.findElement(By.id("cc_num"));
			  txtcrno.sendKeys("3489726389129838");
			  

			    WebElement dDncrcard = driver.findElement(By.id("cc_type"));
			    Select selectpercrcard = new Select(dDncrcard);
			    selectpercrcard.selectByIndex(1);
			    
			    WebElement dDnexpmnth = driver.findElement(By.id("cc_exp_month"));
			    Select selectexpmnth = new Select(dDnexpmnth);
			    selectexpmnth.selectByIndex(1);
			    
			    WebElement dDnexpdate = driver.findElement(By.id("cc_exp_year"));
			    Select selectexpdate = new Select(dDnexpdate);
			    selectexpdate.selectByIndex(4);
			    
	       	    WebElement txtcvv = driver.findElement(By.id("cc_cvv"));
				  txtcvv.sendKeys("143");
			  
				 
				 
				  WebElement bknw = driver.findElement(By.id("book_now"));
				  bknw.click();
			
		    Thread.sleep(8000);
		    
		    
		 WebElement txtorderId = driver.findElement(By.id("order_no"));
		String data = txtorderId.getAttribute("value");
		 System.out.println(data);
					
		    
			
			
			
	    
	    
		
		
		
		
	}


		
	}


