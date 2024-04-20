// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FavoritePageTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void favoritePage() {
    driver.get("https://practicesoftwaretesting.com/#/auth/login");
    driver.manage().window().setSize(new Dimension(1236, 749));
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("customer@practicesoftwaretesting.com");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("welcome01");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"nav-favorites\"]")));
    driver.findElement(By.cssSelector("*[data-test=\"nav-favorites\"]")).click();
  }
}
