package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Shared { // extending a class with parameterized constructor // extends Scenario
//	public Shared(WebDriver driver) {  // you must bring super driver
//		super(driver);
//	}
//	public Shared() {
//		
//	}

	static WebDriver driver;

	public Shared(WebDriver driver) {
		this.driver = driver;
	}

	public static String getListText(String locator) {
		String text = driver.findElement(By.xpath(locator)).getText();
		return text;
	}

	public static void click(By locator) {
		driver.findElement(locator).click();
	}

	public static void typeOnAnyElement(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}

	public static boolean verifyLogo(WebElement ele) {
		return ele.isDisplayed();
	}

	public static void clickOnAnyElements(List<WebElement> ele, int men) {
		ele.get(men).click();
	}

	// actions Class
	public static void mouseOver(String locator) {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(locator));
		action.moveToElement(element).perform();
	}

	// Select Class
	public static void selectElementFromWebElementList(String locator, int num) {
		WebElement element = driver.findElement(By.xpath(locator));
		Select select = new Select(element);
		select.selectByIndex(num);
	}
}
