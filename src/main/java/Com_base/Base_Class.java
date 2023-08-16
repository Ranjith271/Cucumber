package Com_base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Base_Class {
public static WebDriver driver; 
	
	public static WebDriver setproperty(String value) {
		if(value.equalsIgnoreCase("Chrome")) {
			  System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Ranjith\\eclipse-workspace\\CucumberAdactin\\Driver");
	          driver = new ChromeDriver();
		} else if(value.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver",
"C:\\Users\\s.vimalraj\\eclipse-workspace\\Adactin_Cucumber\\Driver\\chromedriver105.exe");
		      driver = new FirefoxDriver();
		} else if(value.equalsIgnoreCase("Internet explorer")) {
			  System.setProperty("webdriver.chrome.driver",
"C:\\Users\\s.vimalraj\\eclipse-workspace\\Adactin_Cucumber\\Driver\\chromedriver105.exe");
			  driver = new ChromeDriver();
		} else if(value.equalsIgnoreCase("Safari")) {
			  System.setProperty("webdriver.safari.driver",
"C:\\Users\\s.vimalraj\\eclipse-workspace\\Adactin_Cucumber\\Driver\\chromedriver105.exe");
			  driver = new SafariDriver();
	}
		driver.manage().window().maximize();
		return driver;
}
	// to go into specified url
	public static void launchUrl(String url) {
		driver.get(url);
}
	// to sendkeys
    public static void inputValue(WebElement element,String value) {
	    element.sendKeys(value);
}	
    // to click on element
    public static void clickOnElement(WebElement element) {
		element.click();
}
    // to close the current page
    public static void close() {
    	driver.close();
}
    // to clear the value
    public static void clear(WebElement element) {
    	element.clear();
    }
    // to get the text from the element
    public static void getText(WebElement element) {
    	String getText = element.getText();
    	System.out.println("Text of the Element : " + getText);
    }
    // isSelected
    public static void isSelected(WebElement element) {
    	boolean selected = element.isSelected();
    	System.out.println("Check whether the element is selected :"+selected);
    }
    //isEnabled
    public static void isEnabled(WebElement element) {
    	boolean enabled = element.isEnabled();
    	System.out.println("Check whether the element is enabled :"+enabled);
    }
    //isDisplayed
    public static boolean isDisplayed(WebElement element) {
    	return element.isDisplayed();
    } 
    // to quit browser
    public static void quit() {
    	driver.quit();
    }
    
    // to refresh
    public static void refresh() {
    	driver.navigate().refresh();
    }
    // to navigate to specified url
    public static void to(String url) {
    	driver.navigate().to(url);
    }
    //to go to previous page
    public static void back() {
    	driver.navigate().back();
    }
    // to go to next page
    public static void forward() {
    	driver.navigate().forward();
    }
    // to wait specific secs
    public static void thread(long sec) throws InterruptedException {
    	Thread.sleep(sec);
    }
    // to get current url
    public static void getCurrentUrl() {
    	String getUrl = driver.getCurrentUrl();
    	System.out.println("Current Url : " + getUrl);
    }
    // to get the title
    public static void getTitle() {
    	String title = driver.getTitle();
    	System.out.println("Title : " + title);
    }
    // to get the attribute
    public static void getAttribute(WebElement element, String value) {
    	String getAttribute = element.getAttribute(value);
    	System.out.println("Attribute : " + getAttribute);
    }
    // to take screenshot
    public static void takesScreenShot(String path) throws IOException {
    	TakesScreenshot screenshot = (TakesScreenshot) driver;
    	
    	File source = screenshot.getScreenshotAs(OutputType.FILE);
    	File dest = new File(path);

    	Files.copy(source,dest); // to use this we need commons.io
//    	FileHandler.copy(source, dest);  // use anyone method either fileutils or filehandler
    }
    // to accept in the alert box
    public static void accept() {
    	Alert ok = driver.switchTo().alert();
    	ok.accept();
    }
    // to cancel the alert box
    public static void dismiss() {
    	Alert cancel = driver.switchTo().alert();
    	cancel.dismiss();
    }
    // to enter text into prompt box
    public static void promptAlert(String text) {
    	Alert prompt = driver.switchTo().alert();
    	prompt.sendKeys(text);
    }
    // click using action
    public static void actionClick(WebElement element) {
    	Actions ac = new Actions(driver);
    	ac.click(element).build().perform();
    }
    // doubleClick
    public static void doubleClick(WebElement element) {
    	Actions ac = new Actions(driver);
    	ac.doubleClick(element).build().perform();
    }
    // contextClick or right ckick
    public static void contextClick(WebElement element) {
    	Actions ac = new Actions(driver);
    	ac.contextClick(element).build().perform();
    }
    // drag and drop // clickAndHold
    public static void dragAndDrop(WebElement dragelement, WebElement dropelement) {
    	Actions ac = new Actions(driver);
    	ac.dragAndDrop(dragelement, dropelement).build().perform();
    	//ac.clickAndHold(dragelement).moveToElement(dropelement).release(dropelement).build().perform();
        //using moveToElement
    }
    // to moveToElement will move the cursor to specific element
    public static void moveToElement(WebElement element) {
    	Actions ac = new Actions(driver);
    	ac.moveToElement(element);
    }
    // to open new tab using robot
    public static void newTab() throws AWTException {
    	Robot r = new Robot();
    	
    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.keyPress(KeyEvent.VK_TAB);

    	r.keyRelease(KeyEvent.VK_CONTROL);
    	r.keyRelease(KeyEvent.VK_TAB);
    }
    // pageDownKey using Robot
    public static void pageDownKey() throws AWTException {
        Robot r = new Robot();
	
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);  
	        // for again pagedown
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);  
    }    
    // clicking on option in webbrowser(eg:amazon)
    public static void optionRC() throws AWTException {
          Robot r = new Robot();
	  
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);  //1st option
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);  //2nd option
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);  //action performed
    }
	// to get the size of opened window in browser
    public static void windowSize() {
    	int size = driver.getWindowHandles().size();
    	System.out.println("Size of windows opened in browser : " + size);
    }
    // to get the id of parent window in browser
    public static void windowId() {
    	String parent_Id = driver.getWindowHandle();
    	System.out.println("Id of parent Window in browser : " + parent_Id);
    }
    // to get title of all windows
    public static void allTitleWindows() {
    	Set<String> allWindows = driver.getWindowHandles();
    	for (String all_Title : allWindows) {
    		String all_Title_Display = driver.switchTo().window(all_Title).getTitle();
			System.out.println("All Windows_Title : " + all_Title_Display);
		}
    }
    // to have only parent window by closing all other opened window
    public static void havingParentWindowOnly() throws InterruptedException {
    	Set<String> allWindows = driver.getWindowHandles();
    	String parent_Id = driver.getWindowHandle();
    	for (String not : allWindows) {
			if(!not.equals(parent_Id)) {
				Thread.sleep(3000);
				driver.switchTo().window(not);
				Thread.sleep(3000);
				driver.close();
			}
		}
    }
    // to scroll on the page using webelement
    public void scroll_page(WebElement element) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView()", element); // by using webelement
    	}
    // using js to perform click
    public static void js_Click(WebElement element) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("argument[0].click()", element);
    }
    // to select value from dropdown by selectByIndex
    public static void dropdown_ByIndex(WebElement element, int i) {
    	Select s = new Select(element);
    	s.selectByIndex(i);
    }
    // to select value from dropdown by selectByValue
    public static void dropdown_ByValue(WebElement element, String value) {
    	Select s = new Select(element);
    	s.selectByValue(value);
    }
    // to select value from dropdown by selectByVisibleText
    public static void dropdown_ByVisibleText(WebElement element, String text) {
    	Select s = new Select(element);
    	s.selectByVisibleText(text);
    }
    // to deselect value from dropdown by selectbyIndex
    public static void deselect_ByIndex(WebElement element, int i) {
    	Select s = new Select(element);
        s.deselectByIndex(i);
    }
    // to deselect value from dropdown by selectByValue
    public static void deselect_ByValue(WebElement element, String value) {
    	Select s = new Select(element);
    	s.deselectByValue(value);
    }
    // to deselect value from dropdown by selectByVisibleText
    public static void deselect_ByVisibleText(WebElement element, String text) {
    	Select s = new Select(element);
    	s.deselectByVisibleText(text);
    }
    // checking multiselect dropdown or not and multiselecting options in the dropdown
    public static void multiple_Select(WebElement element, int i, String value, String text) {
    	Select s1 = new Select(element);
    	
    	if(s1.isMultiple() == true) // checking whether the dropdown is multiple select
    	{
    		s1.selectByIndex(i);
    		s1.selectByValue(value);
    		s1.selectByVisibleText(text);
    	}
    }
   // checking multiselect dropdown or not and multideselecting options in the dropdown
    public static void multiple_Deselect(WebElement element, int i, String value, String text) {
    	Select s = new Select(element);
    	
    	if(s.isMultiple() == true) // checking whether the dropdown is multiple deselect
    	{
    		s.deselectByIndex(i);
    		s.deselectByValue(value);
    		s.deselectByVisibleText(text);
    	}
    }
    // to get all the selected options in the dropdown
    public static void getallSelectedOptions(WebElement element) {
    	Select s = new Select(element);
    	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
    	for (WebElement e : allSelectedOptions) {
    		System.out.println("AllSelectedOptions : " + e.getText());
			}
    }
    // to get first selected options from the dropdown
    public static void firstSelectedOption(WebElement element) {
    	Select s = new Select(element);
    	WebElement firstSelectedOption = s.getFirstSelectedOption();
        System.out.println("firstSelectedOption : " + firstSelectedOption.getText());
    }
    // to get options in the dropdown
    public static void getOptions(WebElement element) {
    	Select s = new Select(element);
    	List<WebElement> options = s.getOptions();
    	for (WebElement Element : options) {
			System.out.println("All options : " + Element.getText());
		}
    }
    // to get the size of the options in the dropdown
    public static void option_Size(WebElement element) {
    	Select s = new Select(element);
    	List<WebElement> options_Count = s.getOptions();
        int a = options_Count.size();
        System.out.println("No of Options : " + a);
       }
    // frames using index
    public static void frame_ByIndex(int i) {
    	driver.switchTo().frame(i);
    }
    // frames using Id or name
    public static void frame_ByIdorName(String value) {
    	driver.switchTo().frame(value);
    }
    // frames using webelement
    public static void frame_ByWebelement(WebElement element) {
    	driver.switchTo().frame(element);
    }
    // back to the window from frames
    public static void backToWindowFromFrames() {
    	driver.switchTo().defaultContent();
    }
    

}

