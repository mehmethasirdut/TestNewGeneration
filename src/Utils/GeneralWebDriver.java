package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class GeneralWebDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void BeforeClassWorks(){
        System.out.println("Driver Started");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        LoginTest();
    }

    @AfterClass
    public void AfterClassWorks(){
        System.out.println("Driver Stoped....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    void LoginTest(){
        WebElement inputEmail= driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("av.hasirdut@gmail.com");

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("asd123");

        WebElement loginBtn= driver.findElement(By.cssSelector("input[value='Login']"));
        loginBtn.click();
    }
}
