package cyber.Testing_First_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class youtube_music {

    public static void main(String[] args) throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("textarea[title='Search']")).sendKeys("YouTube" + Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("*[class='LC20lb MBeuO DKV0Md']")).click();
        Thread.sleep(4000);
        WebElement searchBar = driver.findElement(By.xpath("(//*[@id='search'])[3]"));
        Thread.sleep(3000);
        searchBar.click();
        searchBar.sendKeys("Eminem Lose Yourself" + Keys.ENTER);

        Thread.sleep(6000);
        driver.findElement(By.xpath("(//*[@class='yt-core-image yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded'])[1]")).click();

        WebElement expectedVideoTitle = driver.findElement(By.xpath("//a[contains(@title, 'Eminem - Lose Yourself [HD]')]"));
        String expected = expectedVideoTitle.getText();
        System.out.println(expected);

        String actualTextVideo = "Eminem - Lose Yourself [HD]";

        if (actualTextVideo.equals(expected)){
            System.out.println("\n===IT IS MATCHING WITH A VIDEO MUSIC NAME===");
        } else {
            System.out.println("===IT IS NOT MATCHING  WITH A VIDEO MUSIC NAME===");
        }

        Thread.sleep(6000);
        driver.quit();
    }
}
