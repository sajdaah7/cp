package AdminSection;

import javax.swing.JSeparator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminSection<IWebELement> {
	
	
    static WebDriver driver;
   	static JavascriptExecutor jse;
   	

	public void setup() throws InterruptedException {

		System.getProperty("webdriver.gecko.driver", "//usr//bin//geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		//open site
		driver.get("https://globex.connectedportfolio.com/");	
		
		Thread.sleep(5000);
	
		//login
		driver.findElement(By.xpath("//*[@id=\"om-apprenticeship-login-wrapper\"]/div/div/div/div[2]/ul/li[1]/a")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("pravab");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hiup@123");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/div/input")).click();
		
		Thread.sleep(5000);
				
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    
	    //Click on more of programme section
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div/div[1]/div/div[2]/div/div[1]/div[2]/div/div[1]/div/a[2]")));
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/div[1]/div[2]/div/div[1]/div/a[2]")).click();
		
		Thread.sleep(5000);
		//AddProgramme
				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/div[1]/div/div/a")).click();
				driver.findElement(By.xpath("//*[@id=\"programName\"]")).sendKeys("Automation002");
				WebElement upload = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/form/div/div/div[2]/div/div/div[1]/div/input"));
				upload.sendKeys("/home/sajda/Downloads/bme9MbKrq77RuzdhK9sut9GwnBy6qKRFJSn6rBRs.jpegScreenshot-2019-05-01-at-21.25.19.jpg");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"programs-description\"]")).sendKeys("This is for automation testing");
				driver.findElement(By.xpath("//*[@id=\"has_weeks\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"weeks\"]")).sendKeys("5");
				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/form/div/button")).click();
				
				Thread.sleep(4000);
				//Click on Welcome Resource
				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/form/h4[2]/div/span/button[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"welcomeResourceName\"]")).sendKeys("WRN");
				driver.findElement(By.xpath("//*[@id=\"welcomeResourceDescription\"]")).sendKeys("This is for testing WRN.");
				driver.findElement(By.xpath("//*[@id=\"welcomeResourceLink\"]")).sendKeys("https://www.toolsqa.com/");
				
				WebElement uploadfile = driver.findElement(By.xpath("//*[@id=\"welcomeResourceDocument\"]"));				
				uploadfile.sendKeys("/home/sajda/Downloads/The Art of Questioning and Exploring.pdf");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*//*[@id=\"welcomeResourceVideo\"]")).click();
				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/form/div/div[5]/div/div/div[1]/div[2]/div/div[1]/input")).sendKeys("https://www.youtube.com/watch?v=1y6smkh6c-0&list=RD1y6smkh6c-0&start_radio=1");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
				
				
				//Click on add phase & create behaviour
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/form/h4[2]/div/span/button")).click();
				driver.findElement(By.xpath("//*[@id=\"week\"]")).sendKeys("1");
				driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("1");
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Behaviour");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[4]/div/div/div[2]/div[2]/div")).sendKeys("This is testing");
				WebElement elementToClick = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[8]/div/div/label[1]"));
				elementToClick.click();
				Thread.sleep(3000);
				//ScrollDown
				jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[8]/div/div/label[1]/span")).click();		
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"phaseScore\"]")).sendKeys("10.78");
				driver.findElement(By.xpath("//*[@id=\"duration\"]")).sendKeys("10");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[11]/div/div/div[1]/a/i")).click();
				Thread.sleep(10000);
				WebElement displayPopButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[13]/div/div/div[2]/form/div/div/button[1]"));
				displayPopButton.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[13]/div/div/div[3]/a")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
				
				
				//Clcik on add phase & off job training log
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/form/h4[2]/div/span/button")).click();
				driver.findElement(By.xpath("//*[@id=\"week\"]")).sendKeys("1");
				driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("1");
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Off Job Training Log ");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[4]/div/div/div[2]/div[2]/div")).sendKeys("This is for testing");
				//ScrollDown
				jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				WebElement elementToClick1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[8]/div/div/label[2]"));
				elementToClick1.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"phaseScore\"]")).sendKeys("4");
				driver.findElement(By.xpath("//*[@id=\"duration\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"duration\"]")).sendKeys("5");
				driver.findElement(By.xpath("//*[@id=\"holidays\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"holidays\"]")).sendKeys("10");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
				
				//Click on add phase & Qualification
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/form/h4[2]/div/span/button")).click();
				driver.findElement(By.xpath("//*[@id=\"week\"]")).sendKeys("1");
				driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("1");
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Qualification");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[4]/div/div/div[2]/div[2]/div")).sendKeys("This is for testing");
				//ScrollDown
				jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				WebElement elementToClick2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[8]/div/div/label[3]"));
				elementToClick2.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"phaseScore\"]")).sendKeys("12");
				driver.findElement(By.xpath("//*[@id=\"duration\"]")).sendKeys("10");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[11]/div/div/div/a/i")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"header\"]")).sendKeys("Q1");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("H1Q1");
				//driver.findElement(By.id("name")).sendKeys("H1Q1");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("This is for testing");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[12]/div/div/div[2]/form/div[4]/div/div/div[2]/input")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[12]/div/div/div[2]/form/div[4]/div/div[2]/div[1]/label/input")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[12]/div/div/div[2]/form/div[4]/div/div[2]/div[2]/label/input")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[12]/div/div/div[2]/form/div[4]/div/div[2]/div[3]/label/input")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/form/article/div/div[12]/div/div/div[3]/a")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
				
				
