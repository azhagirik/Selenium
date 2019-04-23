/**
 * 
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * @author Homepage
 *
 */
public class HomePageobject extends Basepage {
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
private WebElement dresses;

@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
private WebElement women;

@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
private WebElement tshirts;

public HomePageobject()
{
PageFactory.initElements(driver, this);	

}



public WebElement getwomen() {
	return women;
}
public WebElement getdresses() {
	return dresses;}
	
	public WebElement gettshirts() {
		return tshirts;}
	
	
	public void clickwomen() 
	{
		women.click();
		
	}
		
	public void clickdresses() 
	{
		dresses.click();
		
	}
	
	public void clickTsirts() 
	{
		tshirts.click();
		
	}


}
