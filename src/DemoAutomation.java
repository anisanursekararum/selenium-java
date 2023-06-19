import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\browserdrivers\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\browserdrivers\\msedgedriver.exe");

		//FirefoxDriver driver = new FirefoxDriver();
		EdgeDriver driver = new EdgeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
