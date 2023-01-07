package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyBrowser {
	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe" );
		 
		 WebDriver driver = new ChromeDriver();
		
		 
		 FileInputStream fis = new FileInputStream("./src/test/resources/vtiger.properties");
		   Properties po = new Properties();
		    po.load(fis);
		    
		 String user =   po.getProperty("username");
		  String pass =  po.getProperty("password");
		 String ur =   po.getProperty("url");
		 
		 
		 driver.get(ur);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(user);
		 driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pass);
		 driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		 
		 driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		 driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
		 driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Tummapudi Rajesh");
		 driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		 driver.close();
		 
		   
	}

}
