import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_tips']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class=\"overlayTip visible outside\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[text()='submit timesheet for approval']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[text()='register leave time']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[text()='track time with comments']")).getText());
		driver.quit();
	}

}
