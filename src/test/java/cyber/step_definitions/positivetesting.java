package cyber.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.PendingException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class positivetesting {

    public static final WebDriver driver = new ChromeDriver();

    @Given("I'm opening Web-Site")
    public void startingTesting() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("I enter log in")
    public void log_in_stage() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("student" + Keys.ENTER);

    }

    @And("I enter password")
    public void password_entering() throws Exception{
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("Password123" + Keys.ENTER);

    }

    @Then("I click submit button")
    public void clicking_button(){
        driver.findElement(By.xpath("//*[@class='btn']")).click();

    }
}
