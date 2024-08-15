package cyber.Testing_First_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class testing_log_in {

    WebDriver driver;

        @BeforeMethod
                public void setUpMethod() throws Exception {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        @Test
             public void getStarted() throws Exception{
             Thread.sleep(3000);


             driver.get("https://practicetestautomation.com/practice-test-login/");
             Thread.sleep(3000);
             driver.findElement(By.id("username")).sendKeys("student" + Keys.ENTER);
             Thread.sleep(3000);
             driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password123");
             String expectedWebSiteTitle = driver.getTitle();
             String actualWebSiteTitle = "Test Login | Practice Test Automation";
             Assert.assertEquals(expectedWebSiteTitle, actualWebSiteTitle, "TITLE DIDN'T MATCH");
             Thread.sleep(3000);
             WebElement submitBtn = driver.findElement(By.xpath("//*[@id='submit']"));
             String submitExpectationText = submitBtn.getText();
             String submitActualText = "Submit";
             Thread.sleep(3000);
             submitBtn.click();
             Assert.assertEquals(submitExpectationText, submitActualText, "Submit button name is not matching to each other!");
             boolean finalUrlTitle = driver.getCurrentUrl().contains("logged-in-successfully");
             Assert.assertTrue(finalUrlTitle, "Title is not matching");

            System.out.println("First Logged in URL = " + expectedWebSiteTitle);
            System.out.println("Click Submit Text = " + submitExpectationText);
            System.out.println("Final URL = " + driver.getCurrentUrl());
    }

    @AfterMethod
        public void closingMethod(){
            driver.quit();
    }
}
