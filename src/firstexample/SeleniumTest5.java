package firstexample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.get("https://www.toolsqa.com/selenium-webdriver/xpath-in-selenium/");
		Driver.manage().window().maximize();
		//String input = "Algeria";
		WebElement table = Driver.findElement(By.id("//form[@id='booked_form']"));
		List<WebElement> tableRow = table.findElements(By.xpath(".//tr"));
		for (WebElement row : tableRow) {
			List<WebElement> tabledata = row.findElements(By.xpath(".//td"));
			for(WebElement data : tabledata) {
			     String value1 =  data.getAttribute("value");
			     System.out.println(value1);
		for(int i = 1; i<tableRow.size(); i++) {
			WebElement Row = tableRow.get(i);
			String country = Row.findElement(By.xpath("./td[2]/strong"))
					.getText();
			System.out.println(country);
			if(country.equals(input)) {
				Row.findElement(By.xpath("./td[1]/input")).click();
				break;	
				//*[@id="booked_form"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
				
			}
		

	}

}
}

