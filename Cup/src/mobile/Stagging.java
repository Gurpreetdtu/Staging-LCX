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

public class Stagging {

    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
       // C:\Users\Administrator\Downloads\chromedriver_win32 (4)\chromedriver_win32
       
        
     //   driver.get("https://tech-lcx.cloudflareaccess.com/cdn-cgi/access/login/accounts-staging-v3.lcx.com?kid=78bccb640987803622bc7e53f0821567d5cfc066cd2d3a54c742e8822e07183a&redirect_url=%2F%3FredirectPath%3D%252Fwallet%252Fwithdrawals&meta=eyJraWQiOiJhMDEzNjAzYTk1ZmUyYjU1YzllYWZlNGMwNTRjZmQ3YWQxNzlkYzIwZTJkNGFkOTI1MjljNmQ3YjA1YWNmNzJlIiwiYWxnIjoiUlMyNTYiLCJ0eXAiOiJKV1QifQ.eyJzZXJ2aWNlX3Rva2VuX3N0YXR1cyI6ZmFsc2UsImlhdCI6MTY4Nzk1Mzg3OSwic2VydmljZV90b2tlbl9pZCI6IiIsImF1ZCI6Ijc4YmNjYjY0MDk4NzgwMzYyMmJjN2U1M2YwODIxNTY3ZDVjZmMwNjZjZDJkM2E1NGM3NDJlODgyMmUwNzE4M2EiLCJob3N0bmFtZSI6ImFjY291bnRzLXN0YWdpbmctdjMubGN4LmNvbSIsImFwcF9zZXNzaW9uX2hhc2giOiJhNWYzMDYzY2VmMGMxNTkxZTA5YWM2M2NiZjdhMzgzNTc2Mzg4Yzg0OGM2YmM2NDhjMjg3MmUxZDM5ODQ2Zjk4IiwibmJmIjoxNjg3OTUzODc5LCJpc193YXJwIjpmYWxzZSwiaXNfZ2F0ZXdheSI6ZmFsc2UsInR5cGUiOiJtZXRhIiwicmVkaXJlY3RfdXJsIjoiXC8_cmVkaXJlY3RQYXRoPSUyRndhbGxldCUyRndpdGhkcmF3YWxzIiwibXRsc19hdXRoIjp7ImNlcnRfaXNzdWVyX3NraSI6IiIsImNlcnRfcHJlc2VudGVkIjpmYWxzZSwiY2VydF9zZXJpYWwiOiIiLCJjZXJ0X2lzc3Vlcl9kbiI6IiIsImF1dGhfc3RhdHVzIjoiTk9ORSJ9LCJhdXRoX3N0YXR1cyI6Ik5PTkUifQ.OZayNqR-MiFFdIWcdJ2BgpefezwIHZ-rWGCVisp9vqFSlv6YWq9YGrxTgVN61UpFNgi82Nnf14zWhx19ecDCAmX8y2DunQbLdF4tg8ulnT712QSYSi1JQiGAKdGsuxRew41JuPjpj7zplT4CsMZBluZ0Y2moqE4zlyPdd50cQiSvH4c1zCyGAVLtoTd0BDh-BYKCEsVSRXHWJzu1M-znNL80DVzwkTbXdRrjvfJoqweB4DfHSwpovI5HUf3lm0DeEu84lyMBCc61bh5U3Sk7-BCA8OgDxVJBqgZp8tJ2tqSga0FCmiQSLtfpKoQ3JRD57oZ3Gobd9Y0bQgcXQdsq1g");
        
       driver.get("https://accounts-staging-v3.lcx.com/");
      
           
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
       WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
      emailInput.sendKeys("gurpreet+1@lcx.com");
        
        Thread.sleep(1000);
//
      WebElement submitButton1 = driver.findElement(By.xpath("//*[@id=\"totp-form\"]/div[2]/button"));
      submitButton1.click();
      
     
      Thread.sleep(17000);

      driver.findElement(By.xpath("//*[@id=\"code-form\"]/div[2]/div/button")).click();
      
   
   
     driver.findElement(By.name("email")).sendKeys("gurpreet+8@lcx.com");
     
     driver.findElement(By.name("password")).sendKeys("Test@123");
     
Thread.sleep(3000);
      
    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div[3]/form/button")).click();
    
//    try {
//        Thread.sleep(1000);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }
    
    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div[1]/span[5]/a")).click();

    //Start exchange page
    
    
   driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div/div/div/div[1]/div[2]/div/table/tbody/tr[1]/td[6]/button")).click();
   
   Thread.sleep(1000);
   
   driver.findElement(By.xpath("//*[@id=\"onboardingTextModal\"]/div/div/div[2]/div[2]/div[3]/button[1]")).click();
   
   
   
   driver.findElement(By.name("buyBid")).sendKeys("3");
   
   driver.findElement(By.name("orderAmount")).sendKeys("10");
   
   driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();

 Thread.sleep(2000);

   //driver.findElement(By.name("buyBid")).sendKeys("3");

   driver.findElement(By.name("orderAmount")).sendKeys("11");

   driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();
   
   Thread.sleep(3000);
   
   driver.findElement(By.name("orderAmount")).sendKeys("10");  
   driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();

   Thread.sleep(3000);

   driver.findElement(By.name("orderAmount")).sendKeys("12");

   driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();

   Thread.sleep(3000);

   
   driver.findElement(By.name("orderAmount")).sendKeys("13");

   driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();
   
  Thread.sleep(3000);
  
  driver.findElement(By.name("orderAmount")).sendKeys("14");
  
 driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();
 
 Thread.sleep(3000);
 
  driver.findElement(By.name("orderAmount")).sendKeys("15");
  
  driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();
  
  Thread.sleep(3000);
  
   driver.findElement(By.name("orderAmount")).sendKeys("16");
   
 driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();
 
  Thread.sleep(2000);
  
  driver.findElement(By.name("orderAmount")).sendKeys("17");
  
  driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();
  
  Thread.sleep(3000);
  
   driver.findElement(By.name("orderAmount")).sendKeys("18");
   
  driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();
   
  Thread.sleep(3000);
  
   driver.findElement(By.name("orderAmount")).sendKeys("19");
   
  driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();
  
//  Thread.sleep(2000);
//  
//  driver.findElement(By.name("orderAmount")).sendKeys("20");
//  
//  driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();
//  
//   Thread.sleep(2000);
//   
//   driver.findElement(By.name("orderAmount")).sendKeys("21");
//   
//   driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();
//   
////   Thread.sleep(2000);
////   driver.findElement(By.name("orderAmount")).sendKeys("22");
////   driver.findElement(By.xpath("//*[@id=\"noanim-tab-example-tabpane-limit\"]/div[6]/button")).click();
////   
////    
//

  Thread.sleep(15000);
   driver.quit();
   
    
      
    }
}
