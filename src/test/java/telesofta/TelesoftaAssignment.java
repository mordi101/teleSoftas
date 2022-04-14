package telesofta;


import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TelesoftaAssignment {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		
		driver = new ChromeDriver();	
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		
	}
	
	@Test
	public void task2() throws InterruptedException {
		
		
		driver.get("http://the-internet.herokuapp.com/challenging_dom");
		
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for (int i = 0; i < 1; i++) {

			WebElement thirdRowDiceret = driver
					.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[3]/td[6]"));
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
					thirdRowDiceret);

			if (thirdRowDiceret.getAttribute("style") != null) {
				Thread.sleep(2000);
			}
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", thirdRowDiceret, "");

			WebElement deleteLink = driver
					.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[8]/td[7]/a[2]"));
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
					deleteLink);

			if (thirdRowDiceret.getAttribute("style") != null) {
				Thread.sleep(2000);
			}
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", deleteLink, "");

			WebElement editLink = driver
					.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[3]/td[7]/a[1]"));
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
					editLink);

			if (editLink.getAttribute("style") != null) {
				Thread.sleep(2000);
			}
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", editLink, "");

			WebElement definiebas7Data = driver
					.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[8]/td[4]"));
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
					definiebas7Data);

			WebElement Iuvaret7Data = driver
					.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[8]/td[1]"));
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
					Iuvaret7Data);

			if (Iuvaret7Data.getAttribute("style") != null) {
				Thread.sleep(2000);
			}
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", Iuvaret7Data, "");
		
		}
		
	}
		@Test
		public void task3() throws InterruptedException {
			
			driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
			
			
			//driver.findElement(By.xpath("//a[@class=\"button success\"]")).click();
			
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));
			System.out.println("Number of iframe: "+frames.size());
			
			
			//WebElement iframe = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
			//driver.switchTo().frame("globalSqa");
			//driver.switchTo().frame(3);
			
			//driver.findElement(By.cssSelector("div[class='single_tab_div resp-tab-content resp-tab-content-active'] a[class='close_img']")).click();
			driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='close_img']")).click();
			
			driver.switchTo().frame(2);
			
			//System.out.println("The number of picture in frames: "+pic_holder.size());
			
			//List<WebElement> pic_holder = driver.findElements(By.xpath("//div[@class='pic_holder']"));
			

			
			List<WebElement> pic_holder = driver.findElements(By.xpath("//div[@class='pic_holder']"));
			System.out.println("The number of picture in frames: "+pic_holder.size());

			
			driver.switchTo().defaultContent();
			
			
			
			//driver.findElement(By.xpath("//input[@id='s']")).sendKeys(pic_holder.size());
			
			
		}
	

	}
	
