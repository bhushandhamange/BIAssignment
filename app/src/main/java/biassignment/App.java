/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package biassignment;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(new App().getGreeting());

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver(options);
				
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		Thread.sleep(5000);
		// WebElement searchBox = driver.findElement(By.xpath("(//input)[1]"));
		// searchBox.clear();
		// searchBox.sendKeys("Running Shoes");
		// Thread.sleep(3000);
		// WebElement sizeChartButton = driver.findElement(By.xpath("(//button[text()='Size chart'])[1]"));
		// sizeChartButton.click();
		
		// List<WebElement> headers = driver.findElements(By.xpath("//table/thead/tr/th"));
		
		// for(WebElement head: headers) {
		// 	System.out.println(head.getText());
		// }
		
		//driver.close();
		driver.quit();
    }
}