//				Thread.sleep(3000);
//				//Click on Publish
//				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/div[1]/ul/li[2]/div/div[4]/div/a[1]")).click();
//					//Click on No
//					driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[4]/div/div/div[3]/div/button[2]")).click();
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/div[1]/ul/li[2]/div/div[4]/div/a[1]")).click();
//					//Click on Yes
//					driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[4]/div/div/div[3]/div/button[1]")).click();
//				
//				Thread.sleep(5000);
//				//Click on Programme
//				driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/div[1]/ul[1]/li[9]/a")).click();
//				
//				Thread.sleep(5000);
//				//Click on edit
//				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/div[1]/ul/li[2]/div/div[4]/div/button")).click();
//				
//				Thread.sleep(3000);
//				//Click on Phase edit
//				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/div/div/div/div/form/div/div[3]/div[1]/button")).click();
//				
//					Thread.sleep(5000);
//					driver.findElement(By.xpath("//*[@id=\"week\"]")).sendKeys(Keys.BACK_SPACE);
//					driver.findElement(By.xpath("//*[@id=\"week\"]")).sendKeys("2");
//					driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys(Keys.BACK_SPACE);
//					driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("1");
//					driver.findElement(By.xpath("//*[@id=\"name\"]")).clear();
//					driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Test001");
//				
//					Thread.sleep(5000);
//					//ScrollDown
//					jse = (JavascriptExecutor)driver;
//					jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//			    
//					driver.findElement(By.xpath("//*[@id=\"phaseScore\"]")).clear();
//					driver.findElement(By.xpath("//*[@id=\"phaseScore\"]")).sendKeys("10");
//					driver.findElement(By.xpath("//*[@id=\"duration\"]")).clear();
//					driver.findElement(By.xpath("//*[@id=\"duration\"]")).sendKeys("10");
//			    
//					//Click on Save
//					driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
//			    
//			    Thread.sleep(3000);
//			    
//			    //Click on Programme
//			    driver.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/div[1]/ul[1]/li[9]/a")).click();
//			    
//			    Thread.sleep(3000);
//			    
//			    //Click on delete button
//			    driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/div[1]/ul/li[2]/div/div[4]/div/a")).click();
//			    	Thread.sleep(3000);
//			    	//Click on No
//			    	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[3]/div/div/div[3]/div/button[2]")).click();
//			    	Thread.sleep(3000);
//			    	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/div[1]/ul/li[2]/div/div[4]/div/a")).click();
//			    	//Click on Yes
//			    	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[3]/div/div/div[3]/div/button[1]")).click();
		
	}	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AdminSection admin = new AdminSection();
		AddProgramme a1 = new AddProgramme();
		admin.setup();
		a1.addProgramme(driver,jse);
}

}

