package locatorsprac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class locatorsprac {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\4128\\\\Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseurl="https://demo.guru99.com/test/newtours/";
		driver.get(baseurl);
		
	    WebElement username= driver.findElement(By.xpath("//input[contains(@name,'userName')]"));
	    WebElement password=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
	    WebElement submit=driver.findElement(By.xpath("//input[contains(@name,'submit')]"));
	    
	    username.sendKeys("tutorial");
	    password.sendKeys("tutorial");z
	    submit.click();
	    
			Thread.sleep(3000);

	    WebElement flights=driver.findElement(By.xpath("//a[contains(@href,'reservation.php')]"));
	    flights.click();
	    
	    
		
		
		
		
	}

}
