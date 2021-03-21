package com.practice.automation;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import org.openqa.selenium.JavascriptExecutor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.log.model.LogEntry;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
public class BasicFlowTest {
  private WebDriver driver;
  WebDriverWait wait;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  String username="a.tarigopula@gmail.com";
  String passwd="!EDm!k8D8Wfd5PK";
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    String url="http://automationpractice.com/index.php";
    driver.get(url);
    driver.manage().window().maximize();


    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    wait=new WebDriverWait(driver,20);

  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @SuppressWarnings("deprecation")
@Test
  public void test () throws InterruptedException {
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("email")).click();
    
    driver.findElement(By.id("passwd")).sendKeys(passwd);
    driver.findElement(By.id("email")).sendKeys(username);
    driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    driver.findElement(By.id("columns")).click();
    driver.findElement(By.linkText("Women")).click();

    driver.findElement(By.linkText("Pink (1)")).click();
    driver.findElement(By.cssSelector(".ajax_block_product:nth-child(5) .replace-2x")).click();
    
    //driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
    //driver.findElement(By.id("color_24")).click();
    driver.get("http://automationpractice.com/index.php?id_product=4&controller=product");
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='Pink']"))).click();

    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p#add_to_cart>button span"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[title='Continue shopping']>span"))).click();
    
    
    driver.findElement(By.linkText("Women")).click();
    driver.findElement(By.cssSelector(".products-block .btn > span")).click();
    driver.findElement(By.cssSelector(".product_list")).click();
    //new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[id='color_37']"))).click();
    
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='Yellow']"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p#add_to_cart>button span"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[title='Continue shopping']>span"))).click();
    
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='Black']"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p#add_to_cart>button span"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[title='Continue shopping']>span"))).click();
     
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='Orange']"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p#add_to_cart>button span"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[title='Continue shopping']>span"))).click();
     
    
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='Blue']"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p#add_to_cart>button span"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[title='Continue shopping']>span"))).click();
     

    driver.findElement(By.linkText("Dresses")).click();
    driver.findElement(By.id("selectProductSort")).click();
    {
      WebElement dropdown = driver.findElement(By.id("selectProductSort"));
      dropdown.findElement(By.xpath("//option[. = 'Price: Lowest first']")).click();
    }
    driver.findElement(By.cssSelector("option:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".top-pagination-content")).click();
    driver.findElement(By.id("selectProductSort")).click();
    {
      WebElement dropdown = driver.findElement(By.id("selectProductSort"));
      dropdown.findElement(By.xpath("//option[. = 'Price: Highest first']")).click();
    }
    driver.findElement(By.cssSelector("option:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".top-pagination-content")).click();
    driver.findElement(By.cssSelector(".top-pagination-content")).click();
    driver.findElement(By.cssSelector(".ajax_cart_quantity:nth-child(2)")).click();
    
    driver.findElement(By.linkText("Sign out")).click();

  }
  

}
