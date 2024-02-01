package mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

public class MobileNew {

    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        
       
        
        driver.get("https://accounts.lcx.com/buy_lcx");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        emailInput.sendKeys("gurpreetlcx1@gmail.com");

        
        
        Thread.sleep(1000);

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div[3]/form/div[2]/div/input"));
        passwordInput.sendKeys("Test@123");

      WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div[3]/form/button"));
      submitButton.click();
        
    
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div[3]/form/div[1]/div/div")).click();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div[3]/form/button")).click();

        //Start exchange page
        
       driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[6]/button")).click();
       
       driver.findElement(By.xpath("//*[@id=\"onboardingTextModal\"]/div/div/div[2]/div[2]/div[3]/button[1]")).click();
       
       
        
       


      
    }
}
