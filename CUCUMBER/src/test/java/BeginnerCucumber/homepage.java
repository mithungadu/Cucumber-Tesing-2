package BeginnerCucumber;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage 
{
	WebDriver driver;
	utilities utilobject = new utilities ();
	
	
	@FindBy (xpath="//*[@name='email']")
	WebElement username;
	
	@FindBy ( xpath="//*[@id='pass']")
	WebElement password;
	
	@FindBy (xpath="//*[@name='login']")
    WebElement loginbutton;
	
	@FindBy (xpath="Mithun Chakravarthy")
    List<WebElement > profilename;	
	
	@FindBy(xpath="//span[text()='Mithun']")
	WebElement name;
	
	/*
	 * @FindBy(xpath="//div//input[@title='Search for products, brands and more']")
	 * WebElement searchbar;
	 * 
	 * @FindBy
	 * (xpath="//div[text()='NIKON D5600 DSLR Camera Body with Dual Lens: AF-P DX Nikkor 18 - 55 MM F/3.5-5.6G VR and 70-300 MM F/4...']"
	 * ) WebElement link1;
	 * 
	 * @FindBy (xpath="//div[text()='My Account']") WebElement myaccount;
	 * 
	 * @FindBy (xpath="//div[text()='Logout']") WebElement logout;
	 * 
	 * @FindBy ( tagName ="button") List<WebElement> intobutton;
	 * 
	 * @FindBy (xpath="//a[text()='About Us']") WebElement aboutus;
	 * 
	 * @FindBy (xpath = "//input[@placeholder='Search your orders here']")
	 * WebElement ordersearch;
	 * 
	 * @FindBy (xpath="//*[text()='Orders']") WebElement orders;
	 * 
	 * @FindBy (xpath = "//span[text()='Search Orders']") WebElement Searchbutton;
	 * 
	 * @FindBy (xpath="//div[contains(text(),'results found') ]") WebElement result;
	 * 
	 * @FindBy(xpath="//button[@type='submit']") WebElement searchnikon;
	 * 
	 * @FindBy ( xpath="xpath") WebElement
	 */
	
	public homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String unval, String pwdval) throws InterruptedException, AWTException
	{
		
		
		username.sendKeys(unval);
		password.sendKeys(pwdval);
		
		Robot robot = new Robot();
		////robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//Actions action = new Actions(driver); 
		//action.sendKeys(Keys.ENTER);
		
		loginbutton.click();
		Thread.sleep(5000);
		try {
			/*
			 * DesiredCapabilities cap=DesiredCapabilities.chrome();
			 * cap.acceptInsecureCerts();
			 */
	//	driver.switchTo().alert().accept();
		//Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		//Actions action = new Actions(driver); 
		//action. sendKeys(Keys.ESCAPE);	
		//profilename.get(9).click();
		name.click();
		Thread.sleep(3000);
	System.out.println();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void logincheck ()
	{
		String actual = name.getText();
		Assert.assertEquals(actual, "Mithun");
		System.out.println("kareenakapoora tanni can 30 roopa");
	}
	
	/*
	 * public void search ( String name1 ) throws InterruptedException {
	 * searchbar.sendKeys(name1); Thread.sleep(4000); //loginbutton.get(0).click();
	 * searchnikon.click(); }
	 * 
	 * public void openNikonlink () { link1.click();
	 * 
	 * ArrayList<String> tabs = utilobject.switchingwindows (driver);
	 * driver.switchTo().window(tabs.get(1)); }
	 * 
	 * public void logout(WebDriver driver) throws InterruptedException {
	 * 
	 * utilobject.howerover(driver, myaccount); Thread.sleep(2000);
	 * //utilobject.howerover(driver, logout); logout.click();
	 * 
	 * }
	 * 
	 * public void CloseLogin ( ) { intobutton.get(1).click(); }
	 * 
	 * public void clickandscreenshot () throws InterruptedException { //
	 * utilobject.scrolldown(driver, aboutus); // aboutus.click();
	 * 
	 * try { Thread.sleep(4000); File screenshot = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); FileUtils.copyFile(screenshot, new
	 * File("E:\\testing\\homePageScreenshot.png")); }
	 * 
	 * catch (IOException e) { System.out.println(e.getMessage()); }
	 * 
	 * }
	 * 
	 * 
	 * public void previousordercheck () throws InterruptedException { try {
	 * utilobject.howerover(driver, myaccount); Thread.sleep(2000);
	 * //utilobject.howerover(driver, logout); orders.click(); Thread.sleep(2000);
	 * ordersearch.sendKeys("Redmi Note 7S (Onyx Black, 64 GB)");
	 * Searchbutton.click(); Thread.sleep(4000); String actual = result.getText();
	 * System.out.println(actual);
	 * 
	 * Assert.assertEquals(actual, "1 results found");
	 * System.out.print("\n Yessss, it is presentuuu"); } catch(Exception e) {
	 * e.printStackTrace(); } }
	 */   
    
}


