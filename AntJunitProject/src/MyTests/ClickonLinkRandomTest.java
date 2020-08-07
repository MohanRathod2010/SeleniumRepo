package MyTests;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ClickonLinkRandomTest {
	@Test
	public void clickOnRandomLink() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/LatestDrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //Actions -heps to simulate mouse movements - user gestures
		driver.get("https://www.americangolf.co.uk/");
WebElement golfClub=driver.findElement(By.xpath("//a[@class='a-level-1'][contains(text(),'Golf Clubs')]"));
Actions act=new Actions(driver);
act.moveToElement(golfClub).build().perform();
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6)); //6 seconds
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='CLUBS_1']//span[@class='name'][contains(text(),'Wedges')]")));
List<WebElement>golfclubsLinks=driver.findElements(By.xpath("//*[@id='CLUBS_1']/descendant::a"));
System.out.println(golfclubsLinks.size());

//click on random link
Random r=new Random();
int i=r.nextInt(golfclubsLinks.size());
golfclubsLinks.get(i).click();
}
}