package firstexample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumTest3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.get("https://www.instagram.com/accounts/login/");
		Driver.manage().window().maximize();
		WebElement Username =  Driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("anthony1302@gmail.com");
		Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sudha@1302");
		/*Driver.findElement(By.xpath("//input[@type='Submit']")).click();
		WebElement name =  Driver.findElement(By.xpath("//input[@class='input_show']"));
		String s = name.getAttribute("value");
		System.out.println(s);
		if(s.contains("Hello anthony1302!")) {
			System.out.println("your login id was correct ");
		}else {
			System.out.println("your login id is wrong");
		}
		WebElement drop = Driver.findElement(By.xpath("//select[@class='search_combobox']"));
		drop.click();
		Select drop1 = new Select(drop);
		drop1.selectByVisibleText("London");		
		String selected = drop1.getFirstSelectedOption().getText();
		System.out.println("the selected name is :" +selected);
		drop.click();
		List<WebElement> options = drop1.getOptions();
		for(WebElement E:options) {
			System.out.println(E.getText());
		}
		WebElement search = Driver.findElement(By.id("Submit"));
		search.click();
		WebElement select = Driver.findElement(By.id("radiobutton_1"));
		select.click();
		WebElement con = Driver.findElement(By.id("continue"));
		con.click();
		WebElement radio = Driver.findElement(By.id("total_days_dis"));
		//radio.click();
		System.out.println(radio.isEnabled());
	    Driver.findElement(By.id("first_name")).sendKeys("Anthony");
	    Driver.findElement(By.id("last_name")).sendKeys("Peter");
	    Driver.findElement(By.id("address")).sendKeys("No:75/62 Kannabiran koil street essa pallavaram chennai-600043");
	    Driver.findElement(By.id("cc_num")).sendKeys("1302290906080000");
	    WebElement card_name = Driver.findElement(By.id("cc_type"));
	    card_name.click();
	    Select drop2 = new Select(card_name);
	    drop2.selectByVisibleText("Master Card");
	    WebElement select_month = Driver.findElement(By.id("cc_exp_month"));
	    select_month.click();
	    Select drop3 = new Select(select_month);
	    drop3.selectByValue("2");
	    WebElement select_year = Driver.findElement(By.id("cc_exp_year"));
	    select_year.click();
	    Select drop4 = new Select(select_year);
	    drop4.selectByVisibleText("2022");
	    Driver.findElement(By.id("cc_cvv")).sendKeys("123");
	    WebElement Book_now = Driver.findElement(By.id("book_now"));
	    Book_now.click();
	    System.out.println("Booking done sucessufully");
	    WebElement order_no = Driver.findElement(By.id("order_no"));
	    String input = order_no.getAttribute("value");
	    System.out.println("The order Id is : " +input);
	    WebElement my_itinerary = Driver.findElement(By.id("my_itinerary"));
	    my_itinerary.click();
	    WebElement table = Driver.findElement(By.id("booked_form"));
	    List<WebElement> tablerow =  table.findElements(By.xpath("//form/table/tbody/tr[2]/td/table/tbody/tr[1]"));
	    for(int i=1; i<tablerow.size(); i++) {
	    	WebElement row = tablerow.get(i);
	    	String value =  row.findElement(By.xpath("//form/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/strong")).getAttribute("value");
	    	System.out.println(value);*/
	    	
	    	
	    }
	    
	    
	    	
	    	}
	    	
	    	
	   
	



