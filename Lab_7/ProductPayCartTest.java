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
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ProductPayCartTest {
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
  public void productDetailsAmountIncreaseDecrease() throws InterruptedException {
    driver.get("https://practicesoftwaretesting.com/");
    driver.manage().window().setSize(new Dimension(1237, 750));
    {
      WebElement element = driver.findElement(By.cssSelector("*[data-test=\"nav-sign-in\"]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("*[data-test=\"nav-sign-in\"]")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("customer@practicesoftwaretesting.com");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("welcome01");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".st1:nth-child(4)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    Thread.sleep(5000);
    driver.findElement(By.cssSelector(".st1:nth-child(4)")).click();
    driver.findElement(By.cssSelector("*[data-test=\"nav-home\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".card:nth-child(9) .card-img-top")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".fa-plus")).click();
    driver.findElement(By.cssSelector(".fa-plus")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".fa-plus")).click();
    driver.findElement(By.cssSelector("*[data-test=\"decrease-quantity\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".nav-link > .fa")).click();
    Thread.sleep(3000);
    {
      WebElement element = driver.findElement(By.cssSelector("tbody .col-md-2:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("tbody .col-md-2:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("tbody .col-md-2:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("tbody > tr")).click();
    driver.findElement(By.cssSelector("aw-wizard-step:nth-child(1)")).click();
    driver.findElement(By.cssSelector("*[data-test=\"nav-home\"]")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("*[data-test=\"nav-home\"]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    js.executeScript("window.scrollTo(0,174)");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".card:nth-child(9) .card-img-top")).click();
    js.executeScript("window.scrollTo(0,36)");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("*[data-test=\"add-to-favorites\"]")).click();
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("*[data-test=\"nav-menu\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("*[data-test=\"nav-my-favorites\"]")).click();
    Thread.sleep(3000);
  }


  @Test
  public void addToCartAndCheckout() throws InterruptedException {
    driver.get("https://practicesoftwaretesting.com/");
    driver.manage().window().setSize(new Dimension(1237, 750));
    {
      WebElement element = driver.findElement(By.cssSelector("*[data-test=\"nav-sign-in\"]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("*[data-test=\"nav-sign-in\"]")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("customer@practicesoftwaretesting.com");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("welcome01");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".st1:nth-child(4)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    Thread.sleep(5000);
    driver.findElement(By.cssSelector(".st1:nth-child(4)")).click();
    driver.findElement(By.cssSelector("*[data-test=\"nav-home\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("2")).click();
    driver.findElement(By.cssSelector(".card:nth-child(3) .card-img-top")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".fa-plus")).click();
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart\"]")).click();
    {
      Thread.sleep(3000);
      WebElement element = driver.findElement(By.cssSelector("*[data-test=\"cart-quantity\"]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("*[data-test=\"cart-quantity\"]")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("*[data-test=\"proceed-1\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("*[data-test=\"proceed-2\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"address\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"address\"]")).sendKeys("Test street 98");
    driver.findElement(By.cssSelector("*[data-test=\"state\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"state\"]")).sendKeys("Vienna");
    driver.findElement(By.cssSelector("*[data-test=\"postcode\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"postcode\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"postcode\"]")).sendKeys("123");
    driver.findElement(By.cssSelector("*[data-test=\"proceed-3\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"payment-method\"]")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector("*[data-test=\"payment-method\"]"));
      dropdown.findElement(By.xpath("//option[. = 'Buy Now Pay Later']")).click();
    }
    driver.findElement(By.cssSelector("*[data-test=\"monthly_installments\"]")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector("*[data-test=\"monthly_installments\"]"));
      dropdown.findElement(By.xpath("//option[. = '6 monthly installments']")).click();
    }
    driver.findElement(By.cssSelector("*[data-test=\"finish\"]")).click();
    Thread.sleep(3000);
  }
}
