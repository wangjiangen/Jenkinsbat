package openbaidu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class openbaidu {
	public static WebDriver driver;
	@Test
	public void youx() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.baidu.com");
	driver.findElement(By.id("kw")).sendKeys("51testing");
	driver.findElement(By.id("su")).click();
	}
}

