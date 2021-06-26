package BeginnerCucumber;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class utilities implements Flipkarttinterface
{
    WebDriver driver;
    JavascriptExecutor j = (JavascriptExecutor)driver;
	public ArrayList <String> switchingwindows ( WebDriver driver )
	{
		Set <String> guid=driver.getWindowHandles ();
		ArrayList<String> tabs=new ArrayList<String>(guid);
		return tabs;
	}
	
	public void howerover (WebDriver driver ,WebElement target)
	{
	   this.driver=driver;
	   Actions action = new Actions(driver);
	   action.moveToElement(target).build().perform();
	       
	}
	
	public void scrolldown(WebDriver driver ,WebElement target)
	{
		j.executeScript("arguements[0].ScrollintoView(true)",target);
	}
	
}



