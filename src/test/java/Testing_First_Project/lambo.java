package Testing_First_Project;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.naming.Name;
import java.util.concurrent.TimeUnit;

public class lambo {


    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com");


        WebElement searchBox = driver.findElement(By.xpath("//*[@title='Search']"));

       searchBox.sendKeys("Lamborghini" + Keys.ENTER);

       driver.findElement(By.xpath("//*[@class='LC20lb MBeuO DKV0Md']")).click();
       Thread.sleep(4000);
       driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();



       Thread.sleep(6000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i <= 4700; i += 7) {
            js.executeScript("window.scrollTo(0," + i + ")");
        }

        Thread.sleep(5000);

        String titleName = "Automobili Lamborghini - Official Website | Lamborghini.com";
        String title = driver.getTitle();
        if(title.equals(titleName)) {
            System.out.println("==========TEST PASSED==========");
        } else {
            System.out.println("==========TEST FAILED==========");
        }



        Thread.sleep(5000);
        driver.quit();
    }
}
