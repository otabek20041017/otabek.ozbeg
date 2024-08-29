package cyber.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class positiveJjajangmyeon {


    public static final WebDriver driver = new ChromeDriver();

    @Given("I'm opening first web site that has Korean dish")
    public void openingWebSite(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("jjajangmyeon" + Keys.ENTER);
    }


    @When("I click first web site it is showing Jjanmyeon")
    public void clickingFirstWebSite(){
        driver.findElement(By.xpath("(//*[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
    }

    @And("I get Web Title")
    public void getWebTitle(){
        String actualWebTitle = "Jjajangmyeon (Noodles in blackbean sauce) recipe by Maangchi";
        String expectedWebTitle = driver.getTitle();
        Assert.assertEquals(actualWebTitle, expectedWebTitle, "===== MATCHING IS FAILED =====");
    }

    @And("I get korean food's name by using getText")
    public void getTextName(){
        WebElement getTextName = driver.findElement(By.xpath("//h2[@class='entry-title entry-title mega-heading-translation']"));
        String actualTextName = "Jjajangmyeon 짜장면";
        String expectedTextName = getTextName.getText();
        Assert.assertEquals(actualTextName, expectedTextName, "======== MATCHING TEXTNAME IS FAILED =======");

    }

    @Then("I will end the test and close Web Browser")
    public void tearDown(){
        driver.quit();
    }




}
