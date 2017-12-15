package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TC_001 {
	
//	public static ChromeDriver driver;
	public static WebDriver driver;
	
	@Test
	public void testcase1() {
		
		System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
//		InternetExplorerOptions opt = new InternetExplorerOptions();
//		opt.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//		opt.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
//		opt.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
//		ChromeDriver driver = new ChromeDriver();
//		driver.findElementById("email").sendKeys("Hello");
//		driver.findElementById("pass").sendKeys("Hello");
		
		driver = new InternetExplorerDriver(caps);
		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hello");
		driver.findElement(By.id("pass")).sendKeys("Hello");	

		driver.quit();
	}
}