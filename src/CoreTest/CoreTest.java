package CoreTest;

import org.openqa.selenium.WebDriver;

import com.bit.test.OpenBrowser;

import utility.Scenario;
import utility.Shared;

public class CoreTest extends OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		OpenBrowser.Open();		
		Scenario x= new Scenario(driver);
		
		Shared z = new Shared(driver);
		
		x.verifyHomePageLogo();
		
		x.clickOnMenSlimJeans(); // doing mouse hover on the top menu using actions class
		Thread.sleep(5000);
		
		//x.MenMenu();
		//x.clickOnjeans();	
		//Thread.sleep(9000);
		x.clickOnFirstJeans();
		x.verifyJeansName();
		x.jeansSize();
		x.verifyAddToBag();
		x.addToBag();
		x.viewBag();
		x.selectQtyOfJeans();  // using select class
		x.checkOut();
		
		driver.close();
		driver.quit();
		

	}
}
