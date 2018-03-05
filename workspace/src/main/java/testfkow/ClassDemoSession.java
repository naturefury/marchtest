package testfkow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassDemoSession {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/e3020651/Downloads/chromedriver.exe");		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://fisglobal.fdbl.com/");
	system.printout.ln("thankyou")
	
	}

}
