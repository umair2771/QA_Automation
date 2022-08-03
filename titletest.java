import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titletest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\4128\\Downloads/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        String baseurl= "http://demo.guru99.com/test/newtours/";
        String expectedtitle="Welcome: Mercury Tours";
        String actualtitle;
        
        driver.get(baseurl);
        actualtitle=driver.getTitle();
        
        System.out.println("Title From Website "+ actualtitle);
        if(actualtitle.contentEquals(expectedtitle))
        {
        	
        	System.out.println("Test Passed Successfully !!! ");
        	
        }
        else
        {
        	
        	System.out.println("Test Failed !!! ");
        }
        
        driver.close();
	}

}
