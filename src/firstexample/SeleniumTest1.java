package firstexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		//Driver.get("https://www.javatpoint.com/selenium-tutorial");
		//System.out.println("website has been open sucessfully");
		//String title=Driver.getTitle();
		//System.out.println("The tile of the website is :"+title);
		//String Url = Driver.getCurrentUrl();
		//System.out.println("The current Url is : " +Url);
		Driver.navigate().to("https://adactinhotelapp.com/");
		String title=Driver.getTitle();
		System.out.println("The tile of the website is :"+title);
		Driver.navigate().back();
		Driver.navigate().forward();
		Driver.navigate().refresh();
		Driver.close();
		Driver.findElement(By.name(title))
		

	}

}
package HomePageTest;

import HomePageObject.ShoppingSiteObject;

public class ShoppingSiteTest {
	ShoppingSiteObject shopping = new ShoppingSiteObject();
	//PopupSiteObject popup = new PopupObject();
	

 public void verifyEmail_id() {
	shopping.enterEmail_id("anthonypeter1302@gmail.com");
	
}
 
 public void verifyPopupMessage() {
	String msg = shopping.getPopupMessage();
	 
 }
}

package HomePageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingSiteObject  extends  BasePage {
	
	@FindBy(xpath = "//div[@id = 'block_top_menu']/ul/li[1]/a")
	private WebElement topMenuWomen;
	
	@FindBy(xpath = "//div[@id = 'block_top_menu']/ul/li[2]/a")
	private WebElement topMenuDresses;
	
	@FindBy(xpath = "//div[@id = 'block_top_menu']/ul/li[3]/a")
	private WebElement topMenuTshirt;
	
	@FindBy(id = "newsletter-input")
	private WebElement txtBoxEmail_Id;
	
	@FindBy(name = "submitNewsletter")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//div[@id= 'columns']/p")
	private WebElement txtpopupMessage;
	
	@FindBy(xpath = "//div[@id = 'block_top_menu']/ul/li[2]/a")
	private WebElement btnMenu;
	
	
	public ShoppingSiteObject() {
		PageFactory.initElements(driver, this);
	}
	public void enterEmail_id(String user ){
		setText(txtBoxEmail_Id,  user);
		
	}
	public void pressSubmitButton() {
		btnSubmit.click();
	}
	
	public String getPopupMessage() {
		return txtpopupMessage.getText();
	
	}
	
	public void clickTopMenuCategory() {
		btnMenu.click();
		
	}

}



