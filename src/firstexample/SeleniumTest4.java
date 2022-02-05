package firstexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.get("https://adactinhotelapp.com/");
		Driver.manage().window().maximize();
		WebElement New_reg = Driver.findElement(By.className("login_register"));
		New_reg.click();
		Driver.findElement(By.id("username")).sendKeys("anthony");
		Driver.findElement(By.id("password")).sendKeys("sudha@1302");
		Driver.findElement(By.id("re_password")).sendKeys("sudha@1302");
		Driver.findElement(By.id("full_name")).sendKeys("Anthony Peter Lawrence");
		Driver.findElement(By.id("email_add")).sendKeys("anthonypeter1302@gmail.com");
		WebElement Image = Driver.findElement(By.xpath("img"));
		//String s1 = Image.getAttribute("value");
		//System.out.println(s1);
		Driver.findElement(By.id("captcha-form")).sendKeys("src");
		

	}

}
