package testpackage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackage.projectpage;

public class projecttest {
	WebDriver driver;
	
	@BeforeTest
	public void Setup() {
		
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void Url() {
		driver.get("https://internshala.com/");
	}
	
	@Test
	public void test() throws Exception {
		projectpage pg=new projectpage(driver);
		driver.manage().window().maximize();
		pg.Contentverification();
		pg.titleverifivation();
		pg.Logodisplay();
		pg.screenshot();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		pg.mousehover();
		pg.scrolldown();
		pg.Profile();
		pg.login();		
		pg.windowhandle();
		pg.Fileupload();
			
	
	}
}