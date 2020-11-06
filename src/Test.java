

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

	 WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prashanth\\Desktop\\jee-2020-09\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1500);
		driver.get("http:/www.gmail.com");
		System.out.println("hi");
		
		
      
	}
	
	

}
