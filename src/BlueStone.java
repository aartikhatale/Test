import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Locate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"map-container mumbai\"]/descendant::a[text()='Get Direction']"))
				.click();
		Set<String> window = driver.getWindowHandles();
		for (String wind : window) {
			driver.switchTo().window(wind);
		}
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath(
				"//div[text()='Unit No-F19, First floor Inorbit Malad Mall, New Link Rd, Mumbai, Maharashtra 400064']"))
				.getText());

	}
}
