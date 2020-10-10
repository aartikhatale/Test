import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Yatra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		Thread.sleep(2000);
		WebElement returndate = driver
				.findElement(By.xpath("//input[@class='custom-date-input BE_flight_arrival_date']"));
		returndate.click();
		Thread.sleep(2000);

		WebElement rdate = driver.findElement(By.xpath("//td[@data-date='25/10/2020']"));
		rdate.click();
		WebElement arrow = driver.findElement(By.xpath("//i[@class='icon icon-angle-right arrowpassengerBox']"));
		arrow.click();

	}

}
