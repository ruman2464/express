package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Repo.DataStore;
import Repo.objectRepo;

public class Scenario {

	static WebDriver driver;

	public Scenario(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyHomePageLogo() {
		boolean result = Shared.verifyLogo(driver.findElement(By.xpath(objectRepo.veryflogo)));
		if (result == true) {
			System.out.println("element is present");
		} else {
			System.out.println("element is not present");
		}

	}

	public static void MenMenu() {
		Shared.clickOnAnyElements(driver.findElements(By.xpath(objectRepo.clickOnMenMenu)), DataStore.men);
	}

	public static void clickOnjeans() {
		Shared.verifyLogo(driver.findElement(By.xpath(objectRepo.selectjeans)));
		Shared.click(By.xpath(objectRepo.selectjeans));
	}

	public static void clickOnFirstJeans() {
		Shared.click(By.xpath(objectRepo.clickOnfirstJeans));
	}

	public static void verifyJeansName() {
		Shared.verifyLogo(driver.findElement(By.xpath(objectRepo.verifyJeansLogo)));
	}

	public static void jeansColour() {
		Shared.click(By.xpath(objectRepo.jeansColuor));
	}

	public static void jeansSize() {
		Shared.click(By.xpath(objectRepo.jeansWaist));
		Shared.click(By.xpath(objectRepo.jeansLength));
	}
//	public void jeansLenghth() {
//		Shared.click(By.xpath(objectRepo.jeansLength));
//	}

	public static void verifyAddToBag() {
		Shared.verifyLogo(driver.findElement(By.xpath(objectRepo.addToBagButton)));
	}

	public static void addToBag() {
		Shared.click(By.xpath("//button[text()='Add to Bag']"));
	}

	public static void viewBag() {
		Shared.click(By.xpath(objectRepo.view));
	}

	public static void checkOut() {
		Shared.click(By.xpath(objectRepo.check));
	}

	public static void clickSlimJeansFromNevBar() {
		// Shared.mouseOver(locator);
	}

	public static void clickOnMenSlimJeans() {
		Shared.mouseOver(objectRepo.menMenu);
		Shared.verifyLogo(driver.findElement(By.xpath(objectRepo.menSlimJeans)));
		Shared.click(By.xpath(objectRepo.menSlimJeans));
	}

	public static void selectQtyOfJeans() {
		Shared.selectElementFromWebElementList(objectRepo.itemQty, 2);
	}

}
