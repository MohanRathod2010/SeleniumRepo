package MyTests;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InvestmentTest {
	@Test
	public void testWebTable() {
		String companyName="City Union Bank";
		System.setProperty("webdriver.chrome.driver", "D:/LatestDrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List <WebElement> companyNames=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println("Company names ->"+companyNames.size());
		
		List <WebElement> currentPrices=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Current Prices->"+currentPrices.size());
		
		for(int i=0;i<companyNames.size();i++) {
			if(companyName.equals(companyNames.get(i).getText())) {
			System.out.println(companyNames.get(i).getText()+" ---- "+currentPrices.get(i).getText());
			break;
		}
}}
}