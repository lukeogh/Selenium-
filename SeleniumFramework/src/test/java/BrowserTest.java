import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	public static void main(String[] args) {

		String ProjectPath = System.getProperty("user.home");
		System.out.println("Project Path :"+ProjectPath);
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/Development/Downloads/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.selenium.dev");
		
	
	}

}
	