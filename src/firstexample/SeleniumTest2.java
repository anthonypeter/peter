package firstexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com/hovers");
		Driver.manage().window().maximize();
		WebElement profile = Driver.findElement(By.xpath("//div[@class= 'figure']/img"));
		Actions ac = new Actions(Driver);
		ac.moveToElement(profile).build().perform();
		ac.contextClick().build().perform();
		ac.contextClick(profile).build().perform();
	}
}
		/*username.sendKeys("anthony1302");
		String text = username.getAttribute("value");
		Driver.findElement(By.id("password")).sendKeys("sudha@1302");
		Driver.findElement(By.id("login")).click();
		WebElement welcome = Driver.findElement(By.id("username_show"));
		String s = welcome.getAttribute("value");
		//WebElement welcome = ("Hello"));
		if(s.contains("Hello anthony1302!")) {
			System.out.println("Sucess");
		
		}else {
			System.out.println("Fail");
		}
		
		
		WebElement date1 = Driver.findElement(By.id("datepick_in"));
		date1.clear();
		date1.sendKeys("16/12/2021");
		WebElement date2 = Driver.findElement(By.id("datepick_out"));
		date2.clear();
		date2.sendKeys("20/12/2021");
		
		

	}

}*/
