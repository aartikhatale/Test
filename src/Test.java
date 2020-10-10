import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions a = new Actions(driver);
		Thread.sleep(4000);
		a.doubleClick(button).perform();
		Thread.sleep(4000);
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(2000);
		driver.quit();

	}

}
